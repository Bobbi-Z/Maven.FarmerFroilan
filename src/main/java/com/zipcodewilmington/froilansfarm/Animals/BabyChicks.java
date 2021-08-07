package com.zipcodewilmington.froilansfarm.Animals;

public class BabyChicks {

    /** Baby chicks = Fertilized Eggs, hatched, sold 1x a week
     * possibility of 0-4 a day / 0-28 a week
     *
     * 1 babychick is worth = 60 gallons of fuel OR
     *                         30 lbs of fertilizer OR
     *                           7 Horse feeds OR
     *                              105 feeds (a week) OR
     */

    private Integer id;
    private Boolean hatched;

    public BabyChicks(Integer id, Boolean hatched) {
        this.id = id;
        this.hatched = hatched;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getHatched() {
        return hatched;
    }

    public void setHatched(Boolean hatched) {
        this.hatched = hatched;
    }

}
