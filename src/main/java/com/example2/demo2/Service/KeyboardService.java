package com.example2.demo2.Service;

import com.example2.demo2.Entity.Keyboard;
import com.example2.demo2.Interfaces.Peripheral;
import com.example2.demo2.Repository.KeyboardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class KeyboardService implements Peripheral {

    @Autowired
    KeyboardRepo keyboardRepo;

    public void save(Keyboard keyboard){
        keyboardRepo.save(keyboard);
    }

    public void delete(Integer id){
        keyboardRepo.deleteById(id);
    }
}
