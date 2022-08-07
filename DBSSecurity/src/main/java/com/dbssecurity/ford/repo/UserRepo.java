package com.dbssecurity.ford.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbssecurity.ford.model.DBSSecurityUser;

public interface UserRepo extends JpaRepository<DBSSecurityUser, Integer> {
    DBSSecurityUser findByUserName(String username);
}

