package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Model.RegisterModel;
import com.example.demo.Repository.RegisterRepository;

@Service
public class RegisterService {
	
	@Autowired
	public RegisterRepository repo;
	
	public RegisterModel save(RegisterModel model) {
		return repo.save(model);
	}
	
	public RegisterModel FetchEmailId(String email) {
		return repo.findByEmailid(email);
	}
	
	public RegisterModel FetchEmailidAndPassword(String emailid, String password) {
		return repo.findByEmailidAndPassword(emailid, password);
	}
}
