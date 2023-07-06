package com.tryhrdsnphrd.openledger;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class LedgerEditorController {
    // All the variables for our LedgerEditor.fxml file are here.

    // Main VBox
    @FXML private VBox LedgerEditor_VBox;

    // MenuBar
    @FXML private MenuBar LedgerEditor_MenuBar;
    @FXML private Menu LedgerEditor_MenuFile;
    @FXML private MenuItem LedgerEditor_File_Exit;
    @FXML private Menu LedgerEditor_MenuHelp;
    @FXML private MenuItem LedgerEditor_Help_About;
    @FXML private MenuItem LedgerEditor_Help_Github;

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


}
