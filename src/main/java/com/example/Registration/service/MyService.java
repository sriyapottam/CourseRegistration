package com.example.Registration.service;

import java.util.List;

import com.example.Registration.entity.UserDetails;

public interface  MyService {
    List<UserDetails> getAllUsers();
    
	UserDetails getUserById(int id);

	UserDetails updateStudent(UserDetails existingStudent);
  
	

	void delete(int id);
	
    
}
