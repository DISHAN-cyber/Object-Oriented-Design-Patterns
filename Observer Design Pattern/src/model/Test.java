package model;


public class Test {
    public static void main(String[] args) {
        X x = new X();
        
        O1 o1 = new O1();
        O2 o2 = new O2();
        
        x.registerObserver(o1);
        x.registerObserver(o2);
        
        x.setI(50);
        
        x.removeObserver(o2);
        x.setI(100);
    }
}
