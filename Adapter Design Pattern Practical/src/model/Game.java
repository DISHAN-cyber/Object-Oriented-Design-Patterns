/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Game { // Context Object

    private Balla balla;

    public void setGameObject(Balla balla) {
        this.balla = balla;
    }

    public void start() {
        System.out.println("Game Start....");
        this.balla.duwanawa();
    }
}
