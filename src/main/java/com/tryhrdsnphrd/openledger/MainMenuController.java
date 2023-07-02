package com.tryhrdsnphrd.openledger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class MainMenuController {
    // All the variables for our MainMenu.fxml file are here.

    // Main Pane
    @FXML private Pane MainMenu_Pane;
    // Buttons
    @FXML private Button MainMenu_FileButton;
    @FXML private Button MainMenu_SettingsButton;

    // Code for our MainMenu.fxml file is here.
    @FXML
    private void on_MainMenu_FileButtonClicked() {
        System.out.println("File button clicked");
    }

    @FXML
    private void on_MainMenu_SettingsButtonClicked() {
        System.out.println("Settings button clicked");
    }
}
