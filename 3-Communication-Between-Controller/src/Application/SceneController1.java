package Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController1 {
    private Stage stage;
    private Scene scene;
    private Pane root;
    @FXML
    TextField name;
    public void login(ActionEvent event) throws IOException {
        String userName=name.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root=loader.load();
        SceneController2 controller2=loader.getController();
        controller2.displayName(userName);
        stage =(Stage)((Node)event.getSource()).getScene().getWindow(); // for switch window
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Home");
        stage.show();
    }
}
