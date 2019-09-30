package com.exam.dao;

import com.exam.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author 黄军威
 * @create 2019/9/30 14:08
 * @email hjunwei@foxmail.com
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = 1")
    User getById();
}
