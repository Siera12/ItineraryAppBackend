package com.iris.service;

import org.springframework.stereotype.Service;

import com.iris.entity.Client;

@Service
public interface ClientService {
	
 public Client addNewClient(Client c); 
 
 public Client updateClient(Client c);
 
 public Client deleteClient(Client c);
 
 public Client viewClientById(int id);
 
 public Client viewAllClients(int id);

}
