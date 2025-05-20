package com.wipro.springbootcruddemo1.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.springbootcruddemo1.entity.User;
import com.wipro.springbootcruddemo1.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController 
{
    
	@Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED); //inserting 201 created
    }

    @GetMapping("/search/firstName/{firstName}")
    public ResponseEntity<List<User>> getUsersByFirstName(@PathVariable String firstName) 
    {
    	
        return new ResponseEntity<>(userService.getUsersByFirstName(firstName), HttpStatus.OK); //200
    }
    
    @GetMapping("/lastname/{lastName}")
    public ResponseEntity<List<User>> getUsersByLastName(@PathVariable("lastName") String lastName) 
    {
        List<User> users = userService.getUsersByLastName(lastName);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
 }

