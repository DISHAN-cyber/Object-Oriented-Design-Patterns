/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Home;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dilhara
 */
public class Context {

    private State currentState;
    private final Home home;
    private final List<User> userList;
    private User currentUser;

    public Context(Home home) {
        this.home = home;
        this.userList = new ArrayList<>();
        this.userList.add(new User("Sahan Perera", "1234", 50000));
        this.userList.add(new User("Kamal Gunawaradhana", "4567", 80000));
        this.userList.add(new User("Prageeth Himansa", "7890", 100000));

        this.currentState = new NoCardState(this);
    }

    void setCurrentState(State currentState) {
        this.currentState = currentState;
        home.setStatus(currentState.getClass().getSimpleName());
    }
    
    public void insertCard() {
        this.currentState.insertCard();
    }

    public void enterPin(String pin) {
        this.currentState.enterPin(pin);
    }

    public void requestWithdrawal() {
        this.currentState.requestWithdrawal();
    }

    public void ejectCard() {
        this.currentState.ejectCard();
    }

    public void checkBalance() {
        this.currentState.checkBalance();
    }

    public Home getHome() {
        return home;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public List<User> getUserList() {
        return userList;
    }
}
