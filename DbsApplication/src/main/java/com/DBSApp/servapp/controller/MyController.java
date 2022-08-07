package com.DBSApp.servapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DBSApp.servapp.model.Employee;
import com.DBSApp.servapp.Service.DBSService;

@RestController
public class MyController {
    
    @Autowired
    DBSService dbsService;
    
    
    @RequestMapping("/all")
    List<Employee> getAllEmployees(){
        
        List<Employee> empList = dbsService.getAllEmployees();
        
        return empList;
        
    }
    @PostMapping("/addNewEmp")
    public String addNewEmpRecord(@RequestBody Employee emp) {
        
        return dbsService.createNewEmp(emp);
        
    }
    
    @PutMapping("/updateEmp")
    public String updateEmpRec(@RequestBody Employee emp) {
        
        return dbsService.updateEmp(emp);
        
    }
    
    @DeleteMapping("/deleteEmp")
    public String deleteEmpRecord(@RequestParam int id) {
        
        return dbsService.deleteEmp(id);
        
    }
}


