package com.example2.demo2.Service;

import com.example2.demo2.Entity.Item;
import com.example2.demo2.Interfaces.Peripheral;
import com.example2.demo2.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KeyboardService implements Peripheral {

    @Autowired
    ItemRepo itemRepo;

    public void save(Item item){
        itemRepo.save(item);
    }

    public void delete(Integer id){
        itemRepo.deleteById(id);
    }
}
