package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="java_laptop")
public class Laptop {
 @Id
	int lid;
	String lname;
	String lprice;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLprice() {
		return lprice;
	}
	public void setLprice(String string) {
		this.lprice = string;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
	}
	
}
