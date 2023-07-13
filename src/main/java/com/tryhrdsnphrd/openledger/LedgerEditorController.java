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

    // Total
    @FXML private HBox LedgerEditor_Total_HBox;
    @FXML private Text LedgerEditor_Total_Text;
    @FXML private TextField LedgerEditor_Total_TextField;

    // Memo
    @FXML private HBox LedgerEditor_Memo_HBox;
    @FXML private Text LedgerEditor_Memo_Text;
    @FXML private TextArea LedgerEditor_Memo_TextArea;

    // Tags
    @FXML private VBox LedgerEditor_Tags_VBox;
    @FXML private HBox LedgerEditor_Tags_Entry_HBox;
    @FXML private Text LedgerEditor_Tags_Entry_Text;
    @FXML private TextField LedgerEditor_Tags_Entry_TextField;
    @FXML private HBox LedgerEditor_Tags_Display_HBox;

    @FXML private Button LedgerEditor_Submit_Transaction_Button;

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

    @FXML private void on_LedgerEditor_Submit_Transaction_Button_Click() {
        System.out.println("Submit Transaction button clicked");
    }

    @FXML private void LedgerEditor_Tags_Entry_TextField_onAction() {
        // Now we need to add a node to the Display HBox, then clear the text field.
        // We will also need to add a delete button to the node, just by clicking on it.

        Button TagButton = new Button(LedgerEditor_Tags_Entry_TextField.getText());
        TagButton.setOnAction(event -> {
            // We will need to remove the node from the display HBox.
            LedgerEditor_Tags_Display_HBox.getChildren().remove(TagButton);
            // Now set the cursor to the text field so the user can keep typing.
            LedgerEditor_Tags_Entry_TextField.requestFocus();
        });
        LedgerEditor_Tags_Display_HBox.getChildren().add(TagButton);

        // Clear the text
        LedgerEditor_Tags_Entry_TextField.clear();
    }


}
