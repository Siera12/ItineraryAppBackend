package com.iris.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class UserHistory {
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	private Date loginTime;

	

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
