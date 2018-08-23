package com.controller;

import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
	 @Autowired
	 private StudentService studentService;
	 
	 @RequestMapping("/list")
	    public List<Map<String, Object>> studentList() {
		 List<Map<String, Object>> studentList=studentService.getStudentList();
	        System.out.println(studentList);
	        return studentList;  
	    }  
}
