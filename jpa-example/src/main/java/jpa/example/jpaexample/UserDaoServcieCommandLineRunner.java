package jpa.example.jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jpa.example.jpaexample.entity.User;
import jpa.example.jpaexample.service.UserDAOService;

@Component
public class UserDaoServcieCommandLineRunner implements CommandLineRunner {
	
	//Logging Service for this Class
	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServcieCommandLineRunner.class);
	
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		// New user is createdUser [id= 1, name= Ahmad, role= Admin]
		User user = new User("Ahmad", "Admin");  //Creating a User
		long insert = userDaoService.insert(user);  //adding into the database
		log.info("New user is created" + user);  //Logging it
	}

}
