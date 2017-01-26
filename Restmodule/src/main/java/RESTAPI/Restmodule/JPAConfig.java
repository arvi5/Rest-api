package RESTAPI.Restmodule;

import java.util.Properties;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JPAConfig {
	
	Environment env;
	@Bean
	public LocalContainerEntityManagerFactoryBean createEMF() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPackagesToScan("RESTAPI.Restmodule.Entities");
		emf.setDataSource(datasource());
		emf.setJpaProperties(jpaProperties());
		return emf;

	}
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/example-db?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;

	}
	
	public PlatformTransactionManager txnMgr(EntityManagerFactory emf){
		JpaTransactionManager txnMgr = new JpaTransactionManager();
		return txnMgr;
	}
	private Properties jpaProperties(){
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "create");
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		prop.setProperty("hibernate.show_sql" ,"true");
		return prop;
		
		
	}
}
