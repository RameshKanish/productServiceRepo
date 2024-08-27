package com.example.product.controller;

import com.example.product.models.Whether;
import com.example.product.service.WhetherReportService;
import com.example.product.service.WhetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/whether")

public class whetherReportController {
    @Autowired
    public WhetherService whetherReport;

    @GetMapping("/whether/{id}")
    public ResponseEntity<Whether> getWhetherById(@PathVariable ("id") int id){
        Whether wh = whetherReport.getWhetherReport(id);
        return new ResponseEntity<>(wh , HttpStatusCode.valueOf(400) );
    }
}