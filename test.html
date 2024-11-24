<div id="topic">
    <li><a href="#sceneController">Scene Controller</a></li>
    <li><a href="#communicationBetweenController">Communication Between Controller</a></li>
</div>
<div id="sceneController">
    <a href="#topic">Topic</a>
</div>
<div id="sceneController">
    <a href="#topic">Topic</a>

`Main Class:`
```java
    
    package application;
    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Scene;
    import javafx.scene.layout.Pane;
    import javafx.stage.Stage;
    
    public class Main extends Application {
        @Override
        public void start(Stage stage) throws Exception {
            try{
                Pane root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
            launch(args);
        }
    
    }
    
```
`SceneController Class:`
```java
    import javafx.event.ActionEvent;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Node;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.scene.layout.Pane;
    import javafx.stage.Stage;
    
    import java.io.IOException;
    
    public class SceneController {
        private Stage stage;
        private Scene scene;
        private Pane root;
        public void switchScene1(ActionEvent e) throws Exception {
            root = FXMLLoader.load(getClass().getResource("/Application/Scene1.fxml"));
            stage =(Stage) ((Node)e.getSource()).getScene().getWindow();
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
    
```
    
    
</div>

<div id="communicationBetweenController">
    <a href="#topic">Topic</a>

`SceneBuilder1 :`

```java
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

```

`SceneController2 :`

```java
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

```
</div>