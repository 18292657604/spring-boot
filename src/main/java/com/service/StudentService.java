package com.service;

import com.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
	 @Autowired
	 private StudentRepository studentRepository;
	 public List<Map<String, Object>> getStudentList(){
	        return studentRepository.getStudentList();
	 }  
}
