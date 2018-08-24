package com.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 学生信息的持久层
 * @author lsy
 * @date 2018/8/24
 */
@Mapper
public interface StudentMapper {

    public List<Map<String, Object>> getStudentList();

}
