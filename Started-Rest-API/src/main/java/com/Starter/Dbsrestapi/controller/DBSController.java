package com.Starter.Dbsrestapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSController {
	@RequestMapping("/hello")
	public String sayHello() {
	return "<h1>Welcome to Spring boot World </h1> "	;
	}
	}
