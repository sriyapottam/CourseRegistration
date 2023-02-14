package com.example.Registration.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.entity.UserDetails;
import com.example.Registration.repository.MyRepo;
import com.example.Registration.service.MyService;
@Service

public class UserService implements MyService{
    @Autowired
    private MyRepo re;
	public UserService(MyRepo re) {
		super();
		// TODO Auto-generated constructor stub
		this.re=re;
	}
	@Override
	public List<UserDetails> getAllUsers() {
		return re.findAll();
	}
	@Override
	public UserDetails getUserById(int id) {
		return re.findById(id).get();
	}
	@Override
	public UserDetails updateStudent(UserDetails existingStudent) {
		 return re.save(existingStudent);
		
	}
	
	@Override
	public void delete(int id) {
		this.re.deleteById(id);		
	}
	
	
	

}

