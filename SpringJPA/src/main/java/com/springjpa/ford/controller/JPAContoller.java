package com.springjpa.ford.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.ford.model.Student;
import com.springjpa.ford.service.JPAService;


@RestController
public class JPAContoller {
	@Autowired
	JPAService rajeshService;
	
	@RequestMapping("/allStudent")
	 List<Student> getAllEmployees(){
	        
	        List<Student> empList =rajeshService.getAllStudents();
	        
	        return empList;
	        
	    }
	@PostMapping("/addNewEmp")
    public String addNewEmpRecord(@RequestBody Student emp) {
        
        return rajeshService.addNewStudent(emp);
        
    }
    
    @PutMapping("/updateEmp")
    public String updateEmpRec(@RequestBody Student emp) {
        
        return rajeshService.updateStudent(emp);
        
    }
    
    @DeleteMapping("/deleteEmp")
    public String deleteEmp(@RequestParam int id) {
        
        return rajeshService.deleteStudent(id);
        
    }

	

}