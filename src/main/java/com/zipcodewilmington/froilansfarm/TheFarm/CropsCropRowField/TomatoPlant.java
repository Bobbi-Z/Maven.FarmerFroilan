package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

public class TomatoPlant extends Crop{
    /**Create Instance of TomatoPlant
     * <Producer>yield(numberOfTomato)</Producer> // can yield anywhere from 8-16 tomatoes per plant when fertilized
     * <Producer>hasBeenFertilized()</Producer> //Ready to yield next day
     * <Crop></Crop>hasBeenHarvested(); // EarCorn moved to storage && removed from row
     * <Crop></Crop>hasBeenPlanted(); // ready to be fertilized next day && added to row
     *
     * TomatoPlant tomatoPlant = new TomatoPlant(int id, CropRow, Edible tomato,  Boolean fertilized,
     * int yield)
     * ID #s range from 1 - 30 id++ upon creation
     *int yield (){ Random # btw 8-16}
     *
     *when harvest(Crop tomato, int yield) ->which should trigger
     *  tomatoCounter += yield update FoodStorage
     *  .remove from CropRow
     *
     *
     *
     *
     */



}
