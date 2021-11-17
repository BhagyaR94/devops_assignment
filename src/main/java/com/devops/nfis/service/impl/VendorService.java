package com.devops.nfis.service.impl;

import com.devops.nfis.dto.VendorDTO;
import com.devops.nfis.entity.Vendor;
import com.devops.nfis.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    @Autowired
    VendorRepository vendorRepository;

    public Vendor saveVendor(VendorDTO vendorDTO) {
        Vendor vendor = new Vendor();
        vendor.setFirstName(vendorDTO.getFirstName());
        vendor.setLastName(vendorDTO.getLastName());
        return vendorRepository.save(vendor);
    }
}
