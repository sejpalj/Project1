package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="account")

public class Account {
	
	@Id
	private int account_id;
	
	@OneToOne
	private Bank bank=null;
	@OneToOne
	private Patron patron=null;
	
	
	public Account()
	{
		
	}
	public Account(Bank b, Patron p)
	{
		this.bank=b;
		this.patron=p;
	}
	
	public int getAccount_id() {
		return account_id;
	}
	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public Patron getPatron() {
		return patron;
	}
	public void setPatron(Patron patron) {
		this.patron = patron;
	}
	
	public String toString()
	{
		return "\nAccount id:"+this.account_id + "\nBank id:"+this.getBank().getBank_id()+
				"\nPatorn id:"+ this.getPatron().getPatron_id();
	}

}
