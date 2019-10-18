package com.exam.controller;

import com.exam.dao.StudentMapper;
import com.exam.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 黄军威
 * @create 2019/9/30 11:12
 * @email hjunwei@foxmail.com
 */

@RestController
@RequestMapping("/demo1")
public class DemoController {

    @Autowired
    @Qualifier("demoService1Impl")//("demoService1Impl")
    DemoService demoService1;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    @Qualifier("demoService2Impl")//("demoService1Impl")
    DemoService demoService2;

    /** 调用DemoService1Impl
     *
     * @param
     * */
    @GetMapping("/test1")
    public Object test1() {
        return demoService1.query();
    }

    @GetMapping("/test2")
    public Object test2() {
        return demoService2.query();
    }

    /**
     * 根据ID查询学生
     * */
    @GetMapping("/test3")
    public Object test3() {
        studentMapper.queryStudentById(1);
        return demoService2.queryStudentById();
    }



}
