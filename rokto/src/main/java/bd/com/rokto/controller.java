package bd.com.rokto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}