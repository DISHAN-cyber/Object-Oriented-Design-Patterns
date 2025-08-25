/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class TharinsaDataIterator implements Iterator {

    private final User[] users;
    private int index; // 0

    public TharinsaDataIterator() {
        this.users = TharinsaData.getUsers();
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
