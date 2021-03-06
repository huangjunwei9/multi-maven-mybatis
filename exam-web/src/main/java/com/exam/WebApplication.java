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
        System.out.println("成功启动3   ?  ");
        System.out.println("成功启动4   ?");
        System.out.println("成功启动5   ?早上2019/10/10");
        System.out.println("2020.06.25 dev-hjw 19:48");
        System.out.println("2020.06.25 dev-hjw 21：31");
        System.out.println("2020.06.25 dev-yhy 21：36");
        /****
         * 你好
         * **/

    }
}
