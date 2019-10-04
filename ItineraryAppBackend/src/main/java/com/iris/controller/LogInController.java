package com.iris.controller;

import java.awt.print.Book;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iris.service.MyService;

@RestController
public class LogInController {
	
	 @Autowired
	    MyService service;
	 
//	 @PostMapping("/login")
//		@ResponseStatus(HttpStatus.CREATED)
//	    Book newBook(@Valid @RequestBody Book newBook) {
//	        return repository.save(newBook);
//	    }

}
