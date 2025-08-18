/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
//class A {
//
//    public static void m() {
//        System.out.println("Task 02");
//    }
//
//    public void n() {
//        System.out.println("Task 01");
//    }
//
//    public void o() {
//        System.out.println("Task 03");
//    }
//}
//
//class B {
//
//    public void p() {
//        System.out.println("Task 06");
//    }
//
//    public void q() {
//        System.out.println("Task 05");
//    }
//
//    public void r() {
//        System.out.println("Task 04");
//    }
//}
//
//class C {
//
//    public void z() {
//        System.out.println("Task 07");
//    }
//}
//
//final class X {
//
//    private A a;
//    private B b;
//    private C c;
//
//    X() {
//        a = new A();
//        b = new B();
//        c = new C();
//    }
//
//    public void process() {
//        a.n();
//        A.m();
//        a.o();
//
//        b.r();
//        b.q();
//        b.p();
//        
//        c.z();
//    }
//}
interface Runner {

    void run();
}

class Sprinter implements Runner {

    public void prepare() {
        System.out.println("Sprinter: Dynamic warm-up");
    }

    public void ready() {
        System.out.println("Sprinter: Ready to run");
    }

    @Override
    public void run() {
        System.out.println("Sprinter: I’m sprinting");
    }
}

class RoadRunner implements Runner {

    public void breath() {
        System.out.println("Road Runner: Getting long breath");
    }

    @Override
    public void run() {
        System.out.println("Road Runner: I’m road running");
    }
}

final class RaceFacade {

    private final Sprinter sprinter;
    private final RoadRunner roadRunner;

    public RaceFacade() {
        this.sprinter = new Sprinter();
        this.roadRunner = new RoadRunner();
    }

    public void prepareRace() {
        sprinter.prepare();
        sprinter.ready();
        roadRunner.breath();
    }

    public void startRace() {
        sprinter.run();
        roadRunner.run();
    }
}

class Race {

    public static void main(String[] args) {
        RaceFacade rf = new RaceFacade();
        rf.prepareRace();
        rf.startRace();
    }
}
