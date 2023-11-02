package org.example;

//Used for abstraction and polymorphism (overload)
public abstract class Car {
    public abstract void transmissionType();
    public void engineIsStarted(){
        System.out.println("Car engine is started!");
    }
    public void engineIsOff(){
        System.out.println("Car is turned down");
    }

    public void carPrice(double enginePrice, double gearboxPrice, double wheelsPrice){
        double finalPrice = enginePrice + gearboxPrice + wheelsPrice;
        System.out.println("This car costs: " + finalPrice);
    }

    public void carPrice(double enginePrice, double gearboxPrice, double wheelsPrice, double discount){
        double finalPrice = enginePrice + gearboxPrice + wheelsPrice -discount;
        System.out.println("This car costs: " + finalPrice);

    }
}
