package model;

//Adapter IS-A MediaPlayer (Target) *
//Adapter HAS-A AdavancedMediaPlayer(Adaptee)

public class Adapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public void setAdvancedMediaPlayer(AdvancedMediaPlayer amp) {
        this.advancedMediaPlayer = amp;
    }

    @Override
    public void play(MediaFile file) {
        this.advancedMediaPlayer.playe(file);
    }

}
