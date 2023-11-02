package org.example;

public class Volkswagen extends Car{

    private double vwPrice;
    private double vwGearboxPrice;
    private double vwWheelsPrice;

    public double getVwPrice() {
        return vwPrice;
    }

    public void setVwPrice(double vwPrice) {
        this.vwPrice = vwPrice;
    }

    public double getVwGearboxPrice() {
        return vwGearboxPrice;
    }

    public void setVwGearboxPrice(double vwGearboxPrice) {
        this.vwGearboxPrice = vwGearboxPrice;
    }

    public double getVwWheelsPrice() {
        return vwWheelsPrice;
    }

    public void setVwWheelsPrice(double vwWheelsPrice) {
        this.vwWheelsPrice = vwWheelsPrice;
    }

    @Override
    public void transmissionType() {
        System.out.println("\nThis is a FWD");
    }

}
