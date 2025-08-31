/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Home;

/**
 *
 * @author Dilhara
 */
public class ProxyImage implements ImageInterface {

    private final RealImage realImage;

    public ProxyImage(String password, String filePath) {
        this.realImage = new RealImage(password, filePath);
    }
    
    @Override
    public void display() {
        Home.getInstance()
                .getImageLabel()
                .setIcon(null);
        Home.getInstance()
                .getImageLabel()
                .setText("Loading");
        new Thread(new Runnable() {
            @Override
            public void run() {
                realImage.display();
            }
        }).start();
    }
}
