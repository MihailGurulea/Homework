package com.course.building;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        House house = new House(135.20,2,4,2);
        School school = new School(1250.77, 5, 80, "Elementary and Junior High!");

        List<Building> listOfBuildings = new ArrayList<>();

        listOfBuildings.add(house);
        listOfBuildings.add(school);

        for(Building b : listOfBuildings){
            System.out.println(b.toString());
        }
    }
}
