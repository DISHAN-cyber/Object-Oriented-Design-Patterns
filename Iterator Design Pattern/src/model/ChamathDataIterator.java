/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dilhara
 */
public class ChamathDataIterator implements Iterator {

    private final User[] users;
    private int index;

    public ChamathDataIterator() {
        users = ChamathData.getUsers()
                .values()
                .toArray(new User[0]);
    }

    @Override
    public boolean hasNext() {
        return index < users.length;
    }

    @Override
    public User next() {
        return users[index++];
    }

}
