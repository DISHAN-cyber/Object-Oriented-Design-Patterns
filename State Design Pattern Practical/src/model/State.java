/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public interface State {
    void insertCard();
    void enterPin(String pin);
    void requestWithdrawal();
    void ejectCard();
    void checkBalance();
}
