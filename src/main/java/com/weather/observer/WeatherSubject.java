package com.weather.observer;

import cn.hutool.core.date.format.FastDateFormat;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@Data
@Component
public class WeatherSubject {

    private Date time;

    private String temperature;

    private String humidity;

    private String pressure;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String getTemperature() {
        if(StringUtils.isEmpty(temperature)) {
            return "unknown";
        }
        return temperature;
    }

    public String getHumidity() {
        if(StringUtils.isEmpty(humidity)) {
            return "unknown";
        }
        return humidity;
    }

    public String getPressure() {
        if(StringUtils.isEmpty(pressure)) {
            return "unknown";
        }
        return pressure;
    }

    public String getWeatherInfo() {
        if(time == null) {
            return "no data";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("time:").append(FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(time)).append(", \n")
                .append("temperature:").append(getTemperature()).append(", \n")
                .append("humidity:").append(getHumidity()).append(", \n")
                .append("pressure:").append(getPressure());
        return sb.toString();
    }

    public void notifyWeatherUpdateInfo() {
        System.out.println("********* notify weather update info start *********");
        for (Observer observer : observers) {
            observer.updateWeather();
        }
        System.out.println("********* notify weather update info end *********\n\t");
    }

}
