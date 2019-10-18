package com.exam.dao;

import com.exam.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author 黄军威
 * @create 2019/10/18 11:32
 * @email hjunwei@foxmail.com
 */
//@Mapper
@Repository
public interface StudentDao {
    Student queryStudentById(Integer id);
}
