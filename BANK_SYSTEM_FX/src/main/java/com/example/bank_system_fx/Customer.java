package com.example.bank_system_fx;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Customer extends Person {
    public String address;
    public int sourceofincome;
    public  String email , password;

    public Customer(String name, int ID, String DOB, String employment, int sourceofincome, String address) {
    }

    public Customer(String name, int id, String dob, String employment , int sourceofincome , String address , String email , String password) {
        super(name , id , dob , employment);
        this.sourceofincome = sourceofincome;
        this.address = address;
        this.email = email;
        this.password = password;

    }

    public Customer() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSourceofincome() {
        return sourceofincome;
    }

    public void setSourceofincome(int sourceofincome) {
        this.sourceofincome = sourceofincome;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                ", sourceofincome=" + sourceofincome +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                ", DOB='" + DOB + '\'' +
                ", employment='" + employment + '\'' +
                '}';
    }
}

