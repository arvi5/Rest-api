package RESTAPI.Restmodule.Entities;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Domain {
	@Id
	@GeneratedValue
	int id;
	String title;
	 Year year;
	 String rated;
	 String released;
	 String runtime;
	 List<Genre> genre;
	 List <Director> director;
	 List<Writer> writer;
	 List<Actor> actor;
	 String plot;
	 List<Language> language;
	 List<Country> country;
	 Award award;
	 int metascore;
	 Imdb imdb;
	 Type type;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public List<Genre> getGenre() {
		return genre;
	}
	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}
	public List<Director> getDirector() {
		return director;
	}
	public void setDirector(List<Director> director) {
		this.director = director;
	}
	public List<Writer> getWriter() {
		return writer;
	}
	public void setWriter(List<Writer> writer) {
		this.writer = writer;
	}
	public List<Actor> getActor() {
		return actor;
	}
	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public List<Language> getLanguage() {
		return language;
	}
	public void setLanguage(List<Language> language) {
		this.language = language;
	}
	public List<Country> getCountry() {
		return country;
	}
	public void setCountry(List<Country> country) {
		this.country = country;
	}
	public Award getAward() {
		return award;
	}
	public void setAward(Award award) {
		this.award = award;
	}
	public int getMetascore() {
		return metascore;
	}
	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	public Imdb getImdb() {
		return imdb;
	}
	public void setImdb(Imdb imdb) {
		this.imdb = imdb;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
}
