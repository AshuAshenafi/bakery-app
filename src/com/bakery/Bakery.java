package com.bakery;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bakery {
    private String name;
    private double price;

    private int quantityInStock;

    private LocalDate expirationDate;

    private ArrayList<String> dietRestriction = new ArrayList<>();


    public Bakery() {
    }

    // constructor

    public Bakery(String name, double price, int quantityInStock, LocalDate expirationDate, ArrayList<String> dietRestriction) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.expirationDate = expirationDate;
        this.dietRestriction = dietRestriction;
    }

    // setters() and getters()

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

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ArrayList<String> getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(ArrayList<String> dietRestriction) {
        this.dietRestriction = dietRestriction;
    }
}   // end of com.backery.Bakery class
