package com.weather.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@Data
public class WeatherUpdateDTO {

    private Date time;

    private String temperature;

    private String humidity;

    private String pressure;

}
