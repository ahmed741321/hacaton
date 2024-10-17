package com.example.userauthapi.controller;

import com.example.userauthapi.entity.BasicInfo;
import com.example.userauthapi.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/basicinfo")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    @GetMapping
    public List<BasicInfo> getAllBasicInfo() {
        return basicInfoService.getAllBasicInfo();
    }

    @PostMapping
    public BasicInfo createBasicInfo(@RequestBody BasicInfo basicInfo) {
        return basicInfoService.saveBasicInfo(basicInfo);
    }
}
