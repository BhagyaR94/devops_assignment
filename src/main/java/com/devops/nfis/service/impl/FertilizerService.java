package com.devops.nfis.service.impl;

import com.devops.nfis.dto.FertilizerDTO;
import com.devops.nfis.entity.Fertilizer;
import com.devops.nfis.repository.FertilizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FertilizerService {

    @Autowired
    FertilizerRepository fertilizerRepository;

    public Fertilizer saveFertilizer(FertilizerDTO fertilizerDTO){
        Fertilizer fertilizer = new Fertilizer();
        fertilizer.setName(fertilizerDTO.getName());
        fertilizer.setBrandName(fertilizerDTO.getBrandName());
        fertilizer.setType(fertilizerDTO.getType());
        fertilizer.setExp(fertilizerDTO.getExp());

        return fertilizerRepository.save(fertilizer);
    }

}
