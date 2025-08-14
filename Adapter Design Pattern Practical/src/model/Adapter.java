/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class Adapter implements Balla {

    private Aliya aliya;

    public void setAliya(Aliya aliya) {
        this.aliya = aliya;
    }

    @Override
    public void duwanawa() {
        this.aliya.duwanawa();
    }

}
