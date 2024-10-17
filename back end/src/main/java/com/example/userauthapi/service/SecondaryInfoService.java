package com.example.userauthapi.service;

import com.example.userauthapi.entity.SecondaryInfo;
import com.example.userauthapi.repository.SecondaryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecondaryInfoService {

    @Autowired
    private SecondaryInfoRepository secondaryInfoRepository;

    public List<SecondaryInfo> findAll() {
        return secondaryInfoRepository.findAll();
    }

    public Optional<SecondaryInfo> findById(Long id) {
        return secondaryInfoRepository.findById(id);
    }

    public SecondaryInfo save(SecondaryInfo secondaryInfo) {
        return secondaryInfoRepository.save(secondaryInfo);
    }

    public void deleteById(Long id) {
        secondaryInfoRepository.deleteById(id);
    }
}
