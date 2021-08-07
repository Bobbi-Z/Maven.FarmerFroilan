package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class Potato extends Consumable implements Edible{
    private String type;
    private Integer count;

    public Potato() {
    }

    public Potato(String type, Integer count) {
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
        return "Potato{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
