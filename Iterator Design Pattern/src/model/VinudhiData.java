package model;

import java.util.ArrayList;

public class VinudhiData {

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Sahan", "0771234567"));
        users.add(new User("Kamal", "0773434562"));
        users.add(new User("Wishwa", "0779878767"));
        return users;
    }
}
