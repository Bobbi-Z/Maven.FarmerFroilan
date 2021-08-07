package com.zipcodewilmington.froilansfarm.TheFarm.StaySafe;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;


public abstract class Shelter <T extends Animal> implements Store {

    // create instances of Shelters


    protected Integer number;
    protected String type;
    protected Integer numberOfOccupants;

    public abstract Integer getNumber();

    public abstract void setNumber(Integer number);

    public abstract String getType();

    public abstract void setType(String type);

    public abstract Integer getNumberOfOccupants();

    public abstract void setNumberOfOccupants(Integer numberOfOccupants);


}
