package org.example.Building;

import java.util.HashMap;
import java.util.Map;

public class Shop extends Building{
    private String type;

    public Shop(String type) {
        this.type = type;
    }

    public String getShopType() {
        return type;
    }

    public void setShopType(String type) {
        this.type = type;

    private Map<String,Double> products = new HashMap<>();

    public Shop(){}

    public void addProducts(String name, Double price){
        this.products.put(name, price);
    }

    public Map<String, Double> getProducts(){
        return this.products;
    }

    public boolean hasProducts(){
        return !products.isEmpty();

    }
}
