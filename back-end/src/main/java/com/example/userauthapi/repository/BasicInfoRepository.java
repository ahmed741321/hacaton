package com.example.userauthapi.repository;

import com.example.userauthapi.entity.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
}
