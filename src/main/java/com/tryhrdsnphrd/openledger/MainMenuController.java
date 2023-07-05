package com.tryhrdsnphrd.openledger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainMenuController {
    // All the variables for our MainMenu.fxml file are here.

    // Main VBox
    @FXML private VBox MainMenu_VBox;

    // MenuBar
    @FXML private MenuBar MainMenu_MenuBar;
    @FXML private Menu MainMenu_MenuFile;
    @FXML private MenuItem MainMenu_File_Exit;
    @FXML private Menu MainMenu_MenuHelp;
    @FXML private MenuItem MainMenu_Help_About;
    @FXML private MenuItem MainMenu_Help_Github;

    // MainMenu Text
    @FXML private VBox MainMenu_Interaction_VBox;

    // MainMenu Buttons
    @FXML private Button MainMenu_LoadLedger_Button;
    @FXML private Button MainMenu_NewLedger_Button;

    public MainMenuController() {
    }

    // Code for our MainMenu.fxml file is here.
    @FXML
    private void on_MainMenu_File_Exit_Click() {
        // We will first check for unsaved changes here, then prompt the user to save before exiting.
        Platform.exit();
        System.exit(0);
    }

    @FXML private void on_MainMenu_File_New_Click() {
        System.out.println("New button clicked");
    }

    @FXML private void on_MainMenu_Help_About_Click() {
        System.out.println("About button clicked");
    }

    @FXML private void on_MainMenu_Help_Github_Click() {
        System.out.println("Github button clicked");
    }

    @FXML private void on_MainMenu_LoadLedger_Button_Click() {
        System.out.println("Load Ledger button clicked");
    }

    @FXML private void on_MainMenu_NewLedger_Button_Click() {
        System.out.println("New Ledger button clicked");
    }

}
