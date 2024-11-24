package Application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class SceneController2 {
    @FXML
    private Label nameLabel;

    public void displayName(String userName) {
        nameLabel.setText("Hello, " + userName);
    }
}
