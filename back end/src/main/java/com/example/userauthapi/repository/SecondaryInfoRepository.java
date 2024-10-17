package com.example.userauthapi.repository;

import com.example.userauthapi.entity.SecondaryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryInfoRepository extends JpaRepository<SecondaryInfo, Long> {
}
