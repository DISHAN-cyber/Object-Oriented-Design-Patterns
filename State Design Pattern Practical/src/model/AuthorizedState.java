/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilhara
 */
public class AuthorizedState implements State {

    private final Context context;

    public AuthorizedState(Context context) {
        this.context = context;
    }

    @Override
    public void insertCard() {
        context.getHome()
                .setMessageOnScreen("Card Already Entered...");
    }

    @Override
    public void enterPin(String pin) {
        context.getHome()
                .setMessageOnScreen("Your PIN Already Verified...");
    }

    @Override
    public void requestWithdrawal() {
        String enteredAmount = JOptionPane.showInputDialog(context.getHome(),
                "Enter Amount To Withdraw",
                "Withdraw Message",
                JOptionPane.QUESTION_MESSAGE);
        if (!enteredAmount.isBlank()) {
            try {
                double amount = Double.parseDouble(enteredAmount);
                if (amount <= 0) {
                    context.getHome()
                            .setMessageOnScreen("Entered Amount Must Be Greater Than 0");
                    return;
                }
                
                User user = context.getCurrentUser();
                if (user.withdrawAmount(amount)) {
                    context.getHome()
                            .setMessageOnScreen("Withdrawal Of LKR " + amount + " Is Successfully");
                    context.getHome()
                            .setMessageOnScreen("New Balance Is LKR " + user.getBalance());
                } else {
                    context.getHome()
                            .setMessageOnScreen("OOPS... Insufficient Funds!");
                }
            } catch (NumberFormatException e) {
                context.getHome()
                        .setMessageOnScreen("Enterd Amount Format Is Incorrect");
            }
        }
    }

    @Override
    public void ejectCard() {
        context.getHome()
                .setMessageOnScreen("Card Ejected. Please Take It...");
        context.setCurrentState(new NoCardState(context));
        context.setCurrentUser(null);
    }

    @Override
    public void checkBalance() {
        JOptionPane.showMessageDialog(context.getHome(),
                "Your Current Balance Is LKR " + context.getCurrentUser().getBalance(),
                "Information Message",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
