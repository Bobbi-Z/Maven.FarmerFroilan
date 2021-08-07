package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

public class CornStalk extends Crop{

    /**
     *      * ID #s range from 31 - 60 OR 61 - 90 id++ upon creation
     *      *int yield (){ Random # btw 8-16}
     *      *when harvest(Crop earCorn, int yield) ->which should trigger
     *      *  earCornCounter += yield update FoodStorage
     *      *  .remove from CropRow
     */

    private Integer number;
    private Integer rowNumber;
    private String type;
    private Boolean hasBeenFertilized;
    private Integer yield;

    public CornStalk() {
    }

    public CornStalk(Integer number, Integer rowNumber, String type, Boolean hasBeenFertilized, Integer yield) {
        this.number = number;
        this.rowNumber = rowNumber;
        this.type = type;
        this.hasBeenFertilized = hasBeenFertilized;
        this.yield = yield;
    }

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Integer getRowNumber() {
        return rowNumber;
    }

    @Override
    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
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
    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public Integer getYield() {
        return yield;
    }

    @Override
    public void setYield(Integer yield) {
        this.yield = yield;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return null;
    }

    @Override
    public Integer yield() {
        return null;
    }

}
