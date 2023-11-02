package org.example;

public class Main {
    public static void main(String[] args) {
        final int discount = 750;

        Bmw myBMW = new Bmw();

        myBMW.transmissionType();
        myBMW.engineIsStarted();

        myBMW.setBmwPrice(35000);
        myBMW.setBmwGearboxPrice(2000);
        myBMW.setBmwWheelsPrice(2500);
        //overload
        myBMW.carPrice(myBMW.getBmwPrice(), myBMW.getBmwGearboxPrice(), myBMW.getBmwWheelsPrice(), discount);

        Volkswagen myVW = new Volkswagen();

        myVW.transmissionType();
        myVW.engineIsOff();

        myVW.setVwPrice(15000);
        myVW.setVwGearboxPrice(800);
        myVW.setVwWheelsPrice(400);
        //overload
        myVW.carPrice(myVW.getVwPrice(), myVW.getVwGearboxPrice(), myVW.getVwWheelsPrice());
    }
}