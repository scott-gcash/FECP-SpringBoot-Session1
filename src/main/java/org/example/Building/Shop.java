package org.example.Building;

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
    }
}
