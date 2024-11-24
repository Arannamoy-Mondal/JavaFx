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
