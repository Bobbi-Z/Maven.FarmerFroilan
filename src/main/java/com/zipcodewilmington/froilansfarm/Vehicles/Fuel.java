package com.zipcodewilmington.froilansfarm.Vehicles;


import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class Fuel extends Consumable implements VehicleTools{

    /**
     * each move uses 10 gallons // operateOnFarm()
     * the tractor and the cropduster both hold 10 gallons
     * start with 240 gallons (a month)
     */

    private String type;
    private Integer count;

    public Fuel() {
    }

    public Fuel(String type, Integer count) {
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
        return "Fuel{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }


}
