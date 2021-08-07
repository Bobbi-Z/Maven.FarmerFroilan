package com.zipcodewilmington.froilansfarm.Animals.People;

import com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField.Crop;

public interface Pilot <Farmer>  {

    <T extends Crop> String fertilize();

}
