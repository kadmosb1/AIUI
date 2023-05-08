package com.example.aiui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;



public class HelloController {
    @FXML
    private VBox box;
    @FXML
    private Button hello;
    @FXML
    private Label welcomeText;
    @FXML
    private ToggleButton mode;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onmodetoggle() {
        if (mode.getStyle().equals("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: black;")) {
            mode.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
            box.setStyle("-fx-background-color: black;");
            welcomeText.setStyle("-fx-background-color: black; -fx-text-fill: white;");
            hello.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: white;");
            mode.setText("lightmode");
        }else{
            mode.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: black;");
            box.setStyle("-fx-background-color: white;");
            welcomeText.setStyle("-fx-background-color: white; -fx-text-fill: black;");
            hello.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-color: black;");
            mode.setText("darkmode");


        }
    }
}
