package model;

/**
 * Publisher
 */
public interface Subject {

    void subscribe(Observer o);

    void unsubscribe(Observer o);

    void notifyObservers(String videoTitle);

    String getName();
}
