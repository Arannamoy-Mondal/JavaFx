package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    ProgressBar progressBar;
    @FXML
    Label progressLabel;
    @FXML
    Button button;

    double progress;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setStyle("-fx-accent: red;");
    }
    public void action(ActionEvent event) {
        if(progress+0.1 <1)
        {
            progress+=0.1;
            progressBar.setProgress(progress);
            String s=String.format("%.1f",progress*100);
            progressLabel.setText(s+" %");
        }
        else {
            progressLabel.setText("Already 100% ");
        }
    }

}
