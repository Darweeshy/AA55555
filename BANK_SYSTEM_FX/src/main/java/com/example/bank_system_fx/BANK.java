package com.example.bank_system_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BANK extends Application {

    public static void main(String[] args)
    {
       launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Welcome Page.fxml"));
        parent.getBaselineOffset();
        Scene scene = new Scene(parent);
        stage.setTitle("SafeBank");
        stage.setScene(scene);
        stage.show();
    }
}
