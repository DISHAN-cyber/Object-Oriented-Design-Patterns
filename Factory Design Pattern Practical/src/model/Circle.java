/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Home;
import javax.swing.ImageIcon;

/**
 *
 * @author Dilhara
 */
class Circle extends Shape {

    public Circle() {
        this.url = "/img/circle.png";
    }

    @Override
    public void draw() {
        Home.getInstance()
                .getImageLabel()
                .setIcon(
                        new ImageIcon(getClass().getResource(this.url)));
    }

}
