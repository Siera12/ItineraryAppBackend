package com.iris.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iris.entity.Client;
import com.iris.entity.UserHistory;



@Service
public interface UserHistoryService {
	
//	
	 public boolean addNewUserHistory(UserHistory c); 
	 
	 public boolean deleteUserHistory(UserHistory c);
	 
	 public UserHistory viewUserHistoryById(int id);
	 
	 public List<UserHistory> viewAllUserHistory();

}
