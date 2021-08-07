package com.zipcodewilmington.froilansfarm.TheFarm.StaySafe;

import com.zipcodewilmington.froilansfarm.Animals.People.Person;

public class FarmHouse extends Shelter <Person> {

    //create instances of farmhouse

    private Integer number;
    private String type;
    private Integer numberOfOccupants;

    public FarmHouse() {
    }

    public FarmHouse(Integer number, String type, Integer numberOfOccupants) {
        this.number = number;
        this.type = type;
        this.numberOfOccupants = numberOfOccupants;
    }

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Integer getNumberOfOccupants() {
        return numberOfOccupants;
    }

    @Override
    public void setNumberOfOccupants(Integer numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", numberOfOccupants=" + numberOfOccupants +
                '}';
    }
}
