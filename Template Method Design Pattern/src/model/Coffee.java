package model;


public class Coffee extends Beverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding the lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected boolean customerWantCondiments() {
        return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

}
