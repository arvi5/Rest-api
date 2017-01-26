package RESTAPI.Restmodule.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import RESTAPI.Restmodule.Entities.Domain;
@Repository
public class DomainRepositoryImpl implements DomainRepository {

	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Domain> getAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getAllTvseries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Domain getMovieById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Domain getTvseriesById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getDomainByYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getDomainByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getDomainByImdbRatings(float imdbratings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domain> getDomainByImdbVotes(int imdbvotes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Domain createDomain(Domain domain) {
		em.persist(domain);
		return domain;
	}

	@Override
	public Domain updateDomain(long id, Domain domain) {
		return em.merge(domain);
	}

	@Override
	public void deleteDomainById(long id) {
		Domain dom = em.find(Domain.class, id);
		em.remove(dom);
	}

	@Override
	public void deleteAllDomains() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Domain findById(long id) {
		return em.find(Domain.class, id);
	}

}
