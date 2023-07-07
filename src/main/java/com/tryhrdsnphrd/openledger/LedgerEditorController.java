package com.tryhrdsnphrd.openledger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LedgerEditorController {
    // All the variables for our LedgerEditor.fxml file are here.

    // Main VBox
    @FXML private VBox LedgerEditor_VBox;

    // MenuBar
    @FXML private MenuBar LedgerEditor_MenuBar;
    @FXML private Menu LedgerEditor_MenuFile;
    @FXML private MenuItem LedgerEditor_File_Exit;
    @FXML private MenuItem LedgerEditor_File_Save;
    @FXML private Menu LedgerEditor_MenuHelp;
    @FXML private MenuItem LedgerEditor_Help_About;
    @FXML private MenuItem LedgerEditor_Help_Github;

    // Interaction VBox variables
    @FXML private VBox LedgerEditor_Interaction_VBox;

    // The actual interactables
    // Location
    @FXML private HBox LedgerEditor_Location_HBox;
    @FXML private Text LedgerEditor_Location_Text;
    @FXML private TextField LedgerEditor_Location_TextField;

    // Date
    @FXML private HBox LedgerEditor_Date_HBox;
    @FXML private Text LedgerEditor_Date_Text;
    @FXML private DatePicker LedgerEditor_Date_DatePicker;

    // Functions relating to the code
    public LedgerEditorController() {
    }

    // Code for our LedgerEditor.fxml file is here.
    @FXML
    private void on_LedgerEditor_File_Exit_Click() {
        // We will first check for unsaved changes here, then prompt the user to save before exiting.
        Platform.exit();
        System.exit(0);
    }

    @FXML private void on_LedgerEditor_Help_About_Click() {
        System.out.println("About button clicked");
    }

    @FXML private void on_LedgerEditor_Help_Github_Click() {
        System.out.println("Github button clicked");
    }

    @FXML private void on_LedgerEditor_File_Save_Click() {
        System.out.println("Save button clicked");
    }




}
