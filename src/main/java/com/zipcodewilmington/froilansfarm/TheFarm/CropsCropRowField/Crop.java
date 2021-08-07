package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Producer;

public class Crop implements Producer {
    @Override
    public Integer yield() {
        return null;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return null;
    }


    /**
     * <Crop></Crop>hasBeenHarvested(); // EarCorn moved to storage && removed from row
     * <Crop></Crop>hasBeenPlanted(); // ready to be fertilized next day && added to row
     *
     */
}
