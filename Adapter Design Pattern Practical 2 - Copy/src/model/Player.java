package model;

/**
 * Context Object | Context HAS-A Target
 */
public class Player {

    private MediaPlayer mediaPlayer;

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void startPlaying(MediaFile file) {
        this.mediaPlayer.play(file);
    }
}
