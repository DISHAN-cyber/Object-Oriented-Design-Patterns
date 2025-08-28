package model;


public class O1 implements Observer{

    @Override
    public void display(int i) {
        System.out.println("Observer 01: " + i);
    }
}
