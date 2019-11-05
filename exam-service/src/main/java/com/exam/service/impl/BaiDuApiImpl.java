package com.exam.service.impl;

import com.exam.dao.UserDao;
import com.exam.service.DemoService;
import com.exam.util.BaiDuAddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author 黄军威
 * @create 2019/9/30 12:04
 * @email hjunwei@foxmail.com
 */
@Service("baiDuApiImpl")
public class BaiDuApiImpl implements DemoService {
    @Autowired
    UserDao userDao;

    @Autowired
    BaiDuAddressUtil baiDuAddressUtil;

    @Value("${shop.baidu.address.preurl}")
    private String preUrl;

    /** 使用百度地图api，根据地址信息查询经纬度
     * */
    @Override
    public Object query() {
        String address = "北京市海淀区上地十街10号";
        System.out.println(preUrl);
        Map<String, String> map= baiDuAddressUtil.getLatAndLngByAddress(address);
        return map;
    }



    @Override
    public Object queryStudentById() {
        return null;
    }




}
