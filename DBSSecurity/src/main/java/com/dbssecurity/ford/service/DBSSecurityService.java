package com.dbssecurity.ford.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dbssecurity.ford.model.DBSSecurityUser;
import com.dbssecurity.ford.model.MyUserDetails;
import com.dbssecurity.ford.repo.UserRepo;

@Service
public class DBSSecurityService implements UserDetailsService {
    
    @Autowired
    UserRepo userRepo;
    
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        
        DBSSecurityUser dBSSecurityUser = userRepo.findByUserName(username);
        
        MyUserDetails myUserDetails = new MyUserDetails(dBSSecurityUser);
        
        return myUserDetails;
    }
}

