package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="transaction")
public class Transactionn {
	@Id
	private int trans_id;
	
	@OneToOne
	Account account;
	private double amount;
	private AccountType accounttype;
	
	Transactionn(/*int tid,*/ Account a, double amt, AccountType at)
	{
		this.account=a;
		this.amount=amt;
		this.accounttype=at;
	}
	
	public Transactionn() //Default constructor
	{
		
	}
	
	
	
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public AccountType getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(AccountType accounttype) {
		this.accounttype = accounttype;
	}
	
	public String toString()
	{
		return "\nTransaction id="+this.trans_id + "\nAccount id="+ this.getAccount().getAccount_id()
				+ "\nAmount="+ this.amount + "\nType="+this.accounttype.name();
	}

}
