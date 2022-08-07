package com.dbsproj.ford.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbsproj.ford.model.BankAccount;

public interface BankRepo extends JpaRepository<BankAccount, Integer> {

}
