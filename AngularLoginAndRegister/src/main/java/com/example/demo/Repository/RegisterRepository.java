package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.RegisterModel;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterModel, Integer>{

	public RegisterModel findByEmailid(String emailid);
	
	public RegisterModel findByEmailidAndPassword(String emailid,String password);
	
	
}
