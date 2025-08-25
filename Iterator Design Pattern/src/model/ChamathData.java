/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

public class ChamathData {

    public static Map<String, User> getUsers() {
        Map<String, User> userMap = new HashMap<>();
        User u1 = new User("Kamal Perera", "0721234556");
        User u2 = new User("Sadun Perera", "0721234657");
        User u3 = new User("Chamod Bandara", "0751234658");
        userMap.put("u1", u1);
        userMap.put("u2", u2);
        userMap.put("u3", u3);
        return userMap;
    }
}
