package com.devops.nfis.repository;

import com.devops.nfis.entity.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FertilizerRepository extends JpaRepository<Fertilizer, Long> {
}
