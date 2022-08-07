package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.repo.MyRepo;
import com.example.demo.repo.MyRepo;
@Repository
public class MyRepo {
	  @Autowired
	    JdbcTemplate jdbcTemplate;
	    
	    //T mapRow(ResultSet rs, int rowNum) throws SQLException;
	    
	    RowMapper<Employee>  myRowMapper = (rs,no)->{
	        Employee  emp = new Employee();
	        
	        emp.setId(rs.getInt(1));
	        emp.setName(rs.getString(2));
	        emp.setSalary(rs.getInt(3));
	        
	        
	        return emp;
	    };
	    
	            
	            
	    public List<Employee> fetchAllEmployees() {
	        
	        String sqlQuery = " SELECT * FROM EMP";
	        
	        
	        List<Employee> empList = jdbcTemplate.query(sqlQuery, myRowMapper);
	        
	        
	        
	        return empList;
	    }
	 
}
