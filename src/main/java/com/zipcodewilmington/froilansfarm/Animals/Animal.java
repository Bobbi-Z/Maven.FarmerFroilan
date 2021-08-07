package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

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
