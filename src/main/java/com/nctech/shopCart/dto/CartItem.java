package com.nctech.shopCart.dto;

import jakarta.persistence.*;

@Entity

public class CartItem {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Product product;
    private Integer quantity;
    private Double totalPrice;

    public CartItem(){}

    public CartItem(Integer id,Product product,Integer quantity,Double totalPrice){
        this.id=id;
        this.product=product;
        this.quantity=quantity;
        this.totalPrice=totalPrice;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
