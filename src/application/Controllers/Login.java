package application.Controllers;

import application.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Login extends AppController {
    @FXML
    public Label timeLabel;

    public Login() {
        templatePath = "Login.fxml";
    }

    /**
     * Runs when the scene is initialized, use this to do any on-load changes
     */
    public void initialize() {
        loadStylesheet("resources/stylesheets/global.css");
        loadStylesheet("resources/stylesheets/login.css");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        timeLabel.setText(dtf.format(now));
    }

    /**
     * Action when the login button is clicked
     * @param actionEvent event instance
     */
    public void loginAction(ActionEvent actionEvent) {
        new Home().load();
    }
}
