package com.foundry;

public abstract class Product {
    protected final String name;
    protected final int price;
    protected int quantityAvailable;
    protected int quantitySold;

    public Product(String name, int price, int quantityAvailable){
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        quantitySold = 0;
    }

    public String toString(){
        return ("Name: " + name + ", Price:  " +  price + ", Quantity Available: " + quantityAvailable + ", Quantity Sold: " + quantitySold);
    }

    public void purchace(){
        quantityAvailable--;
        quantitySold++;
    }

    public void addInventory(){
        quantityAvailable++;
    }
}
