package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.ShipAdd;
import com.nctech.shopCart.services.ShipAddServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipadd")
public class ShipAddController {
    @Autowired
   private ShipAddServices shipAddServices ;

    @PostMapping("/")
    public void save(@RequestBody ShipAdd shipAdd){
        shipAddServices.save(shipAdd);
    }
    @PutMapping("/")
    public void update(@RequestBody ShipAdd shipAdd){
        shipAddServices.update(shipAdd);
    }
    @GetMapping("{id}")
    public ShipAdd findById(@PathVariable Integer id){
       return shipAddServices.findById(id);
    }
    @GetMapping("/")
    public List<ShipAdd>findAll(){
        return shipAddServices.findAll();
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        shipAddServices.delete(id);
    }
}
