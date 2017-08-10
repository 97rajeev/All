package com.proxycode.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.proxycode.dao.PersonDao;
import com.proxycode.model.Person;

public class PerosnDaoImpl implements PersonDao{
	
	private SessionFactory sessionFactory;
	Serializable i;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Person person) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		i=session.save(person);
		System.out.println("xxxxxxxx"+i);
		session.flush();
		tx.commit();
		session.close();
	}
	
	public void populateTable() {
		Session session = this.sessionFactory.openSession();
		Person p=session.load(Person.class, i);
		System.out.println("=====================================");
		System.out.println(p);
		session.close();
	}

}
