package com.musingtec.service;

import com.musingtec.bean.Student;
import com.musingtec.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
	 /*
	 	@Autowired
	 	private StudentRepository studentRepository;
	 */
	 @Autowired
	 private StudentMapper studentMapper;

	 public List<Student> getStudentList(){
		 return studentMapper.getStudentList();
	 }


	 public void insertStudent(){


	 }
}
