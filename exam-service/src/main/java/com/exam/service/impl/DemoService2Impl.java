package com.exam.service.impl;

import com.exam.dao.StudentDao;
import com.exam.entity.Student;
import com.exam.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄军威
 * @create 2019/9/30 13:24
 * @email hjunwei@foxmail.com
 */
@Service("demoService2Impl")
public class DemoService2Impl implements DemoService {

    @Autowired
    StudentDao studentDao;

    /**
     * 根据用户Id查询User
     * */
    @Override
    public Object query() {
        return new Student();
    }

    /**
     * 根据用户Id查询Student
     * */
    @Override
    public Object queryStudentById(){
        Integer id = 1;
        Student student = studentDao.queryStudentById(id);
        return student;
    }
}
