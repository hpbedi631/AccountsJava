/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountlab04;

import java.util.Date;

/**
 *
 * @author harshdeep bedi
 */
public class Account {

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
    }

    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }
    //asscessor/getters for id, balance and annualInterestRate

    int getId() {
        return id;

    }

    double getBalance() {
        return balance;
    }

    static double getAnnualInterstRate() {
        return annualInterestRate;
    }

    Date getDate() {
        return dateCreated;
    }
// mutator/setters for id, balance and annualInterstRate

    void setId(int newId) {
        id = newId;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
// for percentage rate each month

    private static double getMonthlyInterestRate() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        return monthlyInterestRate;
    }

    private double getMonthlyInterest() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double monthlyInterest = balance * monthlyInterestRate;
        return monthlyInterest;

    }

    // withdraw an amount from the balance
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000);
        Date d1 = new Date();
        System.out.println("The account was created on " + d1 + ".");
        a1.setAnnualInterestRate(4.5);
        System.out.println("Monthly Interest Rate is: $" + a1.getMonthlyInterest());
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("The current account balance is $" + a1.balance);
    }

}
