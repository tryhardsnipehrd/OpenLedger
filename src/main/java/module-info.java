module com.tryhrdsnphrd.openledger {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.tryhrdsnphrd.openledger to javafx.fxml;
    exports com.tryhrdsnphrd.openledger;
}