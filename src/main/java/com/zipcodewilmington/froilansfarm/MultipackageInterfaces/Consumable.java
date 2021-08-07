package com.zipcodewilmington.froilansfarm.MultipackageInterfaces;

public abstract class Consumable {

    protected String type;
    protected Integer count;


    public abstract String getType();

    public abstract void setType(String type);

    public abstract Integer getCount();

    public abstract void setCount(Integer count);

}
