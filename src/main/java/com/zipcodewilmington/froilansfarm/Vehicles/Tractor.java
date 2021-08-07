package com.zipcodewilmington.froilansfarm.Vehicles;


import com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField.Crop;

public class Tractor implements FarmVehicle {
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean hasBeenRidden() {
        return null;
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String operateOnFarm() {
        return null;
    }

    @Override
    public Boolean hasFuel() {
        return null;
    }

    public <T extends Crop> String harvest(){
        return null;
    }

}
