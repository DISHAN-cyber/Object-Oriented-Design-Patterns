package model;

public class O2 implements Observer{

    @Override
    public void display(int i) {
        System.out.println("Observer 02: " + i);
    }
}
