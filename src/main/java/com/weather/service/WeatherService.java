package com.weather.service;


import com.weather.dto.WeatherUpdateDTO;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
public interface WeatherService {

    String update(WeatherUpdateDTO updateDTO);

}
