/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
class ApproveState implements State{

    @Override
    public void enterDetails(Context context) {
        System.out.println("User details already filled. Can not enter details again");
    }

    @Override
    public void verifyEmail(Context context) {
        System.out.println("Email already verified");
    }

    @Override
    public void verifyMobile(Context context) {
        System.out.println("Mobile already verified");
    }

    @Override
    public void approve(Context context) {
        System.out.println("Regstration complete...");
    }
    
}
