package com.iris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iris.entity.Client;
import com.iris.service.MyService;

@RestController
public class ClientController {
	
	 @Autowired
	    MyService service;
	 
	 @RequestMapping("/clientadd")    
	    public String SpringBootHello() {
		 
		 Client cli=new Client();
		 cli.setClientName("Avishake");
		 cli.setProjectName("NLP");
		 Client c=service.addClient(cli);
		System.out.println( c.getClientName()+"......"+c.getProjectName());
		
		
		 
		 
	        return "welcome";           // welcome is view name. It will call welcome.jsp
	    }

}
