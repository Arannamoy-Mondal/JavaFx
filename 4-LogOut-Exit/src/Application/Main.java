package Application;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        try{
            Pane root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setOnCloseRequest(event->{
                event.consume();
                logOut(stage);
            });
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void logOut(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log Out");
        alert.setContentText("Are you sure you want to log out?");
        if(alert.showAndWait().get() == ButtonType.OK) {
//            stage=(Stage)scene_pane.getScene().getWindow();
            System.out.println("LogOut");
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}