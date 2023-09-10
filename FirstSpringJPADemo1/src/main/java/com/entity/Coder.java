package com.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity

@Table(name="java_Coder")

public class Coder {

	@Id

	int id;

	String cname;

	String tech;

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public String getCname() {

		return cname;

	}

	public void setCname(String cname) {

		this.cname = cname;

	}

	public String getTech() {

		return tech;

	}

	public void setTech(String tech) {

		this.tech = tech;

	}

	@Override

	public String toString() {

		return "Coder [id=" + id + ", cname=" + cname + ", tech=" + tech + "]";

	}

 

 

 

}