package com.roona.dao;
// Generated Feb 27, 2016 12:24:19 AM by Hibernate Tools 4.3.1.Final

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Home object for domain model class Address.
 * @see com.roona.dao.Address
 * @author Hibernate Tools
 */
@Repository
public class AddressHome {

	private static final Log log = LogFactory.getLog(AddressHome.class);
@Autowired
	private  SessionFactory sessionFactory ;

	

	public void persist(Address transientInstance) {
		log.debug("persisting Address instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Address instance) {
		log.debug("attaching dirty Address instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Address instance) {
		log.debug("attaching clean Address instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Address persistentInstance) {
		log.debug("deleting Address instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Address merge(Address detachedInstance) {
		log.debug("merging Address instance");
		try {
			Address result = (Address) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Address findById(java.lang.Integer id) {
		log.debug("getting Address instance with id: " + id);
		try {
			Address instance = (Address) sessionFactory.getCurrentSession().get("com.roona.dao.Address", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Address> findByExample(Address instance) {
		log.debug("finding Address instance by example");
		Transaction transaction=null;
		try {

			Session session= sessionFactory.getCurrentSession();
			transaction=session.beginTransaction();
			List<Address> results = (List<Address>) session
					.createCriteria("com.roona.dao.Address").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			transaction.commit();
			return results;
		} catch (RuntimeException re) {
			transaction.rollback();
			log.error("find by example failed", re);
			throw re;
		}
	}
}
