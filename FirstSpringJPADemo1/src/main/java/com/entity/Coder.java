package com.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity

//@Table(name="java_Coder")
@Table(name="Virat")
public class Coder {

	@Id
	int id;
@NotNull
@NotEmpty(message="Name can not be empty")
	String cname;
@NotNull
@NotEmpty(message="Tech can not be empty")
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