package com.devops.nfis.controller;

import com.devops.nfis.dto.StoreDTO;
import com.devops.nfis.service.impl.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
    @Autowired
    StoreService storeService;

    public ResponseEntity<?> saveStore(StoreDTO storeDTO){
        return ResponseEntity.ok(storeService.saveStore(storeDTO));
    }
}
