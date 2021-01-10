package com.example.demologin;

import android.media.Image;

public class Item {

    String name;
    String brand;
    String price;
    String amountSaved;
    Integer imageUrl;

    public Item(String itemName, String itemBrand, String itemPrice, String costSaved, Integer imageUrl) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amountSaved = amountSaved;
        this.imageUrl = imageUrl;
    }

    public String getItemName() {
        return name;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public String getItemBrand() {
        return brand;
    }

    public void setItemBrand(String itemBrand) {
        this.brand = brand;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemPrice() {
        return price;
    }

    public void setItemPrice(String price) {
        this.price = price;
    }

    public String getAmountSaved() {
        return amountSaved;
    }

    public void setAmountSaved(String amountSaved) {
        this.amountSaved = amountSaved;
    }
}


