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
