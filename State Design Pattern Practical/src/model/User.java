/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class User {

    private final String name;
    private final String pin;
    private double balance;

    public User(String name, String pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validatePin(String pin) {
        return pin.equals(this.pin);
    }

    public boolean withdrawAmount(double amount) {
        if (amount > this.balance) {
            return false;
        }
        balance = balance - amount;
        return true;
    }
}
