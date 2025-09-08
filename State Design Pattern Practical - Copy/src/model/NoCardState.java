/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
class NoCardState implements State {

    private final Context context;

    public NoCardState(Context context) {
        this.context = context;
    }
    
    @Override
    public void insertCard() {
        context.getHome()
                .setMessageOnScreen("Card Inserted. Please Enter You Pin...");
        context.setCurrentState(new HasCardState(context));
    }

    @Override
    public void enterPin(String pin) {
        context.getHome()
                .setMessageOnScreen("Insert You Card First");
    }

    @Override
    public void requestWithdrawal() {
        context.getHome()
                .setMessageOnScreen("Insert a Card and Enter Your Pin");
    }

    @Override
    public void ejectCard() {
        context.getHome()
                .setMessageOnScreen("Insert a Card First");
    }

    @Override
    public void checkBalance() {
        context.getHome()
                .setMessageOnScreen("Insert Your Card and Enter Your Pin");
    }

}
