package com.example.bank_system_fx;
import java.util.Objects;


public class Account extends Customer implements Action , Loans , AccountValidity{
    private int accnumber;
    private String acctype;
    private int credit;
    private int debt;

    public String validity = "Valid";

    public int LoanAmount = 1000;

    public Account(String name, int id, String dob, String employment, int sourceofincome, String address, String email, String password) {
        super(name, id, dob, employment, sourceofincome, address, email, password);
    }

    public Account() {
        super();
    }

    public Account(String name, int id, String dob, String employment, int sourceofincome, String address, int accnumber, String acctype, int credit, int debt) {

    }

    public int getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(int accnumber) {
        this.accnumber = accnumber;
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int withdraw (int cash_wd){
        credit -= cash_wd;
        return cash_wd;
    }

    public void deposit(int cash_dp){
        credit += cash_dp;
    }

    public void Loanapproval()
    {
        if(credit > debt & credit > LoanAmount)
        {
            System.out.println("Yes the Loan is approved");
            credit = credit + LoanAmount;
            debt = debt + LoanAmount;
        }
        else
        {
            System.out.println("Unfortunately the loan is declined");
        }
    }

    @Override
    public void delete_Account(String decision) {
        if(Objects.equals(decision, "Delete"))
        {
            validity = "Invalid";

        }
    }
    public void Pause_Account(String decision)
    {
        if(Objects.equals(decision, "Pause"))
        {
            validity = "Paused";
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "accnumber=" + accnumber +
                ", acctype='" + acctype + '\'' +
                ", credit=" + credit +
                ", debt=" + debt +
                ", validity='" + validity + '\'' +
                ", LoanAmount=" + LoanAmount +
                ", address='" + address + '\'' +
                ", sourceofincome=" + sourceofincome +
                '\n' + email + password + '\n' +
                 "Name"+name + '\n' +
                ", ID=" + ID +
                ", DOB='" + DOB + '\'' +
                ", employment='" + employment + '\'' +
                '}';
    }
}
