package com.main.generics.substitution;

import java.util.ArrayList;
import java.util.List;

public class SubMain {
    /**
     * Implementation of Substitution Principle
     * Object of child class can be referenced by a variable of parent class
     */
    public static void main(String[] args){
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Office());
        buildings.add(new Building());
        printBuildings(buildings);

        List<Office> offices = new ArrayList<>();
        offices.add(new Office());
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        List<House> houses = new ArrayList<>();
        addHouseToList(houses);
        addHouseToList(houses);
        addHouseToList(houses);
        printBuildings(houses);
    }

    static void build (Building building){
        System.out.println("Constructing a new "+ building.toString());
    }

    /**
     * List of buildings is not the same as list of office
     * But List of buildings can have objects of office
     * This problem can be solved using wildcards (?)
     */
    static void printBuildings(List<? extends Building> buildings){
        for(int i = 0; i< buildings.size(); i ++){
            System.out.println(i+1+": "+buildings.get(i).toString());
        }
    }

    /**
     * This method can take a list of superclass of the class House
     * @param buildings
     */
    static void addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }
}
