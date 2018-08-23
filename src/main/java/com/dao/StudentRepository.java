package com.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	 @Transactional(readOnly = true)
	 public List<Map<String, Object>> getStudentList(){
         String sql = "select * from student";
         return jdbcTemplate.queryForList(sql);
    }  
}
