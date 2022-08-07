package com.springjpa.ford.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.ford.model.Student;
import com.springjpa.ford.repo.JPARepo;

@Service
public class JPAService {
    
    @Autowired
    JPARepo studentRepo;
    public List<Student> getAllStudents() {
        
        return studentRepo.findAll();
        
    }
    public String addNewStudent(Student student) {
        
        try{
            studentRepo.save(student);
        }catch(Exception e) {
            return "Problem Occured while inserting New Student Rec!!!!!!!!";
        }
        return " Student Added Successfully!!!!!!!!!";
    }
    public String updateStudent(Student student) {
        try{
            
            Student exitingStudent = studentRepo.findById(student.getId()).get();
            
            studentRepo.save(student);
        }catch(Exception e) {
            return "No Student Found!!!!!!!";
            
        }
        return "Student Updated Successfully";
    }
        public String deleteStudent(int studentId) {
            try{
                studentRepo.deleteById(studentId);
            }catch(Exception e) {
                return "Problem Occured while deleting New Student Rec!!!!!!!!";
            }
            return " Student Deleted Successfully!!!!!!!!!";
        }
    }