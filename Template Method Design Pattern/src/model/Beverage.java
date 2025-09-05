/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public abstract class Beverage {

    private boolean wantsCondiments = true;

    public void setWantsCondiments(boolean wantsCondiments) {
        this.wantsCondiments = wantsCondiments;
    }
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into the cup");
    }

    protected abstract void addCondiments();

    protected void addSugar() {
        System.out.println("Adding sugar to cup");
    }

    protected void mixed() {
        System.out.println("Mixing");
    }

    protected abstract void brew();

    public final void preapreReceip() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
        addSugar();
        mixed();
    }

    protected boolean customerWantCondiments() {
        return wantsCondiments;
    }
}
