/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Home;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilhara
 */
public class RealImage implements ImageInterface {

    private final String password;
    private final String imagePath;

    public RealImage(String password, String imagePath) {
        this.password = password;
        this.imagePath = imagePath;
    }

    private void loadFromDisk() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        loadFromDisk();
        if (this.password.equals("1234")) {
            ImageIcon imageIcon = new ImageIcon(getClass()
                            .getResource(this.imagePath));
            Home.getInstance()
                    .getImageLabel()
                    .setText("");
            Home.getInstance()
                    .getImageLabel()
                    .setIcon(imageIcon);
        } else {
            JOptionPane.showMessageDialog(Home.getInstance(), 
                    "Invalid Password",
                    "Warning",
                    JOptionPane.ERROR_MESSAGE);
            Home.getInstance()
                    .getImageLabel()
                    .setText("");
        }
    }

}
