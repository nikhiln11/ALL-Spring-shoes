package com.Starter.Dbsrestapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {
	@RequestMapping("/hi")
	public String fun()
	{
		return "<h1>Welcome to Spring World! in DBSController java class</h1>";
	}
	
}
