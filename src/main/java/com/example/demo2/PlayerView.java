package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;


public class PlayerView extends javafx.scene.image.ImageView {

    public PlayerView(PlayerModel playermodelimg){

        this.setImage(playermodelimg);

    }

    public void moveX(){
        this.setX(20);
    }



}
