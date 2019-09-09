package com.shinsaku;

public class Account {
    int accountNumber;
    double balance;
    String customerName;
    String email;
    long phoneNumber;

    public Account() {
        this(111, 0, "", "", 0000);
        System.out.println("Empty Constructor is created");
    }

    public Account(int accountNumber, double balance, String customerName, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor called");
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return  this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmai() {
        return this.email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        if(money <= this.balance) {
            this.balance -= money;
        } else {
            System.out.println("There is not enough deposit to withdraw.");
        }
    }
}
