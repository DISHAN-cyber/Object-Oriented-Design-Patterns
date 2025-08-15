package model;

import gui.Home;

/**
 * Concrete Adaptee | VideoPalyer IS-A AdavancedMediaPlayer
 */
public class VideoPlayer implements AdvancedMediaPlayer {

    @Override
    public void playe(MediaFile file) {
        Home home = Home.getInstance();
        home.getTitleLabel().setText(file.getTitle());
        home.getSingerLabel().setText(file.getSinger());
        home.getPlayLabel().setText("Playing MP4: " + file.getFileName());
    }

}
