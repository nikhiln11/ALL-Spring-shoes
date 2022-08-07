package com.dbssecurity.ford.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DBSSecurityUser {
    
    @Id
    int id;
    String userName;
    String password;
    String role;
    boolean isActive;
    public DBSSecurityUser(int id, String userName, String password, String role, boolean isActive) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
    }
    public DBSSecurityUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isActive() {
        return isActive;
    }
  
public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    
}
