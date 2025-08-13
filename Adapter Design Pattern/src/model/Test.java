/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

class Device {

    private SDCard sdCard;

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void copy() {
        this.sdCard.read();
    }
}

interface SDCard {

    public void read();
}

interface MicroSDCard {

    public void read();
}
class Kingston64 implements SDCard{

    @Override
    public void read() {
        System.out.println("KingstonSD Card Data Reading");
    }
}
class SamsungMicro implements MicroSDCard{

    @Override
    public void read() {
        System.out.println("Samsung MicroSD Card Data Reading");
    }
}

class Adapter implements SDCard {

    private MicroSDCard microSDCard;

    public void setMicroSDCard(MicroSDCard microSDCard) {
        this.microSDCard = microSDCard;
    }

    public MicroSDCard getMicroSDCard() {
        return microSDCard;
    }

    @Override
    public void read() {
        this.microSDCard.read();
    }

}

public class Test {

    public static void main(String[] args) {
        Device device = new Device();
        SDCard sdCard = new Kingston64();
        device.setSdCard(sdCard);
        device.copy();

        MicroSDCard microSDCard = new SamsungMicro();
//        device.setSdCard(microSDCard);??

        Adapter adapter = new Adapter();
        adapter.setMicroSDCard(microSDCard);

        device.setSdCard(adapter);
        device.copy();
    }
}
