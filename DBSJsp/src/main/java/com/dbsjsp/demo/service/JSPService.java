package com.dbsjsp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dbsjsp.demo.model.Emp;
import com.dbsjsp.demo.repo.JSPRepo;

public class JSPService{
	
	@Autowired
	JSPRepo jspRepo ;
	
public List<Emp> getAllEmployees() {
        
        return jspRepo.findAll();
        
    }
}