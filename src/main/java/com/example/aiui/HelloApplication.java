package com.example.aiui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.util.Observer;

public class HelloApplication extends Application {
    data DB = new data();
    @Override
    public void start(Stage stage) {
        DB.registerUser("john", "doe", "johndoe@emailadress.com","testusername", "securepassword", false);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("mainScene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setTitle("AIUI: Login");
            stage.setScene(scene);
            loginController loginController = new loginController();
            loginController.setDB(DB);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Starten van de JavaFX-toepassing
        launch(args);

    }
}
