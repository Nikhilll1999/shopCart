package com.nctech.shopCart.dto;

import jakarta.persistence.*;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String shopName;
    private String ownerName;
    @ManyToOne
    private Address address;
    private String mobile;

    public Seller(){}
    public Seller(Integer id,String shopName,String ownerName,Address address,String mobile){
        this.id=id;
        this.shopName=shopName;
        this.ownerName=ownerName;
        this.address=address;
        this.mobile=mobile;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
