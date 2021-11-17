package com.devops.nfis.service.impl;

import com.devops.nfis.dto.StoreDTO;
import com.devops.nfis.entity.Store;
import com.devops.nfis.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public Store saveStore(StoreDTO storeDTO) {
        Store store = new Store();
        store.setQty(storeDTO.getQty());
        return storeRepository.save(store);
    }

}
