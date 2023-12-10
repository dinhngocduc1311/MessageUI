package com.example.messageui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChatControl {
    @FXML
    private Label label;

    @FXML
    protected void buttonHello() {
        label.setText("Welcome to Chat Application");
    }
}