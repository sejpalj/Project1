package com.tests;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.beans.Account;
import com.beans.AccountType;
import com.beans.Result;
import com.beans.Transactionn;
import com.hib.BankRepository;

public class testcases {

	@Test
	public void addtest() throws SQLException {
		BankRepository br = new BankRepository();
		Transactionn t = new Transactionn();
		Account a = new Account();
		a.setAccount_id(4);
		t.setAmount(45.00);
		t.setAccounttype(AccountType.CREDIT);
		t.setAccount(a);
		assertEquals(Result.SUCCESS, br.add(t));

	}
	
	@Test
	public void findtest() throws SQLException
	{
		BankRepository br = new BankRepository();
		Transactionn t=new Transactionn();
		t.setTrans_id(11);
		assertEquals(1,br.find(t).getAccount().getAccount_id());
		//assertEquals((double)45,br.find(t).getAmount());
	}
	
}
