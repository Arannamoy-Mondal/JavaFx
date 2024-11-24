package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField mytextfield;
    @FXML
    Label myLable;
    @FXML
    Button myButton;
    int age;
    public void submit(ActionEvent event) {
        try{
            age = Integer.parseInt(mytextfield.getText());
            myLable.setText(age+" years old");
        }
        catch(Exception e){
            myLable.setText("Please enter a number");
        }
    }
}
