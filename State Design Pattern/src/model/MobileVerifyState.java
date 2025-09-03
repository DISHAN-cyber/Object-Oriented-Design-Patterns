/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
class MobileVerifyState implements State {

    @Override
    public void enterDetails(Context context) {
        System.out.println("Details already filled");
    }

    @Override
    public void verifyEmail(Context context) {
        System.out.println("Email verified...");
    }

    @Override
    public void verifyMobile(Context context) {
        System.out.println("Verifying Mobile Number...");
        context.setState(new ApproveState());
    }

    @Override
    public void approve(Context context) {
        System.out.println("Need to verify mobile first..");
    }

}
