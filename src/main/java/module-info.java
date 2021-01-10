module DgSystems.DPlayer {
    requires javafx.controls;
    requires javafx.fxml;

    opens DgSystems.DPlayer to javafx.fxml;
    exports DgSystems.DPlayer;
}