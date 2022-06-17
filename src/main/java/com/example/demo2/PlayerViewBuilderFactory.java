package com.example.demo2;

import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.image.Image;
import javafx.util.Builder;
import javafx.util.BuilderFactory;

public class PlayerViewBuilderFactory implements BuilderFactory {

    public static class PlayerViewBuilder implements Builder<PlayerView>{

        PlayerModel playerModel;
        PlayerView playerView1;

        @Override
        public PlayerView build(){
            playerModel = new PlayerModel("players-images/player1.png");
            return playerView1 = new PlayerView(playerModel);

        }
    }

    private final JavaFXBuilderFactory defaultBuilderFactory = new JavaFXBuilderFactory();

    @Override
    public Builder<?> getBuilder(Class<?> type) {
        return (type == PlayerView.class) ? new PlayerViewBuilder() : defaultBuilderFactory.getBuilder(type);
    }
}
