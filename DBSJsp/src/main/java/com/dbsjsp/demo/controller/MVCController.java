package com.dbsjsp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dbsjsp.demo.model.Emp;


import com.dbsjsp.demo.service.JSPService;



@Controller
public class MVCController {
    

    @Autowired
    JSPService empService;
    @RequestMapping("/home")
    public Object showWelcomePage() {
        
        
        return "Home";
        
        
    }

    
    @RequestMapping("/saveNewEmp")
   public String saveEmpRec(@RequestParam String empName,@RequestParam int empSal,Model model) {
        
        
        
        //Emp emp = new Emp(123,"Abdul",45000);
        //model.addAttribute("emp", emp);
        
        //System.out.println("empName---------->"+empName);
        //System.out.println("empSal------------>"+empSal);
        
        List<Emp> empList = empService.getAllEmployees();
        model.addAttribute("AllEmps", empList);
        
        
        return "ShowAllEmp.jsp";
        
    }
    
}
