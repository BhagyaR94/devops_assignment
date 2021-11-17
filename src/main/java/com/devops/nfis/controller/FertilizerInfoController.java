package com.devops.nfis.controller;

import com.devops.nfis.dto.FertilizerDTO;
import com.devops.nfis.service.impl.FertilizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FertilizerInfoController {

    @Autowired
    FertilizerService fertilizerService;

    @PostMapping("/saveFertlizer")
    public ResponseEntity<?> saveFertilizer(FertilizerDTO fertilizerDTO) {
        return ResponseEntity.ok(fertilizerService.saveFertilizer(fertilizerDTO));
    }

}
