package com.jpa.demo.entity.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.demo.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductDao {
	
	@Autowired
	private Session myFoo;
	
	@Autowired
	private EntityManager entityManager;
	
	
	
	public Product getProduct(){
		//Session session = entityManager.unwrap(Session.class);
		//return session.get(Product.class, 1);
		return myFoo.get(Product.class, 1);
	}

}
