package com.zipcodewilmington.froilansfarm.TheFarm.StaySafe;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class ChickenCoop extends Shelter <Chicken> {

    /**
     * create instance of chickencoop
     */

    private Integer number;
    private String type;
    private Integer numberOfOccupants;
    
    public ChickenCoop() {
     
    }

    public ChickenCoop(Integer number, String type, Integer numberOfOccupants) {
        setNumber(number);
        setType(type);
        setNumberOfOccupants(numberOfOccupants);
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
        return "ChickenCoop{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", numberOfOccupants=" + numberOfOccupants +
                '}';
    }
}
