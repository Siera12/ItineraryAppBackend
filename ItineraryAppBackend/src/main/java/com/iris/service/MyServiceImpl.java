package com.iris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.entity.Client;
import com.iris.entity.User;
import com.iris.repository.ClientRepository;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	ClientRepository dao;

	@Override
	public Client addClient(Client cli) {
		System.out.println("Entering service");
		return  dao.save(cli);
	}

//	@Override
//	public User validate(int userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
