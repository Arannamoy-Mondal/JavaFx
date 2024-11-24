package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    ChoiceBox<String> choiceBox;
    @FXML
    Label label;
    @FXML
    Button button;
    public void initialize(ActionEvent event) {
         label.setText(choiceBox.getValue());
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
                choiceBox.getItems().addAll("A", "B", "C", "D", "E", "F");
                choiceBox.setOnAction(this::initialize);
    }
}

























