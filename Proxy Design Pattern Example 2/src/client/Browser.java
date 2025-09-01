/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import model.ProxyServer;
import model.Server;
import model.User;

/**
 *
 * @author Dilhara
 */
public class Browser {

    public static void main(String[] args) {
        Server s = new Server(); // real server
        User user1 = new User("John", "UK"); // name, region
        s.access(user1);
//        
        ProxyServer ps = new ProxyServer();
        User user2 = new User("Sahan","LK"); // name, region
        ps.access(user2);
    }
}
