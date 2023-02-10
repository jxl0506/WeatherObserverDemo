package com.weather.service.impl;

import com.weather.observer.WeatherSubject;
import com.weather.dto.WeatherUpdateDTO;
import com.weather.service.WeatherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherSubject subject;

    /**
     * @param updateDTO
     * @return
     */
    @Override
    public String update(WeatherUpdateDTO updateDTO) {
        BeanUtils.copyProperties(updateDTO, subject);
        subject.notifyWeatherUpdateInfo();
        return "ok";
    }
}
