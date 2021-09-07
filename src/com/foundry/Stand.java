package com.foundry;

public class Stand {
    protected Product[] inventory;


    public void displayFruit(){
        for (Product product : inventory) {
            System.out.println(product);
        }
    }

}
