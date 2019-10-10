package com.exam.service.impl;

import com.exam.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @Author 黄军威
 * @create 2019/9/30 13:24
 * @email hjunwei@foxmail.com
 */
@Service("demoService2Impl")
public class DemoService2Impl implements DemoService {
    private int b = 1;

    @Override
    public String test() {
        return "test2";
    }
}
