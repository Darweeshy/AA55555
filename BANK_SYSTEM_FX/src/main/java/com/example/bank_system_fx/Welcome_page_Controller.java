package com.example.bank_system_fx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome_page_Controller {
    @FXML
    Button EMP;
    @FXML
    Button Cust;
    @FXML
    private Stage stage;
    private Parent root;
    private Scene scene;

    public void Emp1_Login(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Banking_System.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void cust_Login(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Banking_System2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
