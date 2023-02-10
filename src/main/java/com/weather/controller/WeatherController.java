package com.weather.controller;

import com.weather.dto.WeatherUpdateDTO;
import com.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jxl
 * @description: TODO
 * @date 2023/2/10
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    /**
     * 天气信息变化接口
     * @param updateDTO
     * @return
     */
    @PostMapping("/update")
    public String update(@RequestBody WeatherUpdateDTO updateDTO) {
        return weatherService.update(updateDTO);
    }

}
