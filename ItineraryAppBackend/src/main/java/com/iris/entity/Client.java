package com.iris.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
    @GeneratedValue
    private int clientId;
	
	private String clientName;
	
	private String projectName;
	
	private String account;
	
	private String agenda;
	
	private Date arrvDate;
	
	private Date deptDate;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public Date getArrvDate() {
		return arrvDate;
	}

	public void setArrvDate(Date arrvDate) {
		this.arrvDate = arrvDate;
	}

	public Date getDeptDate() {
		return deptDate;
	}

	public void setDeptDate(Date deptDate) {
		this.deptDate = deptDate;
	}
	
	

}
