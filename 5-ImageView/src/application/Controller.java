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
