package com.example.bank_system_fx;

import java.util.Date;

public class Interest extends Account {

    public int interestrate;

    public Interest()
    {
        super();
    }
    public  Interest(String name, int ID, String DOB, String employment , int sourceofincome , String address, int accnumber, String acctype, int credit, int debt , int interestrate)
    {
        super(name , ID , DOB , employment , sourceofincome , address , accnumber , acctype , credit , debt);
        this.interestrate = interestrate;
    }

    @Override
    public void setCredit(int credit) {
        super.setCredit(credit * interestrate/100);
    }

    @Override
    public String toString() {
        return "Interest{" +
                "interestrate=" + interestrate +
                ", address='" + address + '\'' +
                ", sourceofincome=" + sourceofincome +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                ", DOB='" + DOB + '\'' +
                ", employment='" + employment + '\'' +
                '}';
    }
}
