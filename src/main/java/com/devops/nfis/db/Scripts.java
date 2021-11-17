package com.devops.nfis.db;

import com.devops.nfis.FertilizerType;
import com.devops.nfis.entity.Fertilizer;
import com.devops.nfis.entity.Vendor;
import com.devops.nfis.entity.Warehouse;
import com.devops.nfis.repository.FertilizerRepository;
import com.devops.nfis.repository.VendorRepository;
import com.devops.nfis.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Scripts implements CommandLineRunner {

    @Autowired
    VendorRepository vendorRepository;

    @Autowired
    FertilizerRepository fertilizerRepository;

    @Autowired
    WarehouseRepository warehouseRepository;

    @Override
    public void run(String... args) throws Exception {
        saveVendors();
        saveFertilizer();
        saveWarehouses();
    }

    private void saveVendors() {
        Vendor vendor = new Vendor();
        vendor.setFirstName("Vendor");
        vendor.setLastName("Test");
        vendorRepository.save(vendor);
    }

    private void saveWarehouses() {
        Warehouse warehouse = new Warehouse();
        warehouse.setPremisesNumber("43");
        warehouse.setStreet1("Main street");
        warehouse.setStreet2("Royal Park");
        warehouse.setCity("Homagama");
        warehouseRepository.save(warehouse);
    }

    private void saveFertilizer() {
        Fertilizer fertilizer = new Fertilizer();
        fertilizer.setName("Fertilizer1");
        fertilizer.setBrandName("Brand1");
        fertilizer.setType(FertilizerType.ORGANIC);
        fertilizer.setExp(new Date(2025, 05, 05));
        fertilizerRepository.save(fertilizer);
    }
}
