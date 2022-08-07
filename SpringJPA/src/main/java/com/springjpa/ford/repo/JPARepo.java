package com.springjpa.ford.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.ford.model.Student;

public interface JPARepo extends JpaRepository<Student, Integer>{

}
