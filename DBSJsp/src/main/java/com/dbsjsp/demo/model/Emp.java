package com.dbsjsp.demo.model;

import javax.persistence.Entity;

@Entity
public class Emp{
	
      int empsal;
      String empname;
     public Emp()
     {
    	 super();
     }
	public Emp(int empsal, String empname) {
		super();
		this.empsal = empsal;
		this.empname = empname;
		
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
      
}
