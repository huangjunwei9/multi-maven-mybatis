package com.exam.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.exam.util.model.BaiDu;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 黄军威
 * @create 2019/11/5 9:11
 * @email hjunwei@foxmail.com
 */
@Component
public class BaiDuAddressUtil {
    /**
     * 百度地图api前缀网址
     * */
    @Value("${shop.baidu.address.preurl}")
    private String preUrl;

    /**
     * 百度地图api的AK
     * */
    @Value("${shop.baidu.address.ak}")
    private String geoAK;



    /**
     * 根据地址信息获取纬度和经度
     *
     * @author huangjunwei
     * @Param addr
     * @return map 包含lat、lng两个Key
     * */
    public Map<String, String> getLatAndLngByAddress(String addr) {
        try {
            String address = java.net.URLEncoder.encode(addr,"UTF-8");
            String url = preUrl + "address=" + address + "&output=json&ak=" + geoAK; //get请求的url
            URL myURL = new URL(url);
            StringBuffer sb = new StringBuffer();
            URLConnection httpsConn = myURL.openConnection();// 通过URL对象构造URLConnection对象
            //进行转码
            if (httpsConn != null) {
                InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream(), "UTF-8");
                BufferedReader br = new BufferedReader(insr);
                String data = null;
                while ((data = br.readLine()) != null) {
                    sb.append(data);
                }
                insr.close();
            }

            String realJson = sb.toString();
            JSONObject resultJson = JSON.parseObject(realJson);
            Map<String, String> map = new HashMap<>(5);

            if(resultJson.isEmpty()){
                System.out.println("百度地图resultJson为null");
                return null;
            }
            if(resultJson.getJSONObject(BaiDu.RESULT).isEmpty()){
                System.out.println("百度地图result为null");
                return  null;
            }
            if(resultJson.getJSONObject(BaiDu.RESULT).getJSONObject(BaiDu.LOCATION).isEmpty()){
                System.out.println("百度地图location为null");
                return null;
            }
            JSONObject locationObj = resultJson.getJSONObject(BaiDu.RESULT).getJSONObject(BaiDu.LOCATION);//获取纬度和精度
            if(locationObj.get(BaiDu.LAT) != null){
                map.put(BaiDu.LAT, locationObj.get(BaiDu.LAT).toString());//纬度
            }
            if(locationObj.get(BaiDu.LNG) != null){
                map.put(BaiDu.LNG, locationObj.get(BaiDu.LNG).toString());//经度
            }
            return map;
        }catch(Exception e){
            System.out.println("未获取到相应经纬度，可能原因：addr问题、ak问题。 errorMsg={}, e={}" + e.getMessage() + e);
        }
        return null;
    }

    /**
     * 测试根据地址信息获取纬度和经度方法
     * */
    public void main(String [] args){
        Map<String, String> map = new BaiDuAddressUtil().getLatAndLngByAddress("中国石油大学");
        System.out.println(map.get(BaiDu.LAT));
        System.out.println(map.get(BaiDu.LNG));
    }

}
