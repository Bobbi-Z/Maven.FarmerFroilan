package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class EarCorn extends Consumable implements Edible, Store {

    private String type;
    private Integer count;

    public EarCorn() {
    }

    public EarCorn(String type, Integer count) {
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
}
