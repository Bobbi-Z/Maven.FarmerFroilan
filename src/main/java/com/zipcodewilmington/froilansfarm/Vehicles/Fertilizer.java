package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class Fertilizer extends Consumable implements VehicleTools {
    /**
     * to do a whole field you need 30lbs
     * the crop duster holds 10lbs
     *start with 120lbs (a month)
     */


    private String type;
    private Integer count;

    public Fertilizer() {
    }

    public Fertilizer(String type, Integer count) {
        this.type = type;
        this.count = count;
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
    public Integer getCount() {
        return count;
    }

    @Override
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Fertilizer{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
