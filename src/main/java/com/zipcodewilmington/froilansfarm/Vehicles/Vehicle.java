package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Rideable;

public interface Vehicle extends NoiseMaker, Rideable {

    Boolean hasFuel();



    /**
     * <NoiseMaker>makeNoise(vroom)</NoiseMaker>
     * <Rideable>hasBeenRidden</Rideable>
     * <Rideable>move()</Rideable>
     *
     *
     */
}
