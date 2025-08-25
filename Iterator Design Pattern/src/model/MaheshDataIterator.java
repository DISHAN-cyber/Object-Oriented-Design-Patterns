/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Vector;

/**
 *
 * @author Dilhara
 */
public class MaheshDataIterator implements Iterator {

    Vector<User> users;
    int position;

    public MaheshDataIterator() {
        this.users = MaheshData.getUsers();
    }

    @Override
    public boolean hasNext() {
        return position < users.size();
    }

    @Override
    public User next() {
        return users.get(position++);
    }

}
