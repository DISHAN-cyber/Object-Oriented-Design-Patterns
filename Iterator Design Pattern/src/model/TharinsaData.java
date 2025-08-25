package model;


public class TharinsaData {

    public static User[] getUsers() {
        User user1 = new User("Kamal Perera", "0771234567");
        User user2 = new User("Sadun Perera", "0719876543");
        User user3 = new User("Chamod Bandara", "0751122334");
        User[] users = {user1, user2, user3};
        return users;
    }
}
