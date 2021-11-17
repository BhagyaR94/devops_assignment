package com.devops.nfis.controller;

import com.devops.nfis.dto.WarehouseDTO;
import com.devops.nfis.service.impl.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping("/saveWarehouse")
    public ResponseEntity<?> saveWarehouse(WarehouseDTO warehouseDTO) {
        return ResponseEntity.ok(warehouseService.saveWarehouse(warehouseDTO));
    }

}
