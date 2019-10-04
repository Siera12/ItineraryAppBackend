package com.iris.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iris.entity.Client;

@Service
public interface ClientService {
	
 public boolean addNewClient(Client c); 
 
 public boolean updateClient(Client c);
 
 public boolean deleteClient(Client c);
 
 public Client viewClientById(int id);
 
 public List<Client> viewAllClients();

}
