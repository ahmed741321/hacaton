package com.example.userauthapi.service;

import com.example.userauthapi.entity.BasicInfo;
import com.example.userauthapi.repository.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasicInfoService {

    @Autowired
    private BasicInfoRepository basicInfoRepository;

    // الحصول على جميع المعلومات الأساسية
    public List<BasicInfo> getAllBasicInfo() {
        return basicInfoRepository.findAll();
    }

    // الحصول على معلومات أساسية حسب ID
    public Optional<BasicInfo> getBasicInfoById(Long id) {
        return basicInfoRepository.findById(id);
    }

    // حفظ معلومات أساسية جديدة
    public BasicInfo saveBasicInfo(BasicInfo basicInfo) {
        return basicInfoRepository.save(basicInfo);
    }
}
