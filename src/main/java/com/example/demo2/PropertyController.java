package com.example.demo2;

import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PropertyController extends Pane {

    public boolean isOwned = false;
    String name;
    int price;
    int rent;
    int colIndex;
    int rowIndex;
    public PropertyModel propertyModel;

    public PropertyController(String name, int price, int rent, int colIndex, int rowIndex){

        this.name = name;
        this.price = price;
        this.rent = rent;
        this.colIndex = colIndex;
        this.rowIndex = rowIndex;

        this.propertyModel = new PropertyModel(name, price, rent, colIndex, rowIndex);
        //this.propertyModel1 = new PropertyModel("Prop1", 200, 120, 2, 0);
        //this.propertyModel2 = new PropertyModel("Prop2", 550, 350, 6, 4);
        //this.propertyModel3 = new PropertyModel("Prop3", 2000, 1150, 0, 4);

        //properties.add(propertyModel1);
        //properties.add(propertyModel2);
        //properties.add(propertyModel3);
    }

    public PropertyController() {

    }

    public int getPropertyPrice(PropertyModel propertyModel){
        return propertyModel.getPrice();
    }

    public void setPropertyValaue(PropertyModel propertyModel, int price){
        propertyModel.setPrice(price);

    }

}

