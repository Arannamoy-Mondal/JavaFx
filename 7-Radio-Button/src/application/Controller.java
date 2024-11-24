package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioMenuItem;

public class Controller {
    @FXML
    Label label;
    @FXML
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;

    public void selected_group(ActionEvent event) {
        if(radioButton1.isSelected()) {
            label.setText("Group 1");
        } else if (radioButton2.isSelected()) {
            label.setText("Group 2");
        }
        else if(radioButton3.isSelected()) {

            label.setText("Group 3");
        }
        else if(radioButton4.isSelected()) {
            label.setText("Group 4");
        }
    }
}
