package com.wipro.springbootcruddemo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.springbootcruddemo1.entity.User;
@Service
public interface UserService {
    User createUser(User user);//unim  String void Class
    List<User> getUsersByFirstName(String firstName);
    List<User> getUsersByLastName(String lastName);
    
}
