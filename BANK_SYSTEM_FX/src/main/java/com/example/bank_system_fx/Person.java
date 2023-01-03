package com.example.bank_system_fx;
import java.util.Date;

public class Person {
    public String name;
    public int ID;
    public String DOB;
    public String employment;

    public Person() {
    }

    public Person(String name, int ID, String DOB, String employment) {
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        this.employment = employment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", DOB=" + DOB +
                ", employment='" + employment + '\'' +
                '}';
    }
}

