package com.nctech.shopCart.controller;

import com.nctech.shopCart.dto.CartItem;
import com.nctech.shopCart.dto.Product;
import com.nctech.shopCart.services.CartItemServices;
import com.nctech.shopCart.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartitem")
public class CartItemController {
    @Autowired
    CartItemServices cartItemServices;

    @PostMapping("/")
    public void save(@RequestBody CartItem cartItem){
        cartItemServices.save(cartItem);
    }
    @PutMapping("/")
    public void update(@RequestBody CartItem cartItem){
        cartItemServices.update(cartItem);
    }
    @GetMapping("/{id}")
    public CartItem findById(@PathVariable Integer id){
      return   cartItemServices.findById(id);
    }
    @GetMapping("/")
    public List<CartItem>findAll(){
        return cartItemServices.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        cartItemServices.delete(id);
    }

    @PostMapping("/addtocart/{id}/{quantity}")
    public void addToCart(@PathVariable Integer id,@PathVariable Integer quantity){
        Product product = new Product();
        product.setId(id);
        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalPrice(product.getPrice()*quantity);

        cartItemServices.save(cartItem);
    }

    @GetMapping("/cart")
    public List<CartItem> getCartItems(){
        return  cartItemServices.findAll();
    }
}
