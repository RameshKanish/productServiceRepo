package com.example.product.service;

import com.example.product.dtoa.WhetherReportDto;
import com.example.product.models.Whether;
import org.springframework.web.client.RestTemplate;

public class WhetherReportService implements WhetherService{

    @Override
    public Whether getWhetherReport(int id) {
        String url = "http://api.weatherapi.com/v1/current.json?key=f594e967b13247d98b3121035242608&q=London";
        RestTemplate rest = new RestTemplate();
        WhetherReportDto whether = rest.getForObject(url , WhetherReportDto.class);

    }
    public Whether convertWhetherToDto(Whether whether){
        Whether wh = new Whether();
        wh.setCountry(wh.setCountry());

    }
}