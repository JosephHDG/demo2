package com.example.demo2;

public class PropertyModel {

    public int price;
    public int rent;
    public int colindex;
    public int rowindex;
    public String name;
    public PlayerController owner;

    public PropertyModel(String name, int price, int rent, int colindex, int rowindex){
        this.price = price;
        this.rent =  rent;
        this.name = name;
        this.colindex = colindex;
        this.rowindex = rowindex;

    }

    public int getPrice(){
        return this.price;
    }

    public int getRent() {
        return this.rent;
    }

    public int getColindex() {
        return this.colindex;
    }

    public int getRowindex(){
        return this.rowindex;
    }

    public void setPrice(int newprice){
        this.price = newprice;
    }

    public void setRent(int newrent){
        this.rent = newrent;
    }

    public void setColindex(int newColindex){
        this.colindex = newColindex;
    }

    public void setRowindex(int newRowindex){
        this.rowindex = newRowindex;
    }

    public void setOwner(PlayerController owner){
        this.owner = owner;
    }
}
