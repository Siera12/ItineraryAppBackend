package com.iris.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserHistory {
	
	@Id
    @GeneratedValue
	private int userHistoryId;
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	private Date loginTime;

	

	public int getUserHistoryId() {
		return userHistoryId;
	}

	public void setUserHistoryId(int userHistoryId) {
		this.userHistoryId = userHistoryId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	
	

}
