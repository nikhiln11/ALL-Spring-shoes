package com.dbsjsp.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dbsjsp.demo.model.Emp;
public interface JSPRepo extends JpaRepository<Emp, Integer>{

}
