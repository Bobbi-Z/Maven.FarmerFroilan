package com.zipcodewilmington.froilansfarm.Vehicles;

public interface Aircraft <Pilot> extends Vehicle {
    String fly();
    String land();

    @Override
    Boolean hasFuel();

    @Override
    String makeNoise();

    @Override
    Boolean hasBeenRidden();

    @Override
    String move();

}
