package com.avinash.HibernateDemo;

//import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.*;
//@Entity(name="AlienTable")
//@Table(name="AlienTable")
@Cacheable
@org.hibernate.annotations.Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Alien //pojo
{
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + "]";
	}
	@Id
	private int aid;
	//@Column(name="AlienName")
	private String aname;
//	private AlienName aname;
//	@OneToMany(mappedBy="alien", fetch = FetchType.EAGER)
//	private Collection<Laptop> laps = new ArrayList<Laptop>();
//	
//	
//	
	private String color;
//	
//	public Collection<Laptop> getLaps() {
//		return laps;
//	}
//	public void setLaps(Collection<Laptop> laps) {
//		this.laps = laps;
//	}
	public int getAid() {
		return aid;
	}
//	public AlienName getAname() {
//		return aname;
//	}
//	public void setAname(AlienName aname) {
//		this.aname = aname;
//	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
