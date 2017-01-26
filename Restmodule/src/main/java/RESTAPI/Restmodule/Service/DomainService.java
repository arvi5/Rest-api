package RESTAPI.Restmodule.Service;

import java.util.List;

import RESTAPI.Restmodule.Entities.Domain;


public interface DomainService {

	List<Domain> findAllMovies();

	List<Domain> findAllTvseries();

	Domain findMovieById(long id);

	Domain findTvseriesById(long id);

	List<Domain> findDomainByYear(int year);

	List<Domain> findDomainByGenre(String genre);

	List<Domain> findByImdbRatings(float imdbratings);

	List<Domain> findByImdbVotes(int imdbvotes);

	Domain createDomain(Domain domain);

	Domain updateDomain(long id, Domain domain);

	void deleteDomainById(long id);

	void  deleteAllDomains();

}
