/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import model.proxyserver;
import model.server;
import model.user;

/**
 *
 * @author user
 */
public class Browser {
    public static void main(String[] args) {
        server s = new server();
        user user1 = new user("MATT","UK"); 
        s.access(user1); 
        
        proxyserver ps = new proxyserver();
        user user2 = new user("SHAN","LK"); 
        ps.access(user2); 
    }
}

