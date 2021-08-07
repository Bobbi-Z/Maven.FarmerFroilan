package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class Horse extends Animal implements Rideable, Store {

    private Integer id;
    private Integer stableNumber;
    private Boolean hasEaten;
    private Boolean hasBeenRidden;
    private Boolean hasBeenGroomed;

   public Horse(){

   }

    public Horse(Integer id, Integer stableNumber, Boolean hasEaten, Boolean hasBeenGroomed, Boolean hasBeenRidden) {
        setId(id);
        setStableNumber(stableNumber);
        setHasEaten(hasEaten);
        setHasBeenGroomed(hasBeenGroomed);
        setHasBeenRidden(hasBeenRidden);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStableNumber() {
        return stableNumber;
    }

    public void setStableNumber(Integer stableNumber) {
        this.stableNumber = stableNumber;
    }

    public Boolean getHasEaten() {
        return hasEaten;
    }

    public void setHasEaten(Boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public Boolean getHasBeenRidden() {
        return hasBeenRidden;
    }

    public void setHasBeenRidden(Boolean hasBeenRidden) {
        this.hasBeenRidden = hasBeenRidden;
    }

    public Boolean getHasBeenGroomed() {
        return hasBeenGroomed;
    }

    public void setHasBeenGroomed(Boolean hasBeenGroomed) {
        this.hasBeenGroomed = hasBeenGroomed;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public Boolean hasEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean hasBeenRidden() {
        return null;
    }

    @Override
    public String move() {
        return null;
    }


    @Override
    public String toString() {
        return "Horse{" +
                "id=" + id +
                ", stableNumber=" + stableNumber +
                ", hasEaten=" + hasEaten +
                ", hasBeenRidden=" + hasBeenRidden +
                ", hasBeenGroomed=" + hasBeenGroomed +
                "} " + super.toString();
    }
}
