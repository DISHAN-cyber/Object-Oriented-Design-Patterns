/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class Server implements ServerInterface{ // IS-A Relationship

    public static final String DOMAIN = "www.abc.com";

    @Override
    public void access(User user) {
        if (user.getRegion().equalsIgnoreCase("UK")) {
            System.out.println(user.getName() + " connect to " + Server.DOMAIN + " from UK");
        } else {
            System.err.println("Access denied for "
                    + user.getName() + " from "
                    + user.getRegion() + ". Can not access to " + Server.DOMAIN);
        }
    }
}
