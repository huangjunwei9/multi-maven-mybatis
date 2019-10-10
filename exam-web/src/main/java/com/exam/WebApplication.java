package com.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 黄军威
 * @create 2019/9/30 11:09
 * @email hjunwei@foxmail.com
 */
@SpringBootApplication(scanBasePackages = "com.exam")
@MapperScan("com.exam.dao")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        System.out.println("成功启动2");
        System.out.println("成功启动3   ?   啊");
        System.out.println("成功启动4   ?");
        System.out.println("pull");
        System.out.println("成功启动5   ?早上2019/10/10   你好");
    }
}
/** java招聘
 岗位职责：1、协助项目经历进行需求分析、系统设计、制定技术解决方案；
 2、负责java后台功能模块设计、开发、测试工作；
 3、优化现有服务模块，精简业务流程，解决项目线上问题。
 任职要求：1、本科及以上学历，3年以上工作经验
 2、熟悉Shell，熟悉Spring、SpringBoot，mybatis等框架
 3、熟悉常用开源软件，如nginx，MQ，redis调优
 4、对java虚拟机一定了解
 5、善于沟通，团队协作和学习能力强，有激情。
 * */