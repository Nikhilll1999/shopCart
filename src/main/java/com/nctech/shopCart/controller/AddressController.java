package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.Address;
import com.nctech.shopCart.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressServices addressServices;

    @PostMapping("/")
    public void save(@RequestBody Address address) {
        addressServices.save(address);
    }

    @PutMapping("/")
    public void update(@RequestBody Address address) {
        addressServices.update(address);
    }
    @GetMapping("/")
    public List<Address>findAll(){
       return addressServices.findAll();
    }
    @GetMapping("{id}")
    public Address findById(@PathVariable Integer id){
      return   addressServices.findByID(id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        addressServices.delete(id);
    }
}
