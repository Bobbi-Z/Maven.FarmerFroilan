package com.zipcodewilmington.froilansfarm.Produce;

public class TomatoPlant extends Crop{
    /**Create Instance of TomatoPlant
     * <Producer>yield(numberOfTomato)</Producer> // can yield anywhere from 8-16 tomatoes per plant when fertilized
     * <Producer>hasBeenFertilized()</Producer> //Ready to yield next day
     * <Crop></Crop>hasBeenHarvested(); //tomatoes stored in food storage & removed from CropRow
     * <Crop></Crop>hasBeenPlanted() //True - ready to fertilize next day & added to CropRow
     *
     * TomatoPlant tomatoPlant = new TomatoPlant(Double id, Crop tomato, Boolean planted, Boolean fertilized,
     * int numOfTomatoes, Boolean harvested)
     * ID #s range from 1.5 - 30.5 id++ upon creation
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
