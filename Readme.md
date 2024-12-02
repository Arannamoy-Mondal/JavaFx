<div id="topic">
        <ol>
        <li><a href="#sceneController">Scene Controller</a></li>
        <li><a href="#communicationBetweenController">Communication Between Controller</a></li>
        <li><a href="#logoutandexit">Log Out And Alert Box</a></li>
        <li><a href="#imageview">Image View</a></li>
        <li><a href="#textField">TextField</a></li>
        <li><a href="#checkbox">CheckBox</a></li>
        <li><a href="#radio_button">Radio Button</a></li>
        <li><a href="#datePicker">Date picker</a></li>
        <li><a href="#ColorPicker">ColorPicker</a></li>
        <li><a href="#choiceBox">ChoiceBox</a></li>
        <li><a href="#slider">Slider</a></li>
        <li><a href="#progressbar">Progressbar</a></li>
        <li><a href="#spinner">Spinner</a></li>
        </ol>
</div>
<div id="sceneController">
        <a href="#topic">Topic</a>
<h1>Scene Controller</h1>
        
`
Main Class:
`

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

<h1>Communication Between Controller</h1>

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
    
    
<div id="logoutandexit">
    <a href="#topic">Topic</a>
    
`Main clas for exit: `
```java
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
```
    
`Controller class logOut :`
```java
    package Application;
    
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.layout.AnchorPane;
    import javafx.stage.Stage;
    
    public class Controller {
        @FXML
        private Button logOut;
        @FXML
        private AnchorPane scene_pane;
        Stage stage;
        public void logOut(ActionEvent event) {
            stage=(Stage)scene_pane.getScene().getWindow();
            System.out.println("LogOut");
            stage.close();
        }
    }
    
```
    
</div>
<div id="imageview">
        <a href="#topic">Topic</a>
    
`Image view:`
```java
    package application;
    
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.image.Image;
    import javafx.scene.image.ImageView;
    
    public class Controller {
        @FXML
        ImageView myImageView;
        Button imageButton;
        Image image=new Image(getClass().getResourceAsStream("download-2.jpg"));
        public void display_image()
        {
            myImageView.setImage(image);
        }
    }
```
</div>
    
    
<div id="textField">
    <a href="#topic">Topic</a>
    
`TextField:`
    
```java
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
    
```
</div>
    
    
<div id="checkbox">
    <a href="#topic">Topic</a>
    
`Checkbox:`
```java
    package Application;
    
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.CheckBox;
    import javafx.scene.control.Label;
    import javafx.scene.image.Image;
    import javafx.scene.image.ImageView;
    
    
    public class Controller {
        @FXML
        CheckBox checkBox;
    
        @FXML
        ImageView imageView;
    
        Image image=new Image(getClass().getResourceAsStream("/download.jpg"));
        Image image2=new Image(getClass().getResourceAsStream("/download-2.jpg"));
        public void changePicture(ActionEvent event) {
            imageView.setImage(image2);
            if(checkBox.isSelected()){
                imageView.setImage(image);
            }
            else{
                imageView.setImage(image2);
            }
        }
    }
    
```
</div>
    
<div id="radio_button">
    <a href="#topic">Topic</a>
    <li>Create toggle group from scenebuilder. Radiobutton -> Properties -> Toggle group </li>
    
`Radio Button:`
```java
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
    
```
</div>
    
<div id="datePicker">
    <a href="#topic">Topic</a>
    
`DatePicker:`
```java
    package Application;
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Button;
    import javafx.scene.control.DatePicker;
    import javafx.scene.text.Text;
    import java.time.LocalDate;
    
    public class Controller {
        @FXML
        DatePicker datePicker;
        @FXML
        Button datePickerButton;
        @FXML
        Text datePickerText;
        public void initialize(ActionEvent event) {
            datePickerText.setText(datePicker.getValue().toString());
            LocalDate localDate = datePicker.getValue();
            System.out.println(localDate);
        }
    
    }
    
```
</div>
    
<div id="ColorPicker">
    <a href="#topic">Topic</a>
    
`ColorPicker:`
```java
    package application;
    
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.ColorPicker;
    import javafx.scene.layout.Background;
    import javafx.scene.layout.BackgroundFill;
    import javafx.scene.layout.Pane;
    import javafx.scene.paint.Color;
    
    public class Controller {
        @FXML
        Pane myPane;
        @FXML
        ColorPicker myColorPicker;
        public void initialize(ActionEvent event) {
            Color myColor = myColorPicker.getValue();
            myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
            myColorPicker.setDisable(true);
        }
    }
    
```
</div>
<div id="choiceBox">
    <a href="#topic">Topic</a>
    
`ChoiceBox:`
```java
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
```
</div>
    
<div id="slider">
    <a href="#topic">Topic</a>
    
`Slider:`
```java
    package application;
    
    import javafx.beans.value.ChangeListener;
    import javafx.beans.value.ObservableValue;
    import javafx.fxml.FXML;
    import javafx.fxml.Initializable;
    import javafx.scene.control.Label;
    import javafx.scene.control.Slider;
    
    import java.net.URL;
    import java.util.ResourceBundle;
    
    public class Controller implements Initializable {
        @FXML
        Slider slider;
        @FXML
        Label label;
        int myTemperature;
        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            slider.valueProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                    myTemperature=(int)(slider.getValue());
                    label.setText(String.valueOf(myTemperature));
                }
            });
        }
    }
    
```
</div>

<div id="progressbar">
    <a href="#topic">Topic</a>

`ProgressBar:`
```java
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
```
</div>
    

<div id="spinner">
    <a href="#topic">Topic</a>

`Spinner:`
```java
package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Spinner<Integer> spinner;
    @FXML
    Label label;
    int currentValue;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10);
        valueFactory.setValue(1);
        spinner.setValueFactory(valueFactory);
        currentValue = spinner.getValue();
        spinner.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                currentValue = t1.intValue();
                label.setText(String.valueOf(currentValue));
            }
        });
    }
    public void action(ActionEvent event) {
        
    }
}

```
</div>
