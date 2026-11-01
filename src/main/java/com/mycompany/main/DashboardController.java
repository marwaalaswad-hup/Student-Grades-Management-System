/*
 *
 */
package com.mycompany.main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private void openAddStudent() {
        loadPage("AddStudent.fxml");
    }

    @FXML
    private void openAddGrades() {
        loadPage("AddGrades.fxml");
    }

    @FXML
    private void openViewStudents() {
        loadPage("ViewStudents.fxml");
    }

    @FXML
    private void openReports() {
        loadPage("Reports.fxml");
    }

    @FXML
    private void logout() {
        loadPage("Login.fxml");
    }

    private void loadPage(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/main/" + fxmlFile));

            Scene scene = new Scene(loader.load());

            scene.getStylesheets().add(getClass().getResource("/com/mycompany/main/style.css").toExternalForm());

            Stage stage = (Stage) welcomeLabel.getScene().getWindow();
            stage.setScene(scene);

            if (fxmlFile.equals("Login.fxml")) {
                stage.setTitle("Login");
            } else {
                stage.setTitle("Dashboard");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
