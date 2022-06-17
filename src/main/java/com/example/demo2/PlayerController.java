package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;


public class PlayerController extends Pane {
    @FXML
    public PlayerViewBuilderFactory.PlayerViewBuilder playerViewBuilder;

    public int money;
    public ArrayList<String> properties = new ArrayList<>();

    public PlayerController() {

        this.money = 1200;
        this.playerViewBuilder = new PlayerViewBuilderFactory.PlayerViewBuilder();
        this.getChildren().add(playerViewBuilder.build());

    }

    public void moveXpos() {
        PlayerView player = playerViewBuilder.playerView1;
         double playerx = playerViewBuilder.playerView1.getX();
         double playery = playerViewBuilder.playerView1.getY();
         System.out.println("\n\n");

        if(playerx < 510 && playery == 0){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + playerx + "\t" + "oldY " + playery + "\n");

            GridPane.setColumnIndex(player, GridPane.getColumnIndex(player) + 1);
            player.setX(player.getX() + 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        else if(playerx == 510 && playery == 0){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + player.getX() + "\t" + "oldY " + player.getY() + "\n");

            GridPane.setRowIndex(player, GridPane.getRowIndex(player) + 1);
            player.setY(player.getY() + 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }
        else if(playerx == 510 && playery < 510){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + player.getX() + "\t" + "oldY " + player.getY() + "\n");

            GridPane.setRowIndex(player, GridPane.getRowIndex(player) + 1);
            player.setY(player.getY() + 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        else if(playerx == 510 && playery == 510){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + playerx + "\t" + "oldY " + playery + "\n");

            GridPane.setColumnIndex(player, GridPane.getColumnIndex(player) - 1);
            player.setX(player.getX() - 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        else if(playerx > 0 && playery == 510){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + playerx + "\t" + "oldY " + playery + "\n");

            GridPane.setColumnIndex(player, GridPane.getColumnIndex(player) - 1);
            player.setX(player.getX() - 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        else if(playerx == 0 && playery == 510){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + playerx + "\t" + "oldY " + playery + "\n");

            GridPane.setRowIndex(player, GridPane.getRowIndex(player) - 1);
            player.setY(player.getY() - 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        else if(playerx == 0 && playery > 0){
            System.out.println("------------------------------------------------");
            System.out.println("oldX " + playerx + "\t" + "oldY " + playery + "\n");

            GridPane.setRowIndex(player, GridPane.getRowIndex(player) - 1);
            player.setY(player.getY() - 85);

            System.out.println("newX " + player.getX() + "\t" + "newY " + player.getY() + "\n");
            System.out.println("Col: " + GridPane.getColumnIndex(player) + "\t" + "Row " + GridPane.getRowIndex(player));
            System.out.println("------------------------------------------------");

        }

        //
        // System.out.println(playerViewBuilder.playerView1.getX());
    }

    public int setMoney(int x){
        this.money = this.money + x;
        return this.money;
    }
}