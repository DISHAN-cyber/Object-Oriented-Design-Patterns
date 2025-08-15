/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Home;

/**
 *
 * Concrete Target Object | AudioPlayer IS-A MediaPlayer
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(MediaFile file) {
        Home home = Home.getInstance();
        home.getTitleLabel().setText(file.getTitle());
        home.getSingerLabel().setText(file.getSinger());
        home.getPlayLabel().setText("Playing MP3: " + file.getFileName());
    }

}
