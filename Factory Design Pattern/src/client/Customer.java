/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import model.Food;
import model.FoodFactory;

/**
 *
 * @author Dilhara
 */
public class Customer {

    public static void main(String[] args) {
        Food pizza = FoodFactory.getFood("Pizza");
        pizza.prepare();

        Food burger = FoodFactory.getFood("Burger");
        burger.prepare();
    }
}
