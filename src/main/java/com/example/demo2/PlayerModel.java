package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class PlayerModel extends javafx.scene.image.Image {

    private int xpos;
    private int ypos;
    private int money = 0;

    public PlayerModel(String playerImageUrl){
        super(playerImageUrl);

    }

    public void setXpos(int x){
        this.xpos = x;
    }

    public int getXpos(){
        return this.xpos;
    }

    public void setYpos(int y){
        this.ypos = y;
    }

    public int getYpos(){
        return this.ypos;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }

}
