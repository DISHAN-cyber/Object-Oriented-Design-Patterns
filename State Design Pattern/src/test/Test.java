package test;

import model.Context;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.enterDetails();
        context.verifyEmail();
        context.verifyMobile();
        context.approve();
        context.enterDetails();
    }
}
