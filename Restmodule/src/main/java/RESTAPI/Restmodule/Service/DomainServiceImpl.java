package RESTAPI.Restmodule.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RESTAPI.Restmodule.Entities.Domain;
import RESTAPI.Restmodule.Exception.BadRequestException;
import RESTAPI.Restmodule.Exception.UserNotFoundException;
import RESTAPI.Restmodule.Repository.DomainRepository;
@Service
public class DomainServiceImpl implements DomainService {
	@Autowired
	DomainRepository domainRepository;
	@Override
	public List<Domain> findAllMovies() {
		return domainRepository.getAllMovies();
	}

	@Override
	public List<Domain> findAllTvseries() {
		return domainRepository.getAllTvseries();
	}

	@Override
	public Domain findMovieById(long id) {
		Domain d = domainRepository.getMovieById(id);
		if(d==null){
			throw new UserNotFoundException("Movie not found");
		}
		return d;
	}

	@Override
	public Domain findTvseriesById(long id) {
		Domain d = domainRepository.getTvseriesById(id);
		if(d==null){
			throw new UserNotFoundException("Tvseries not found");
		}
		return d;
	}

	@Override
	public List<Domain> findDomainByYear(int year) {
		return domainRepository.getDomainByYear(year);
	}

	@Override
	public List<Domain> findDomainByGenre(String genre) {
		return domainRepository.getDomainByGenre(genre);
	}

	@Override
	public List<Domain> findByImdbRatings(float imdbratings) {
		return domainRepository.getDomainByImdbRatings(imdbratings);
	}

	@Override
	public List<Domain> findByImdbVotes(int imdbvotes) {
		return domainRepository.getDomainByImdbVotes(imdbvotes);
	}

	@Override
	public Domain createDomain(Domain domain) {
		Domain exists = domainRepository.findById(domain.getId());
		if (exists != null) {
			throw new BadRequestException("domain with the id already exists");
		}
		return domainRepository.createDomain(domain);
	}

	@Override
	public Domain updateDomain(long id, Domain domain) {
		Domain exists = domainRepository.findById(id);
		if (exists == null) {
			throw new UserNotFoundException("domain does not exist");
		}
		return domainRepository.updateDomain(id, domain);
	}

	@Override
	public void deleteDomainById(long id) {
		Domain exists = domainRepository.findById(id);
		if (exists == null) {
			throw new UserNotFoundException("domain does not exist");
		}
		else domainRepository.deleteDomainById(id);
	}

	@Override
	public void deleteAllDomains() {
		domainRepository.deleteAllDomains();
	}

}
