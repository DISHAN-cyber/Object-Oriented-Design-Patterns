/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
class StartState implements State{

    @Override
    public void enterDetails(Context context) {
        System.out.println("Entering user details...");
        context.setState(new EmailVerifyState());
    }

    @Override
    public void verifyEmail(Context context) {
        System.out.println("Need to enter details first");
    }

    @Override
    public void verifyMobile(Context context) {
        System.out.println("Need to enter details first and verify email");
    }

    @Override
    public void approve(Context context) {
        System.out.println("Need to enter details first, verfy email and mobile");
    }
    
}
