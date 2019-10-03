package com.iris.service;

import org.springframework.stereotype.Service;

import com.iris.entity.Client;

@Service
public interface UserService {
	
	public Client addNewUser(Client c); 
	 
	 public Client updateUser(Client c);
	 
	 public Client deleteUser(Client c);
	 
	 public Client viewUserById(int id);
	 
	 public Client viewAllUser(int id);
	

}
