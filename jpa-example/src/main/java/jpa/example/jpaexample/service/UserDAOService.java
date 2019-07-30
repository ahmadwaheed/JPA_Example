package jpa.example.jpaexample.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import jpa.example.jpaexample.entity.User;

@Repository
@Transactional 
public class UserDAOService {

	//creates an instance of the entity in the database
	@PersistenceContext
	private EntityManager entitymanager;
	
	//save the User to the database
	public long insert(User user) {
		
		entitymanager.persist(user);
		
		return user.getId();
	}
}

/*Spring Data
 * Define Repository Interfaces and Spring Data will
 * be responsible of Implementing them. 
 * */
 