package com.zipcodewilmington.froilansfarm.Animals.People;

import com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField.Crop;

public interface Botanist <T extends Person>{


    <T extends Crop> String plant();

}
