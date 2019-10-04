package com.iris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.entity.Client;
import com.iris.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepository dao;
	
	@Override
	public boolean addNewClient(Client c) {
		try {
			
			dao.save(c);
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}
	@Override
	public boolean updateClient(Client c) {
		try {
			
			dao.saveAndFlush(c);
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}
	@Override
	public boolean deleteClient(Client c) {
		try {
			
			dao.delete(c);
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

	@Override
	public Client viewClientById(int id) {
		
		try {
		Client c=dao.findById(id).get();
		return c;
		
		}
	catch(Exception e) {e.printStackTrace();}
		return null;
	}

	@Override
	public List<Client> viewAllClients() {
		try {
			
		return dao.findAll();
	}
	catch(Exception e) {e.printStackTrace();}
		return null;
	}
	
}
