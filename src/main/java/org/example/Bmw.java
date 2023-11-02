package org.example;

// Used for encapsulation (setter and getter) and polymorphism (override)
public class Bmw extends Car {

    private double bmwPrice;
    private double bmwGearboxPrice;
    private double bmwWheelsPrice;

    public double getBmwPrice() {
        return bmwPrice;
    }

    public void setBmwPrice(double bmwPrice) {
        this.bmwPrice = bmwPrice;
    }

    public double getBmwGearboxPrice() {
        return bmwGearboxPrice;
    }

    public void setBmwGearboxPrice(double bmwGearboxPrice) {
        this.bmwGearboxPrice = bmwGearboxPrice;
    }

    public double getBmwWheelsPrice() {
        return bmwWheelsPrice;
    }

    public void setBmwWheelsPrice(double bmwWheelsPrice) {
        this.bmwWheelsPrice = bmwWheelsPrice;
    }

    @Override
    public void transmissionType() {
        System.out.println("\nThis is a RWD");
    }

}
