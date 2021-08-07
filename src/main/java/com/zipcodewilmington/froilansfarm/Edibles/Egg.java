package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class Egg extends Consumable implements Edible{
    private String type;
    private Integer count;


    public Egg() {

    }

    public Egg(String type, Integer count) {
       setType(type);
       setCount(count);
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
        return "Egg{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }


}
