package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Producer;

public abstract class Crop implements Producer {

    protected Integer number;
    protected Integer rowNumber;
    protected String type;
    protected Boolean hasBeenFertilized;
    protected Integer yield;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    @Override
    public abstract Boolean hasBeenFertilized();

    @Override
    public abstract Integer yield();
}
