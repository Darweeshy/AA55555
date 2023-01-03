package com.example.bank_system_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Bank_Controller {
    @FXML
    Button SignupB;
    @FXML
    Button Login1, signingup_final;
    @FXML
    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    TextArea textarea_name, textarea_DOB, textarea_ID, textarea_add, textarea_Emp, textarea_SOI, textArea_email;
    @FXML
    TextArea password;
    @FXML
    TextArea textfield1;
    @FXML
    TextArea passwordfield1;
    @FXML
    Label incorrect_info, Welcomelabel;

    public void cust_Signup(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void Signing_up(ActionEvent event) throws IOException {

        Account customer = Create_object();
        File file = new File("D:\\Java_Fx_proj\\BANK_SYSTEM_FX\\src\\main\\resources\\Customer.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(customer.toString());
        printWriter.close();
    }

    public Account Create_object() {
        int x = Integer.parseInt(textarea_ID.getText());
        int Soii = Integer.parseInt(textarea_ID.getText());
        Account customer = new Account(textarea_name.getText(), x, textarea_DOB.getText(), textarea_Emp.getText(), Soii, textarea_add.getText(), textArea_email.getText(), password.getText());
        return customer;
    }

    public void Logging(ActionEvent event) throws IOException {
        Boolean flag = false;
        File file = new File("D:\\Java_Fx_proj\\BANK_SYSTEM_FX\\src\\main\\resources\\Customer.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        String z = textfield1.getText() + passwordfield1.getText();
        while (scanner.hasNextLine() && !textfield1.getText().isEmpty() && !passwordfield1.getText().isEmpty()) {//understand..//
            String cmp = scanner.next();
            if (cmp.indexOf(z) != -1) {
                flag = true;
                root = FXMLLoader.load(getClass().getResource("LOGIN_SUCCESS.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } else {
                incorrect_info.setText("Sorry, the email and password do not match...");

            }

        }

    }
}
