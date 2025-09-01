/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class ProxyServer implements ServerInterface{ // IS-A Relationship

    private Server server; // real server (HAS-A Relationship)

    @Override
    public void access(User user) {
        this.server = new Server();
        User u = new User(user.getName(),"UK");
        this.server.access(u);
    }
}
