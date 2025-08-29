/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.YouTube;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * Concrete Subscriber
 */
public class Subscriber implements Observer {

    private final List<YouTubeChannel> youTubeChannels;
    private final String name;

    public Subscriber(String name) {
        this.name = name;
        this.youTubeChannels = new ArrayList<>();
    }

    @Override
    public void update(String channelName, String videoTitle, String messagType) {
        switch (messagType) {
            case Observer.SUBSCRIBE:
                appendToPane(YouTube.getInstance().getNotificationArea(),
                        "[" + name + "] => Subscribed to the " + channelName + " Channel\n",
                        new Color(85, 166, 48));
                break;
            case Observer.UPLOAD:
                appendToPane(YouTube.getInstance().getNotificationArea(),
                        "[" + name + "] => New video from " + channelName + ": " + videoTitle + "\n",
                        new Color(74, 78, 105));
                break;
            case Observer.UNSUBSCRIBE:
                appendToPane(YouTube.getInstance().getNotificationArea(),
                        "[" + name + "] => Unsubscribed the " + channelName + " Channel\n",
                        new Color(208, 0, 0));
                break;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void subscribeChannel(YouTubeChannel channel) {
        youTubeChannels.add(channel);
        channel.subscribe(this);
    }

    public void unsubscribe(YouTubeChannel channel) {
        youTubeChannels.remove(channel);
        channel.unsubscribe(this);
    }

    public List<YouTubeChannel> getYouTubeChannels() {
        return youTubeChannels;
    }

    private void appendToPane(JTextPane tp, String msg, Color c) {
        StyledDocument doc = tp.getStyledDocument(); //javax.swing.text.StyledDocument
        Style style = tp.addStyle("Color Style", null); //javax.swing.text.Style
        StyleConstants.setForeground(style, c); //javax.swing.text.StyleConstants
        try {
            doc.insertString(doc.getLength(), msg, style);
        } catch (BadLocationException e) { //javax.swing.text.BadLocationException
            e.printStackTrace();
        }
    }
}
