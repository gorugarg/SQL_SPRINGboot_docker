package com.example.demomysqldocker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerClass {
	
	@Autowired
	UserRepository usr;
	
	@GetMapping("/addUser")
	public User addUsers() {
		User user = new User();
		user.setName("Gaurav");
		user.setCity("Sirsa");
		usr.save(user);
		return user;
		
	}
	@GetMapping("/getUser")
	public List<User> retirveUsers() {
		List<User> ab = new ArrayList<User>();
		ab= (List<User>) usr.findAll();
		return ab;
		
	}

}
