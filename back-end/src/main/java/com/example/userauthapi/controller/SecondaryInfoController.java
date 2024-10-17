package com.example.userauthapi.controller;

import com.example.userauthapi.entity.SecondaryInfo;
import com.example.userauthapi.service.SecondaryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secondaryinfo")
public class SecondaryInfoController {

    @Autowired
    private SecondaryInfoService secondaryInfoService;

    // عرض كل العناصر
    @GetMapping
    public List<SecondaryInfo> getAll() {
        return secondaryInfoService.findAll();
    }

    // عرض عنصر حسب ID
    @GetMapping("/{id}")
    public ResponseEntity<SecondaryInfo> getById(@PathVariable Long id) {
        return secondaryInfoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // إضافة عنصر جديد
    @PostMapping
    public SecondaryInfo create(@RequestBody SecondaryInfo secondaryInfo) {
        return secondaryInfoService.save(secondaryInfo);
    }

    // حذف عنصر حسب ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        secondaryInfoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
