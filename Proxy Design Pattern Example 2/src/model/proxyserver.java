/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;



/**
 *
 * @author user
 */
public class proxyserver implements serverinterface {

    private server server;
    
    @Override
    public void access(user user) {
        this.server = new server();
        user u = new user(user.getName(), "UK");
        this.server.access(u);
    }
}
