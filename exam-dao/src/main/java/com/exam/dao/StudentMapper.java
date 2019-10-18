package com.exam.dao;

import com.exam.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 黄军威
 * @create 2019/10/18 11:32
 * @email hjunwei@foxmail.com
 */
@Mapper
public interface StudentMapper {
    Student queryStudentById(Integer id);
}
