package com.shinsaku;

public class Main {

    public static void main(String[] args) {
        Account a = new Account();
        System.out.println("An account is created");

        a.setAccountNumber(123);
        System.out.println("Account number is set to " + a.getAccountNumber());

        a.setBalance(12345.66);
        System.out.println("Initial balance is "+ a.getBalance());

        a.setCustomerName("Shinsaku");
        System.out.println("Customer name is set to" + a.getCustomerName());

        a.setEmail("so4639@bu.edu");
        System.out.println("Emain address: " + a.getEmai());

        a.setPhoneNumber(631415688);
        System.out.println("Phone number: " + a.getPhoneNumber());


        a.deposit(10000);
        System.out.println("Deposited " + 10000);
        System.out.println("Balance is " + a.getBalance());

        a.withdraw(20000);
        System.out.println("Balance is " + a.getBalance());

        a.withdraw(100000);

    }
}
