package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

public class PotatoRoot extends Crop{
    /**Create Instances of PotatoRoot
     * <Producer>yield(Potato)</Producer> can yield anywhere from 6-10 potatoes when fertilized
     * <Producer>hasBeenFertilized()</Producer> //ready to yield next day
     * <Crop></Crop>hasBeenHarvested(); //Potatoes sent to FoodStorage & removed from crop row
     * <Crop></Crop>hasBeenPlanted() // ready to be fertilized next day & added to croprow
     *
     ** PotatoRoot potatoRoot = new PotatoRoot(int id, CropRow, Edible potato,  Boolean fertilized,
     *      * int yield)
     *      * ID #s range from 31 - 60 OR 61 - 90 id++ upon creation
     *      *int yield (){ Random # btw 8-16}
     *      *
     *      *when harvest(Crop potato, int yield) ->which should trigger
     *      *  potatoCounter += yield update FoodStorage
     *      *  .remove from CropRow
     *
     */



}
