package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public abstract class Animal implements Eater, NoiseMaker, Store {

    @Override
    public String eat() {
        return null;
    }

    @Override
    public Boolean hasEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
