package com.devops.nfis.controller;

import com.devops.nfis.dto.VendorDTO;
import com.devops.nfis.service.impl.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendorController {

    @Autowired
    VendorService vendorService;

    @PostMapping("/saveVendor")
    public ResponseEntity<?> saveVendor(VendorDTO vendorDTO) {
        return ResponseEntity.ok(vendorService.saveVendor(vendorDTO));
    }
}
