package com.example.demo2;

import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.Builder;
import javafx.util.BuilderFactory;

public class PlayerControllerBuilderFactory implements BuilderFactory {


    public static class PlayerControllerBuilder implements Builder<PlayerController> {

        public String playerimageUrl = "players-images/player1.png";

        public PlayerModel playerModel;
        public PlayerView playerView;

        public String getPlayerimageUrl() {
            return playerimageUrl;
        }

        @Override
        public PlayerController build() {

            return new PlayerController();
        }
    }

    public static class PropertyControllerBuilder implements Builder<PropertyController> {

        public String name;
        public int price;
        public int rent;
        public int colIndex;
        public int rowIndex;

        public int getColIndex() {
            return colIndex;
        }

        public void setColIndex(int colIndex) {
            this.colIndex = colIndex;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getRent(){
            return rent;
        }

        public void setRent(int rent) {
            this.rent = rent;
        }

        public int getRowIndex() {
            return rowIndex;
        }

        public void setRowIndex(int rowIndex) {
            this.rowIndex = rowIndex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public PropertyController build() {

            return new PropertyController(name, price, rent, colIndex, rowIndex);
        }
    }

    private final JavaFXBuilderFactory defaultBuilderFactory = new JavaFXBuilderFactory();

    @Override
    public Builder<?> getBuilder(Class<?> aClass) {
        return defaultBuilderFactory.getBuilder(aClass);
    }


}