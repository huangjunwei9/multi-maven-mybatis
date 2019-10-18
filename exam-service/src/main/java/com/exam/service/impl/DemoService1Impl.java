package com.exam.service.impl;

import com.exam.dao.UserMapper;
import com.exam.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄军威
 * @create 2019/9/30 12:04
 * @email hjunwei@foxmail.com
 */
@Service("demoService1Impl")
public class DemoService1Impl implements DemoService {
    @Autowired
    UserMapper userMapper;

    /** 根据Id查询User
     *
     *
     * */
    @Override
    public Object query() {
        Integer userId = Integer.valueOf(1);
        return userMapper.queryById(userId);
    }

    @Override
    public Object queryStudentById() {
        return null;
    }



}
