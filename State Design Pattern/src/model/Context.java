/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class Context {

    private State currentState;

    public Context() {
        this.currentState = new StartState();
    }

    void setState(State state) {
        this.currentState = state;
    }

    public void enterDetails() {
        this.currentState.enterDetails(this);
    }

    public void verifyEmail() {
        this.currentState.verifyEmail(this);
    }

    public void verifyMobile() {
        this.currentState.verifyMobile(this);
    }

    public void approve() {
        this.currentState.approve(this);
    }
}
