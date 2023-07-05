package com.tryhrdsnphrd.openledger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Get our screen so that we can set the size of the window to the size of the screen.
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WelcomeScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
        stage.setTitle("OpenLedger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}