/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class server implements serverinterface{

    public static final String DOMAIN = "www.hhhh.com";

    @Override
    public void access(user user) {
        if (user.getRegion().equalsIgnoreCase("UK")) { // user.getRegion() is called here (line 17)
            System.out.println(user.getName() + "connect to" + server.DOMAIN + "from UK");
        } else {
            System .err.println("Access denied for"
                    + user.getName() + "from"
                    + user.getRegion() + ". Can Not Access To" + server.DOMAIN);
        }

    }
}
