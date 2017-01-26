package RESTAPI.Restmodule.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import RESTAPI.Restmodule.Entities.User;
@Repository
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager em;
	public List<User> findAllUsers() {
		TypedQuery<User> query = em.createNamedQuery("User.findall", User.class);
		return query.getResultList();
	}

	public User findById(long id) {
		
		return em.find(User.class, id);
	}

	public User findByEmail(String email) {
		TypedQuery<User> query = em.createNamedQuery("User.findbyEmail", User.class);
		query.setParameter("pemail", email);
		List<User> u = query.getResultList();
		if(u!= null && u.size()==1){
			return u.get(0);
		}
		else{
		return null;}
	}

	public User createUser(User user) {
		em.persist(user);
		return user;
	}

	public User updateUser(long id, User user) {
		return em.merge(user);
	}

	public void deleteUserById(long id) {
		User user= em.find(User.class,id);
		 em.remove(user);
	}

	public void deleteAllUsers() {
		TypedQuery<User> query = em.createNamedQuery("User.findall", User.class);
		List<User> q = query.getResultList(); 		
		for(User u : q)
			 em.remove(u);
			
	}

}
