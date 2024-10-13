package com.jpa.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManager;

@Configuration
public class HibernateConfig {
	
	
	@Autowired
	private EntityManager entityManager;
	
	@Bean(name = "myFoo")
	Session session() {
		return entityManager.unwrap(Session.class);
	}

}
