package com.example.Registration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Registration.entity.UserDetails;

@Repository
public interface MyRepo extends JpaRepository<UserDetails,Integer>{

	
	
	

}
