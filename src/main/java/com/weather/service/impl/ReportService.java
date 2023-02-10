package com.weather.service.impl;

import com.weather.observer.WeatherSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@Component
public class ReportService {

    @Autowired
    WeatherSubject subject;

    /**
     * 每隔一分钟报告一次天气信息
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void reportLatestWeatherInfo() {
        subject.notifyWeatherUpdateInfo();
    }

}
