/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dilhara
 */
public class VinudhiDataIterator implements Iterator {

    ArrayList<User> users;
    int index;

    public VinudhiDataIterator() {
        this.users = VinudhiData.getUsers();
    }

    @Override
    public boolean hasNext() {
        return index < users.size();
    }

    @Override
    public User next() {
        return users.get(index++);
    }

}
