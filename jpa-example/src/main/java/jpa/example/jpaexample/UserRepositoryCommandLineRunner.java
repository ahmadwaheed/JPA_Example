package jpa.example.jpaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Optional;
import jpa.example.jpaexample.entity.User;
import jpa.example.jpaexample.service.UserDAOService;
import jpa.example.jpaexample.service.UserRepository;

public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	//Logging Service for this Class
		private static final Logger log = 
				LoggerFactory.getLogger(UserDaoServcieCommandLineRunner.class);
		
		@Autowired
		private UserRepository userRepository;
		
		@Override
		public void run(String... args) throws Exception {
			
			// New user is createdUser [id= 1, name= Ahmad, role= Admin]
			User user = new User("Waheed", "Admin");  //Creating a User
			userRepository.save(user);  //adding into the database
			log.info("New user is created" + user);  //Logging it
			
			Optional<User> userWithIdOne = userRepository.findById(1L);
			log.info("User Retrieved: " + userWithIdOne);
			
			List<User> users = userRepository.findAll();
			log.info("All Users : " + users);	
		}
}
