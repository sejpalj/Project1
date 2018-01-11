package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="bank")
public class Bank {
	
	private int bank_id;
	private String name;
	
	
	public Bank()//Default
	{
		
	}
	
	/*public Bank(String name)
	{
		this.name=name;
	}*/
	
	@Id
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "\n bank id:"+this.bank_id + "\n Bank name:"+ this.name;
	}
	

}
