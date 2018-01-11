package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="patron")
public class Patron {

	private int patron_id;
	private String patron_name;
	private byte[] image;

	// not added on table as yet

	public Patron()// Default
	{

	}

	Patron(int patron_id, String patron_name ) {
		
		this.patron_id = patron_id;
		this.patron_name = patron_name;
		
	}

	
	Patron(int patron_id, String patron_name ,byte[] image) {
		
		this.patron_id = patron_id;
		this.patron_name = patron_name;
		this.image=image;

	}

	@Id
	public int getPatron_id() {
		return patron_id;
	}

	public void setPatron_id(int patron_id) {
		this.patron_id = patron_id;
	}

	public String getPatron_name() {
		return patron_name;
	}

	public void setPatron_name(String patron_name) {
		this.patron_name = patron_name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String toString() {
		return "\nID:" + this.patron_id + "\nPatrong Name:" + this.patron_name;

	}

}
