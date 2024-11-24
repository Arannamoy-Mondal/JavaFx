package Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitch {
    private Stage stage;
    private Scene scene;
    private Pane root;
    public void switchScene1(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/Application/Scene1.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow(); // for switch window
        scene = new Scene(root);
        stage.setScene(scene);
    }
    public void switchScene2(ActionEvent e) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/Application/Scene2.fxml"));
        stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
}