/*
 * 
 */
package com.mycompany.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("demo") && password.equals("demo123")) {
            openDashboard();
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    private void openDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/main/Dashboard.fxml"));

            Scene scene = new Scene(loader.load());

            scene.getStylesheets().add(getClass().getResource("/com/mycompany/main/style.css").toExternalForm());

            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Dashboard");

        } catch (Exception e) {
            messageLabel.setText("Error loading dashboard.");
            e.printStackTrace();
        }
    }
}
