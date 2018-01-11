package com.hib;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Account;
import com.beans.Bank;
import com.beans.Patron;
import com.beans.Result;
import com.beans.Transactionn;

public class BankRepository {

	Session s, s1;

	public BankRepository() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Bank.class)
				.addAnnotatedClass(Patron.class).addAnnotatedClass(Account.class)
				.addAnnotatedClass(Transactionn.class);
		SessionFactory sf = con.buildSessionFactory();
		s = sf.openSession();
	}

	public Result add(Bank b) {

		Transaction tx = s.beginTransaction();
		Integer res = (Integer) s.save(b);
		tx.commit();
		if (res != null) {
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}

	public Result add(Patron p) {

		Transaction tx = s.beginTransaction();
		Integer res = (Integer) s.save(p);
		tx.commit();
		if (res != null) {
			return Result.SUCCESS;
		}
		s.close();
		return Result.FAILURE;
	}

	public Result delete(Patron p) {

		Transaction tx = s.beginTransaction();
		Patron res = (Patron) s.get(Patron.class, p.getPatron_id());

		if (res != null) {
			s.delete(res);
			tx.commit();
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}

	public Result delete(Bank b) {

		Transaction tx = s.beginTransaction();
		Bank res = (Bank) s.get(Bank.class, b.getBank_id());

		if (res != null) {
			s.delete(res);
			tx.commit();
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}

	public Result update(Bank b) {
		Transaction tx = s.beginTransaction();
		Bank res = (Bank) s.get(Bank.class, b.getBank_id());
		res.setName(b.getName());
		if (res != null) {
			s.update(res);
			tx.commit();
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}

	public Result update(Patron p) {
		Transaction tx = s.beginTransaction();
		Patron res = (Patron) s.get(Patron.class, p.getPatron_id());
		res.setPatron_name(p.getPatron_name());
		if (res != null) {
			s.update(res);
			tx.commit();
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}

	public Patron find(Patron p) {
		Transaction tx = s.beginTransaction();
		Patron res = (Patron) s.get(Patron.class, p.getPatron_id());

		if (res != null) {
			s.update(res);
			tx.commit();
			return res;
		} else
			return null;
	}

	public Bank find(Bank b) {
		Transaction tx = s.beginTransaction();
		Bank res = (Bank) s.get(Bank.class, b.getBank_id());

		if (res != null) {
			s.update(res);
			tx.commit();
			return res;
		} else
			return null;
	}

	public ArrayList<Patron> findAll(Patron p) {
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from patron where patron_name=:nm");
		q.setParameter("nm", p.getPatron_name());
		ArrayList<Patron> list = (ArrayList<Patron>) (q.list());
		return list;
	}
	

	public ArrayList<Bank> findAll(Bank b) {
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from bank where name=:nm");
		q.setParameter("nm", b.getName());
		ArrayList<Bank> list = (ArrayList<Bank>) (q.list());
		return list;
	}
	
	public Result add(Account a) {

		Transaction tx = s.beginTransaction();
		Integer res = (Integer) s.save(a);
		tx.commit();
		if (res != null) {
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}
	
	
	public Result update(Account a) {
		Transaction tx = s.beginTransaction();
		Account res = (Account) s.get(Account.class, a.getAccount_id());
		res.setBank(a.getBank());
		res.setPatron(a.getPatron());
		if (res != null) {
			s.update(res);
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}
	
	public Result delete(Account a) {

		Transaction tx = s.beginTransaction();
		Account res = (Account) s.get(Account.class, a.getAccount_id());

		if (res != null) {
			s.delete(res);
			tx.commit();
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}
	
	
	public Account find(Account a) {
		Transaction tx = s.beginTransaction();
		Account res = (Account) s.get(Account.class, a.getAccount_id());

		if (res != null) {
			s.update(res);
			tx.commit();
			return res;
		} else
			return null;
	}
	
	public Result add(Transactionn t) {

		Transaction tx = s.beginTransaction();
		Integer res = (Integer) s.save(t);
		tx.commit();
		if (res != null) {
			return Result.SUCCESS;
		}
		return Result.FAILURE;
	}
	
	public Transactionn find(Transactionn t) {
		Transaction tx = s.beginTransaction();
		Transactionn res = (Transactionn) s.get(Transactionn.class, t.getTrans_id());

		if (res != null) {
			s.update(res);
			tx.commit();
			return res;
		} else
			return null;
	}
}
