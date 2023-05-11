package com.rino.app.rino.Model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id
	private long id;
	private String fname;
    private String lname;
    private int age;
	private String occupation;
	public long getId() {
		return id;
	}
   public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
