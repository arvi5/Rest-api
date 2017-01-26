package RESTAPI.Restmodule.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Award {
	@Id
	@GeneratedValue
	private int id;
	private String awardInfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAwardInfo() {
		return awardInfo;
	}
	public void setAwardInfo(String awardInfo) {
		this.awardInfo = awardInfo;
	}
	
	
}
