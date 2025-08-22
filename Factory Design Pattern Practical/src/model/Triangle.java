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
class Triangle extends Shape{

    public Triangle() {
        this.url = "/img/triangle.png";
    }

    @Override
    public void draw() {
        Home.getInstance()
                .getImageLabel()
                .setIcon(new ImageIcon(getClass().getResource(this.url)));
    }
    
}
