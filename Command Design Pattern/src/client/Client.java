package client;

import model.Light;
import model.LightOffCommand;
import model.LightOnCommand;
import model.Remote;

public class Client {

    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
//        lightOnCommand.execute();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
//        lightOffCommand.execute();

        Remote remote = new Remote();
        remote.setCommand(lightOnCommand);
        remote.pressSwitch();

        System.out.println(".............");
        remote.setCommand(lightOffCommand);
        remote.pressSwitch();
    }

}
