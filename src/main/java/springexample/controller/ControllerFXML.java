package springexample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ControllerFXML {
    @Value("${message}")
    String message;

    @FXML
    private Button printBtn;

    public String getMessage() {
        return message;
    }

    public void print() {
        Alert dialog = new Alert(Alert.AlertType.INFORMATION, "Well done");
        dialog.showAndWait();
    }
}
