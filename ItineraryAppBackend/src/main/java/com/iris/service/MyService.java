package com.iris.service;

import org.springframework.stereotype.Service;

import com.iris.entity.Client;
import com.iris.entity.User;

@Service
public interface MyService {
	
//	public User validate(int userId);
	
	public Client addClient(Client cli);

}
