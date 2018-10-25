package com.evil.java.oca.demo;

public class Demo {
    public static void main(String[] args) {
        CruiseShip cruiseShip = new CruiseShip("Best Cruise Ship!", "1919", 300);
        CargoShip cargoShip = new CargoShip("Best Cargo Ship!", "1899", 1200);

        System.out.println(cruiseShip.toString());
        System.out.println(cargoShip.toString());

    }
}
