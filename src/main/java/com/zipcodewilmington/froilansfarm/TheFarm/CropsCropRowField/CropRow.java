package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class CropRow implements Store {

    private Integer rowNumber;
    private String crop;
    private Integer cropsPlanted;
    private Integer cropsFertilized;

    public CropRow() {
    }

    public CropRow(Integer rowNumber, String crop, Integer cropsPlanted, Integer cropsFertilized) {
        this.rowNumber = rowNumber;
        this.crop = crop;
        this.cropsPlanted = cropsPlanted;
        this.cropsFertilized = cropsFertilized;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public Integer getCropsPlanted() {
        return cropsPlanted;
    }

    public void setCropsPlanted(Integer cropsPlanted) {
        this.cropsPlanted = cropsPlanted;
    }

    public Integer getCropsFertilized() {
        return cropsFertilized;
    }

    public void setCropsFertilized(Integer cropsFertilized) {
        this.cropsFertilized = cropsFertilized;
    }
}
