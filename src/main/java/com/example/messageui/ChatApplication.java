package com.example.messageui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class ChatApplication extends Application {

    public void start(Stage stage) throws IOException {
        FXMLLoader fxml = new FXMLLoader(ChatApplication.class.getResource("view.fxml"));
        Scene scene = new Scene(fxml.load());
        stage.setTitle("Message");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}