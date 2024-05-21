package com.darkcode.app.domain;
import lombok.Data;

@Data
public class Product {
    private String product_name;
    private String category_name;
    private float price;


    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}