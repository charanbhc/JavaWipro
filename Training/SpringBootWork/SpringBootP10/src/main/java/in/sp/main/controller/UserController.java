package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.entity.User;
import in.sp.main.service.UserService;

@RestController
@RequestMapping("api/users")

public class UserController 
{
	@Autowired
	private UserService userservice;    // We have created an object of userservice Class to call predefined method of Rparepository  
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		
		User saveUser = userservice.createUser(user);
		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	}
	
}
