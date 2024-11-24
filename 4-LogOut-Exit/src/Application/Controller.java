package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private Button logOut;
    @FXML
    private AnchorPane scene_pane;
    Stage stage;
    public void logOut(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setContentText("Are you sure you want to log out?");
        if(alert.showAndWait().get() == ButtonType.OK) {
            stage=(Stage)scene_pane.getScene().getWindow();
            System.out.println("LogOut");
            stage.close();
        }
    }
}
