package com.zipcodewilmington.froilansfarm.TheFarm;

import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

public class Garage <T extends FarmVehicle> implements Container<FarmVehicle>{
    @Override
    public FarmVehicle findSpecific() {
        return null;
    }

    @Override
    public FarmVehicle listAll() {
        return null;
    }

    @Override
    public FarmVehicle status() {
        return null;
    }

    @Override
    public FarmVehicle remove() {
        return null;
    }

    @Override
    public FarmVehicle store() {
        return null;
    }

    /**
     * <Container></Container>store(FarmVehicle); //Create
     * <Container></Container>searchFor(FarmVehicle); //Read
     * <Container></Container>listAll(FarmVehicle); //Read
     * <Container></Container>status(FarmVehicle);//Update
     * <Container></Container>remove(FarmVehicle); // Delete
     * 
     * 
     * Manages a list of FarmVehicle
     * 1 CropDuster
     * 1 Tractor
     *
     */

}
