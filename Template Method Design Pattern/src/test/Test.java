/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Beverage;
import model.Coffee;
import model.Tea;

/**
 *
 * @author Dilhara
 */
public class Test {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.preapreReceip();
        
        System.out.println("");
        
        Beverage coffee = new Coffee();;
        coffee.preapreReceip();

    }
}
