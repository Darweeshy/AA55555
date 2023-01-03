package com.example.bank_system_fx;
import java.util.Date;

public class Employee extends Person {
    public int accesslevel;
    public int salary;

    public Employee() {
    }
    public Employee(String name, int ID, String DOB, String employment , int accesslevel , int salary )
    {
        super(name , ID , DOB , employment );
        this.accesslevel = accesslevel;
        this.salary = salary;


    }

    public int getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(int accesslevel) {
        this.accesslevel = accesslevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "accesslevel=" + accesslevel +
                ", salary=" + salary +
                '}';
    }
}

