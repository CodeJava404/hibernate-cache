package com.google.pojo;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "passanger_tble")
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY) 
public class Passanger {

	@Id
	private int tktId;
	private String passagerName;
	private String passangerDestination;

	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passanger(int tktId, String passagerName, String passangerDestination) {
		super();
		this.tktId = tktId;
		this.passagerName = passagerName;
		this.passangerDestination = passangerDestination;
	}

	public int getTktId() {
		return tktId;
	}

	public void setTktId(int tktId) {
		this.tktId = tktId;
	}

	public String getPassagerName() {
		return passagerName;
	}

	public void setPassagerName(String passagerName) {
		this.passagerName = passagerName;
	}

	public String getPassangerDestination() {
		return passangerDestination;
	}

	public void setPassangerDestination(String passangerDestination) {
		this.passangerDestination = passangerDestination;
	}

	@Override
	public String toString() {
		return "Passanger [tktId=" + tktId + ", passagerName=" + passagerName + ", passangerDestination="
				+ passangerDestination + "]";
	}

}
