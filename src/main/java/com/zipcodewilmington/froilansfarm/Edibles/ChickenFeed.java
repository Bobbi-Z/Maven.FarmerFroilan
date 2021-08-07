package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class ChickenFeed extends Consumable implements Edible {

    /**
     * start with 420 feeds (a month)
     *15 Feeds a day
     */

    private String type;
    private Integer count;

    public ChickenFeed() {
    }

    public ChickenFeed(String type, Integer count) {
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
        return "ChickenFeed{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }

}
