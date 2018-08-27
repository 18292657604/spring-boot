package com.musingtec.controller;

import com.musingtec.bean.Student;
import com.musingtec.service.StudentService;
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
	    public List<Student> studentList() {
		 List<Student> studentList=studentService.getStudentList();
	        return studentList;
	    }  
}
