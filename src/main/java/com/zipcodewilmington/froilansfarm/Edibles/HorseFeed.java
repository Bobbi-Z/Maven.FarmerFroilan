package com.zipcodewilmington.froilansfarm.Edibles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class HorseFeed extends Consumable implements Edible {
    /**
     * start with 252 feeds (a month)
     * 9 feeds a day
     */

    private String type;
    private Integer count;


    public HorseFeed() {
    }

    public HorseFeed(String type, Integer count) {
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
        return "HorseFeed{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}
