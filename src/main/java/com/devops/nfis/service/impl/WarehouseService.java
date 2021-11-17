package com.devops.nfis.service.impl;

import com.devops.nfis.dto.WarehouseDTO;
import com.devops.nfis.entity.Warehouse;
import com.devops.nfis.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {

    @Autowired
    WarehouseRepository warehouseRepository;

    public Warehouse saveWarehouse(WarehouseDTO warehouseDTO){
        Warehouse warehouse = new Warehouse();
        warehouse.setCity(warehouseDTO.getCity());
        warehouse.setPremisesNumber(warehouseDTO.getPremisesNumber());
        warehouse.setStreet1(warehouseDTO.getStreet1());
        warehouse.setStreet2(warehouseDTO.getStreet2());
        return warehouseRepository.save(warehouse);
    }

}
