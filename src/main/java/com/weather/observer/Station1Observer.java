package com.weather.observer;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@Component
public class Station1Observer extends Observer implements InitializingBean {

    @Autowired
    WeatherSubject subject;

    @Override
    public void updateWeather() {
        System.out.println(stationName() + " latest weather information :\n" + subject.getWeatherInfo());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        subject.addObserver(this);
    }

    @Override
    public String stationName() {
        return "Station1Observer";
    }
}
