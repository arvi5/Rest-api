package RESTAPI.Restmodule.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Imdb {
	@Id
	@GeneratedValue
	private int id;
	private float imdbrating;
	private int imdbvotes;
	private String imdbid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getImdbrating() {
		return imdbrating;
	}
	public void setImdbrating(float imdbrating) {
		this.imdbrating = imdbrating;
	}
	public int getImdbvotes() {
		return imdbvotes;
	}
	public void setImdbvotes(int imdbvotes) {
		this.imdbvotes = imdbvotes;
	}
	public String getImdbid() {
		return imdbid;
	}
	public void setImdbid(String imdbid) {
		this.imdbid = imdbid;
	}
}
