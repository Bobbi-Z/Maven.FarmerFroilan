package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public interface Vehicle extends NoiseMaker, Rideable, Store {

    Boolean hasFuel();



    /**
     * <NoiseMaker>makeNoise(vroom)</NoiseMaker>
     * <Rideable>hasBeenRidden</Rideable>
     * <Rideable>move()</Rideable>
     *
     *
     */
}
