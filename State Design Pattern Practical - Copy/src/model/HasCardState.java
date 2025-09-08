/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class HasCardState implements State {

    private final Context context;

    public HasCardState(Context context) {
        this.context = context;
    }

    @Override
    public void insertCard() {
        context.getHome()
                .setMessageOnScreen("Already Card Inserted");
    }

    @Override
    public void enterPin(String pin) {
        for (User user : context.getUserList()) {

            if (user.validatePin(pin)) {
                context.setCurrentUser(user);
                context.getHome()
                        .setMessageOnScreen("PIN Is Correct... WELCOME " + user.getName());
                context.setCurrentState(new AuthorizedState(context));
                return;
            }
        }
        context.getHome()
                .setMessageOnScreen("Incorrect PIN Number. Try Again...");
    }

    @Override
    public void requestWithdrawal() {
        context.getHome()
                .setMessageOnScreen("Enter Your Card PIN First");
    }

    @Override
    public void ejectCard() {
        context.getHome()
                .setMessageOnScreen("Card Ejected. Please Take It...");
        context.setCurrentState(new NoCardState(context));
    }

    @Override
    public void checkBalance() {
        context.getHome()
                .setMessageOnScreen("Enter Your Card PIN First");
    }

}
