/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public final class FoodFactory {

    public static Food getFood(String order) {
        if (order.equals("Pizza")) {
            return new Pizza();
        } else if (order.equals("Burger")) {
            return new Burger();
        } else {
            return null;
        }
    }
}
