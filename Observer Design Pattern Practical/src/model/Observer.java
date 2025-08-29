package model;

/**
 * Subscriber
 */
public interface Observer {

    public static final String UPLOAD = "UPLOAD";
    public static final String SUBSCRIBE = "SUBSCRIBE";
    public static final String UNSUBSCRIBE = "UNSUBSCRIBE";

    void update(String channelName, String videoTitle, String messagType);

    String getName();
}
