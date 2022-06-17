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

        public String playerimageUrl = "players-images/player1.png";

        public PlayerModel playerModel;
        public PlayerView playerView;

        public String getPlayerimageUrl() {
            return playerimageUrl;
        }

        @Override
        public PropertyController build() {

            return new PropertyController();
        }
    }

    private final JavaFXBuilderFactory defaultBuilderFactory = new JavaFXBuilderFactory();

    @Override
    public Builder<?> getBuilder(Class<?> aClass) {
        return defaultBuilderFactory.getBuilder(aClass);
    }


}