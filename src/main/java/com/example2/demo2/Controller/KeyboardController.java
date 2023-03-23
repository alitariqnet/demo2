package com.example2.demo2.Controller;

import com.example2.demo2.Entity.Keyboard;
import com.example2.demo2.Service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KeyboardController {
    @Autowired
    KeyboardService keyboardService;

    @RequestMapping(value = "/keyboard", method = RequestMethod.GET, produces = "application/json")
    public void save(@RequestParam("id") int id, @RequestParam("model") String model,
                     @RequestParam("price")double price, @RequestParam("manufact") String manufact){
        Keyboard keyboard = new Keyboard();
        keyboard.setId(id);
        keyboard.setModel(model);
        keyboard.setManufacturer(manufact);
        keyboard.setPrice(price);
        keyboardService.save(keyboard);
    }

    @RequestMapping(value = "/keyboard", method = RequestMethod.GET, produces = "application/json")
    public void delete(@RequestParam("id") int id){
        keyboardService.delete(id);
    }
}
