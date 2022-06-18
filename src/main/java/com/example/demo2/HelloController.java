package com.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;


public class HelloController {

    @FXML
    public Label balans;

    @FXML
    public ListView<String> list;

    @FXML
    public Button koop;

    @FXML
    public DialogPane popupdialog;

    @FXML
    public TextArea popuptext;

    @FXML
    public Pane main;

    @FXML
    public PlayerController playerController1 = new PlayerController();

    @FXML
    public PropertyController propertyController1, propertyController2, propertyController3, propertyController4;

    @FXML
    public GridPane gridPane;

    @FXML
    public ArrayList<PropertyController> propertyControllers;

    public void movePlayer(){
        playerController1.moveXpos();
    }

    public void checkCurrentRowAndCol() {
        System.out.println(GridPane.getColumnIndex(playerController1.playerViewBuilder.playerView1) + "\t" + GridPane.getRowIndex(playerController1.playerViewBuilder.playerView1));
        System.out.println(propertyControllers.get(0).colIndex + "\t" + propertyControllers.get(0).rowIndex);
        System.out.println(propertyControllers.get(0));
        for (int i = 0; i < propertyControllers.size(); i++) {
            if (GridPane.getColumnIndex(playerController1.playerViewBuilder.playerView1) == propertyControllers.get(i).colIndex) {
                if (GridPane.getRowIndex(playerController1.playerViewBuilder.playerView1) == propertyControllers.get(i).rowIndex) {
                    System.out.println(propertyControllers.get(i));
                }
            }


            if(GridPane.getColumnIndex(playerController1.playerViewBuilder.playerView1) == 2){; //add row index
                 popuptext.setWrapText(true);
                 popuptext.setText("U Staat nu op het paarsevak, wilt u dit eigendom kopen?" + "\n");
                 popuptext.appendText("\n" + "Price: " + Integer.toString(propertyController1.propertyModel1.getPrice()) + "\n");
                 popuptext.appendText("Rent: " + Integer.toString(propertyController1.propertyModel1.getRent()));
                 System.out.println(propertyController1.propertyModel1.getPrice());
                 popupdialog.setVisible(true);

             }else {
                 popupdialog.setVisible(false);
             }
        }
    }

    public void Koop(){
        //list.getItems().add(0, propertyController1.propertyModel1.name + "\t\t" + propertyController1.propertyModel1.getPrice());
        //balans.setText(Integer.toString(playerController1.setMoney(- propertyController1.propertyModel1.getPrice())));

    }
    public void initialize() {
        playerController1.setLayoutY(+15);
        playerController1.setLayoutX(15);

        playerController1.playerViewBuilder.playerView1.setFitHeight(50);
        playerController1.playerViewBuilder.playerView1.setFitWidth(50);
        playerController1.setVisible(true);



        //propertyController1 = new PropertyController("PannenkoekenHuis", 600, 120, 3, 0);
        //propertyController2 = new PropertyController("Sierplein", 450, 250, 6, 4 );
        //propertyController3 = new PropertyController("NS-Spoorwegen", 20000, 8500, 3, 6);
        //propertyController4 = new PropertyController("PC-Hoofdstraat", 250000, 120000, 0, 4);

        //propertyControllers =  new ArrayList<>();
        //propertyControllers.add(propertyController1);
        //propertyControllers.add(propertyController2);
        //propertyControllers.add(propertyController3);
        //propertyControllers.add(propertyController4);


        GridPane.setColumnIndex(playerController1.playerViewBuilder.playerView1, 0);
        GridPane.setRowIndex(playerController1.playerViewBuilder.playerView1, 0);

        popupdialog.setVisible(false);

    }

    public static class HelloApplication extends Application {
        @Override
        public void start(Stage stage) throws IOException {

            stage.setResizable(true);

            Parent fxmlLoader = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource("hello-view.fxml")), null, new PlayerControllerBuilderFactory());

            Scene scene = new Scene(fxmlLoader, 800, 800);


            stage.setScene(scene);
            stage.setX(Screen.getPrimary().getVisualBounds().getWidth() - stage.getWidth() / 2);
            stage.setY(Screen.getPrimary().getVisualBounds().getHeight() - stage.getHeight() / 2);

            System.out.print(scene.getRoot());
            scene.setRoot(fxmlLoader);
            stage.setTitle("Hello!");

            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
