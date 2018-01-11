/*package com.hib;

import com.beans.Account;
import com.beans.AccountType;
import com.beans.Bank;
import com.beans.Patron;

import com.beans.Transactionn;

public class BankImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//addBank();
		//addPatron();
		//deletePatron();
		//deleteBank();
		//updateBank();
		//updatePatron();
		//findPatron();
		//findBank();
		//findByNamePatron();
		//findByNameBank();
		//addAccount();
		//updateAccount();
		//deleteAccount() ;
		//findAccount();
		
		//addTransaction();
		//findTransaction();
	}

	private static void addBank() {
		BankRepository br=new BankRepository();
		Bank b=new Bank();
		b.setName("Chase");
		System.out.println(br.add(b));
	}
	
	private static void addPatron() {
		BankRepository br=new BankRepository();
		Patron p=new Patron();
		p.setPatron_name("Rogers");
		System.out.println(br.add(p));
	}
	
	private static void deletePatron() {
		BankRepository br=new BankRepository();
		Patron p=new Patron();
		p.setPatron_id(5);
		//p.setPatron_name("Rogers");
		System.out.println(br.delete(p));
	}

	private static void deleteBank() {
		BankRepository br=new BankRepository();
		Bank b=new Bank();
		b.setBank_id(4);;
		b.setName("chase");
		System.out.println(br.delete(b));
	}
	
	private static void updateBank() {
		BankRepository br=new BankRepository();
		Bank b=new Bank();
		b.setBank_id(3);;
		b.setName("chase");
		System.out.println(br.update(b));
	} 	
	
	private static void updatePatron() {
		BankRepository br=new BankRepository();
		Patron p=new Patron();
		p.setPatron_id(4);
		p.setPatron_name("Rogers");
		System.out.println(br.update(p));
	} 	
	
	private static void findPatron() {
		BankRepository br=new BankRepository();
		Patron p=new Patron();
		p.setPatron_id(4);
		System.out.println(br.find(p));
	} 	
	
	private static void findBank() {
		BankRepository br=new BankRepository();
		Bank b=new Bank();
		b.setBank_id(1);
		System.out.println(br.find(b));
	}
	
	
	private static void findByNamePatron() {
		BankRepository br=new BankRepository();
		Patron p=new Patron();
		p.setPatron_name("jatin");
		System.out.println(br.findAll(p));
	} 
	
	private static void findByNameBank() {
		BankRepository br=new BankRepository();
		Bank b=new Bank();
		b.setName("SBI");
		System.out.println(br.findAll(b));
	}
	
	private static void addAccount() {
		BankRepository br=new BankRepository();
		Account a=new Account();
		Bank b=new Bank();
		b.setBank_id(2);
		Patron p=new Patron();
		p.setPatron_id(3);
		a.setBank(b);
		a.setPatron(p);
		System.out.println(br.add(a));
	}
	
	private static void updateAccount() {
		BankRepository br=new BankRepository();
		Account a=new Account();
		a.setAccount_id(1);
		Bank b=new Bank();
		b.setBank_id(3);
		Patron p=new Patron();
		p.setPatron_id(2);
		a.setBank(b);
		a.setPatron(p);
		System.out.println(br.update(a));
	}
	
	private static void deleteAccount() {
		BankRepository br=new BankRepository();
		Account a=new Account();
		a.setAccount_id(3);
		Bank b=new Bank();
		Patron p=new Patron();
		a.setBank(b);
		a.setPatron(p);
		System.out.println(br.delete(a));
	}
	
	private static void findAccount() {
		BankRepository br=new BankRepository();
		Account a=new Account();
		a.setAccount_id(1);
		Bank b=new Bank();
		Patron p=new Patron();
		a.setBank(b);
		
		a.setPatron(p);
		System.out.println(br.find(a));
	}
	
	private static void addTransaction() {
		BankRepository br=new BankRepository();
		Transactionn t=new Transactionn();
		Account a=new Account();
		a.setAccount_id(1);
		Bank b=new Bank();
		b.setBank_id(3);
		Patron p=new Patron();
		p.setPatron_id(2);
		a.setBank(b);
		a.setPatron(p);
		t.setAccount(a);
		t.setAmount(45.00);
		t.setAccounttype(AccountType.DEBIT);
		p.setPatron_name("Rogers");
		System.out.println(br.add(t));
	}
	
	
	private static void findTransaction() {
		BankRepository br=new BankRepository();
		Transactionn t=new Transactionn();
		Account a=new Account();
		
		Bank b=new Bank();
		
		Patron p=new Patron();
		
		a.setBank(b);
		a.setPatron(p);
		t.setAccount(a);
		t.setAmount(45.00);
		t.setTrans_id(11);
		t.setAccounttype(AccountType.DEBIT);
		p.setPatron_name("Rogers");
		System.out.println(br.find(t));
	}
	
	
}

*/