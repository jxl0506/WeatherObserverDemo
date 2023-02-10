package com.weather;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;

import java.util.Date;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
public class Test {

    @org.junit.Test
    public void updateWeaterInfo() {
        JSONObject body = new JSONObject();
        body.set("time", new Date());
        body.set("temperature", "24");
        body.set("humidity", "60");
        body.set("pressure", "30.4f");
        HttpUtil.post("http://localhost:8080/weather/update", body.toString());

        body.clear();
        body.set("time", new Date());
        body.set("pressure", "30.4f");
        HttpUtil.post("http://localhost:8080/weather/update", body.toString());

        body.clear();
        body.set("time", new Date());
        body.set("temperature", "25");
        body.set("humidity", "50");
        body.set("pressure", "31.4f");
        HttpUtil.post("http://localhost:8080/weather/update", body.toString());
    }

}
