package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Producer;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class Chicken extends Animal implements Producer, Store {

    private Integer id;
    private Integer coopNumber;
    private Boolean hasEaten;
    private String gender;
    private Integer yield;
    private Boolean hasEgg;
    private Boolean hasBeenFertilized;

   public Chicken(){

   }


    public Chicken(Integer id, Integer coopNumber,  Boolean hasEaten, String gender, Integer yield, Boolean hasEgg, Boolean hasBeenFertilized) {
        this.id = id;
        this.coopNumber = coopNumber;
        this.hasEaten = hasEaten;
        this.gender = gender;
        this.yield = yield;
        this.hasEgg = hasEgg;
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoopNumber() {
        return coopNumber;
    }

    public void setCoopNumber(Integer coopNumber) {
        this.coopNumber = coopNumber;
    }

    public Boolean getHasEaten() {
        return hasEaten;
    }

    public void setHasEaten(Boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Boolean getHasEgg() {
        return hasEgg;
    }

    public void setHasEgg(Boolean hasEgg) {
        this.hasEgg = hasEgg;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String getMale() {
        return gender;
    }

    public void setMale(String gender) {
        this.gender = gender
        ;
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
    public Integer yield() {
        return null;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return null;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", coopNumber=" + coopNumber +
                ", hasEaten=" + hasEaten +
                ", gender=" + gender +
                ", yield=" + yield +
                ", hasEgg=" + hasEgg +
                ", hasBeenFertilized=" + hasBeenFertilized +
                '}';
    }


    /**creates instances of chickens that get organized in the chicken coop category
     * slept in the coop with the rooster. Random # generator representing a 25% chance.
     *
     */



}
