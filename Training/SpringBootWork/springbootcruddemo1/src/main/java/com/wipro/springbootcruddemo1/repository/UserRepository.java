package com.wipro.springbootcruddemo1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.springbootcruddemo1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
	List<User> findByFirstName(String firstName);
	
	 @Query("SELECT u FROM User u WHERE u.lastName = :ls")
	    List<User> findUsersByLastName(@Param("ls") String lastName);
}




