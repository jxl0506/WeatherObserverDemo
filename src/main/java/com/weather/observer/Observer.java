package com.weather.observer;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
public abstract class Observer {

    protected WeatherSubject subject;

    public abstract void updateWeather();

    public abstract String stationName();

}
