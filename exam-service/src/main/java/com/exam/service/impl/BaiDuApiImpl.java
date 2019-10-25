package com.exam.service.impl;

import com.exam.dao.UserDao;
import com.exam.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 黄军威
 * @create 2019/9/30 12:04
 * @email hjunwei@foxmail.com
 */
@Service("baiDuApiImpl")
public class BaiDuApiImpl implements DemoService {
    @Autowired
    UserDao userDao;

    final String ak = "lrG7VXEDXLKmIkXqD2HZFV7qm55s7LMI";   //ak地址

    /** 使用百度地图api，根据地址信息查询经纬度
     * */
    @Override
    public Object query() {
        String address = "北京市海淀区上地十街10号";
        String url = "http://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + ak + "&callback=showLocation"; //get请求的url


        return null;
    }



    @Override
    public Object queryStudentById() {
        return null;
    }




}
