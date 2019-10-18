package com.exam.dao;

import com.exam.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 黄军威
 * @create 2019/10/18 11:16
 * @email hjunwei@foxmail.com
 */
@Mapper
public interface UserMapper {
    User queryUserById(Integer id);
}
