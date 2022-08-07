package com.DBSApp.servapp.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.DBSApp.servapp.controller.MyController;
import com.DBSApp.servapp.Repo.DBSRepo;
import com.DBSApp.servapp.model.Employee;

@Service
public class DBSService {
    @Autowired
    DBSRepo dbsRepo;
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public List<Employee> getAllEmployees() {
        
        
        List<Employee> empList = dbsRepo.fetchAllEmployees();
        
        return empList;
    }

    public String createNewEmp(Employee emp) {
        
        String insertQuery = "INSERT INTO EMP (name, salary) VALUES ('"+emp.getName()+"',"+emp.getSalary()+")";
        
        int num = jdbcTemplate.update(insertQuery);
        
        if(num > 0) {
            
            return "Successfully Emp Record got Created!!!!!!!!!!!";
        }
        else {
            return "Problem Occured while creating a Emp Record!!!!!!!!!!!";
        }
        
    }

	 public String updateEmp(Employee emp) {
	     
	     String sqlQuery = "update EMP set name = ?, salary = ? where id = ?";
	     
	     int numRec = jdbcTemplate.update(sqlQuery,emp.getName(),emp.getSalary(),emp.getId());
	     
	     
	     if(numRec > 0) {
	         
	         return "Successfully Emp Record got Updated!!!!!!!!!!!";
	     }
	     else {
	         return "Problem Occured while updating a Emp Record!!!!!!!!!!!";
	     }
	     
	     
	     
	 }
	 public String deleteEmp(int id) {
	        
         String sqlQuery = "delete from EMP  where id = ?";
         
          int numRec = jdbcTemplate.update(sqlQuery,id);
          
          
          if(numRec > 0) {
                
                return "Successfully Emp Record got Deleted!!!!!!!!!!!";
            }
            else {
                return "Problem Occured while deleting a Emp Record!!!!!!!!!!!";
            }
    }

}
