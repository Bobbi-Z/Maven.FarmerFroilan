package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

public class CornStalk extends Crop{
    /**Create Instances of CornStalk
     * <Producer>yield(EarCorn)</Producer> // can yield 1-3 EarCorn
     * <Producer>hasBeenFertilized()</Producer> // ready to yield next day
     * <Crop></Crop>hasBeenHarvested(); // EarCorn moved to storage && removed from row
     * <Crop></Crop>hasBeenPlanted(); // ready to be fertilized next day && added to row
     *
     CornStalk cornStalk = new CornStalk(int id, CropRow id, Edible earCorn,  Boolean fertilized,
     *      * int yield)
     *      * ID #s range from 31 - 60 OR 61 - 90 id++ upon creation
     *      *int yield (){ Random # btw 8-16}
     *      *
     *      *when harvest(Crop earCorn, int yield) ->which should trigger
     *      *  earCornCounter += yield update FoodStorage
     *      *  .remove from CropRow
     *
     *
     */


}
