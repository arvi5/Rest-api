package RESTAPI.Restmodule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import RESTAPI.Restmodule.Entities.Domain;
import RESTAPI.Restmodule.Service.DomainService;


@RestController

public class DomainController {
	@Autowired
	DomainService domainService;
	
	@RequestMapping(value = "movies", method = RequestMethod.GET)
	public List<Domain> getAllMovies() {
		return domainService.findAllMovies();

	}
	@RequestMapping(value = "Tvseries",method = RequestMethod.GET)
	public List<Domain> getAllTvseries() {
		return domainService.findAllTvseries();

	}
	
	@RequestMapping(value = "type", method = RequestMethod.GET)
	public List<Domain> getDomainByType(@PathVariable("type") String type) {
		if(type=="movies")
		return domainService.findAllMovies();
		else if (type == "Tvseries")
		return domainService.findAllTvseries();
		else
			return null;


	}
	@RequestMapping(value = "movie/{id}", method = RequestMethod.GET)
	public Domain getMovieById(@PathVariable("id") long id) {
		return domainService.findMovieById(id);

	}
	@RequestMapping(value = "Tvseries/{id}", method = RequestMethod.GET)
	public Domain getTvseriesById(@PathVariable("id") long id) {
		return domainService.findTvseriesById(id);

	}
	@RequestMapping(value = "domain/{year}", method = RequestMethod.GET)
	public List<Domain> getDomainByYear(@PathVariable("year") int year) {
		return domainService.findDomainByYear(year);

	}

	@RequestMapping(value = "domain/{genre}", method = RequestMethod.GET)
	public List<Domain> getDomainByGenre(@PathVariable("genre") String genre) {
		return domainService.findDomainByGenre(genre);

	}
	
	@RequestMapping(value = "domain/{imdbratings}", method = RequestMethod.GET)
	public List<Domain> getByImdbRatings(@PathVariable("id") float imdbratings) {
		return domainService.findByImdbRatings(imdbratings);

	}
	
	@RequestMapping(value = "domain/{imdbvotes}", method = RequestMethod.GET)
	public List<Domain> getByImdbVotes(@PathVariable("id") int imdbvotes) {
		return domainService.findByImdbVotes(imdbvotes);

	}
	@RequestMapping(value="domain/",method = RequestMethod.POST)
	public Domain createDomain(@RequestBody Domain domain) {

		return domainService.createDomain(domain);

	}
	
	@RequestMapping(value = "domain/{id}", method = RequestMethod.PUT)
	public Domain updateDomain(@PathVariable("id") long id, @RequestBody Domain domain) {
		return domainService.updateDomain(id, domain);

	}

	@RequestMapping(value = "domain/{id}", method = RequestMethod.DELETE)
	public void deleteDomainById(@PathVariable("id") long id) {
		domainService.deleteDomainById(id);

	}

	@RequestMapping(value="domain/",method = RequestMethod.DELETE)
	public void deleteAllDomains() {
		domainService.deleteAllDomains();

	}

}
