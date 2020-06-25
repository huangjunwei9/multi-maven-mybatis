package com.exam.function;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 黄军威
 * @create 2019/10/22 9:41
 * @email hjunwei@foxmail.com
 */
public class TestMainBaiduApi {
    private static final String ak = "lrG7VXEDXLKmIkXqD2HZFV7qm55s7LMI";//"lrG7VXEDXLKmIkXqD2HZFV7qm55s7LMI";
    private static final String preHttp = "http://api.map.baidu.com/geocoding/v3/?";

    /**
     * 根据地址信息获取纬度和经度
     *
     * @author huangjunwei
     * @Param addr
     * @return map
     * */
    public static Map<String, String> getLatAndLngByAddress(String addr) {
        String address = "";
        try {
            address = java.net.URLEncoder.encode(addr,"UTF-8");
            String url = preHttp + "address=" + address + "&output=json&ak=" + ak; //get请求的url
            URL myURL = null;
            URLConnection httpsConn = null;
            //进行转码
            try {
                myURL = new URL(url);
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
                return new HashMap<>();
            }
            StringBuffer sb = new StringBuffer();

            httpsConn = myURL.openConnection();
            if (httpsConn != null) {
                InputStreamReader insr = new InputStreamReader(
                        httpsConn.getInputStream(), "UTF-8");
                BufferedReader br = new BufferedReader(insr);
                String data = null;
                while ((data = br.readLine()) != null) {
                    sb.append(data);
                }
                insr.close();
            }

            String realJson = sb.toString();
            JSONObject resultJson = JSON.parseObject(realJson);
            JSONObject locationObj = null;
            Map<String, String> map = new HashMap<>();
            locationObj = (JSONObject)((JSONObject)resultJson.get("result")).get("location");
            if(locationObj.get("lat") != null){
                map.put("lat", locationObj.get("lat").toString());//纬度
            }
            if(locationObj.get("lng") != null){
                map.put("lng", locationObj.get("lng").toString());//经度
            }
            return map;
        }catch(Exception e){
            System.out.println("未获取到相应经纬度，可能原因：地址不合格。");
            return new HashMap<>();
        }
    }


    public static void main(String[] args) throws IOException {
        A a = new A();
        a.aa = "1";
        a.bb = "2";

        TestMainBaiduApi getLatAndLngByBaidu = new TestMainBaiduApi();
        Map<String, String> map = getLatAndLngByBaidu.getLatAndLngByAddress("北京市-");
        System.out.println(map.get("lat"));// 我好
        System.out.println(map.get("lng"));
    }

    public static class A{
        String aa;
        String bb;
    }
}