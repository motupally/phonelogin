package com.example.loginform.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loginform.Model.tatastrivemodel;
import com.example.loginform.Repository.UserRepository;




@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	

}