package com.evil.emisions;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Building building = new Building("Buildings do not have a CarbonFootprint!");
        Car car = new Car("The car leaves a Huge CarbonFootprint!");
        Bicycle bicycle = new Bicycle("Same as a Building, the bicycle do not have a CarbonFootprint!");

        List<CarbonFootprint> list = new ArrayList<>();

        list.add(building);
        list.add(car);
        list.add(bicycle);

        for (CarbonFootprint c: list) {
            c.getCarbonFootprint();
        }
    }
}
