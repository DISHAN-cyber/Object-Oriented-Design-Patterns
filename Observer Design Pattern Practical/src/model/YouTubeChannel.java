/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Publisher
 */
public class YouTubeChannel implements Subject {

    private final String name;
    private final List<Observer> subscribers;

    public YouTubeChannel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
        this.subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        this.subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(name, videoTitle, Observer.UPLOAD);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void uploadVideo(String videoTitle) {
        notifyObservers(videoTitle);
    }
}
