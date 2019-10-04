package com.iris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.entity.User;
import com.iris.entity.UserHistory;

import com.iris.repository.UserHistoryRepository;


@Service
public class UserHistoryServiceImpl implements UserHistoryService{


	
	@Autowired
	UserHistoryRepository dao;

	@Override
	public boolean addNewUserHistory(UserHistory c) {
		
		try {
			
			
			
			dao.save(c);
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		



	@Override
	public boolean deleteUserHistory(UserHistory c) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override

	public boolean deleteUserHistory(UserHistory c) {
		
		try {
			
			dao.delete(c);
			
			return true;
			
		}
		catch(Exception e) {e.printStackTrace();}
		
		return false;
	}

	@Override
	public UserHistory viewUserHistoryById(int id) {

		try {
						
			UserHistory uh=dao.findById(id).get();
			return uh;
			
		}
		catch(Exception e) {e.printStackTrace();}
		

	}

	@Override
	public List<UserHistory> viewAllUserHistory() {


		try {
					
			return dao.findAll();
			
		}
		catch(Exception e) {e.printStackTrace();}
		

		
	}
	
	
	


	
	
	

}
