/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Remote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressSwitch() {
        this.command.execute();
    }
}
