/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public final class ShapeFactory {

    public static Shape createShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}
