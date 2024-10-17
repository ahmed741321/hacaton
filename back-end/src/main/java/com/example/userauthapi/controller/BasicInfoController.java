package com.example.userauthapi.controller;

import com.example.userauthapi.entity.BasicInfo;
import com.example.userauthapi.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/basicinfo")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    // عرض كل المعلومات الأساسية
    @GetMapping
    public List<BasicInfo> getAllBasicInfo() {
        return basicInfoService.getAllBasicInfo();
    }

    // عرض معلومات أساسية حسب ID
    @GetMapping("/{id}")
    public ResponseEntity<BasicInfo> getBasicInfoById(@PathVariable Long id) {
        return basicInfoService.getBasicInfoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // إضافة معلومات أساسية جديدة
    @PostMapping
    public BasicInfo createBasicInfo(@RequestBody BasicInfo basicInfo) {
        return basicInfoService.saveBasicInfo(basicInfo);
    }
}
