package com.wipro.springbootcruddemo1.service;

import lombok.AllArgsConstructor;

import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.wipro.springbootcruddemo1.entity.User;
import com.wipro.springbootcruddemo1.repository.UserRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public class UserServiceImpl implements UserService 
{

	@Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {   
        return userRepository.save(user) ;
    }

    @Override
    public List<User> getUsersByFirstName(String firstName) 
    {
        return userRepository.findByFirstName(firstName);
    }
    @Override
    public List<User> getUsersByLastName(String lastName) 
    {
        return userRepository.findUsersByLastName(lastName); // Using JPQL query
    }
 }


