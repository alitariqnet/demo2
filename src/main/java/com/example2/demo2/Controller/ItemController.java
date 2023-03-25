package com.example2.demo2.Controller;

import com.example2.demo2.Entity.Item;
import com.example2.demo2.Service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
    @Autowired
    KeyboardService keyboardService;

    @RequestMapping(value = "/keyboard", method = RequestMethod.GET, produces = "application/json")
    public void save(@RequestParam("id") int id, @RequestParam("model") String model,
                     @RequestParam("price")double price, @RequestParam("manufact") String manufact){
        Item item = new Item();
        item.setId(id);
        item.setModel(model);
        item.setManufacturer(manufact);
        item.setPrice(price);
        keyboardService.save(item);
    }

    @RequestMapping(value = "/keyboard", method = RequestMethod.GET, produces = "application/json")
    public void delete(@RequestParam("id") int id){
        keyboardService.delete(id);
    }
}
