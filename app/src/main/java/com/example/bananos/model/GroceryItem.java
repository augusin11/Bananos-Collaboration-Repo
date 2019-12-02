package com.example.sixhourgrind.model;

public class GroceryItem {
    private String name;
    private double price;
    private String units;
    private String store;
    private int quantity;


    public GroceryItem(String name, double price, String units, String store) {
        this.name = name;
        this.price = price;
        this.units = units;
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getQuantity() {
        return quantity;
    }
}

