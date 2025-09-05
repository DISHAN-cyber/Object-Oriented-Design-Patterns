/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class Tea extends Beverage{

    @Override
    protected void addCondiments() {
        System.out.println("Adding the milk");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
