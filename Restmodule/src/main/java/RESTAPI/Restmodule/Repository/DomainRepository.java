package RESTAPI.Restmodule.Repository;

import java.util.List;

import RESTAPI.Restmodule.Entities.Domain;


public interface DomainRepository {

	List<Domain> getAllMovies();

	List<Domain> getAllTvseries();

	Domain getMovieById(long id);

	Domain getTvseriesById(long id);

	List<Domain> getDomainByYear(int year);

	List<Domain> getDomainByGenre(String genre);

	List<Domain> getDomainByImdbRatings(float imdbratings);

	List<Domain> getDomainByImdbVotes(int imdbvotes);

	Domain createDomain(Domain domain);

	Domain updateDomain(long id, Domain domain);

	void deleteDomainById(long id);

	void deleteAllDomains();
	
	Domain findById(long id);

}
