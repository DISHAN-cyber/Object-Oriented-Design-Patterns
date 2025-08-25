package model;

import java.util.Vector;


public class MaheshData {

    public static Vector<User> getUsers() {
        Vector<User> users = new Vector<>();
        users.add(new User("Shan", "0765463546"));
        users.add(new User("Amal", "0723454678"));
        users.add(new User("Kasun", "0714466545"));

        return users;
    }
}
