package com.zipcodewilmington.froilansfarm.MultipackageInterfaces;

import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public abstract class Consumable implements Store {

    protected String type;
    protected Integer count;


    public abstract String getType();

    public abstract void setType(String type);

    public abstract Integer getCount();

    public abstract void setCount(Integer count);

}
