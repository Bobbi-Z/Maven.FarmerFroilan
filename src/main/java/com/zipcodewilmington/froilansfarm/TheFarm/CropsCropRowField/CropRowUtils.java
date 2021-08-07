package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

import com.zipcodewilmington.froilansfarm.TheFarm.Container;

public class CropRowUtils implements Container <Crop> {
    /**
     * maintains list of crops
     * PotatoRoot - 60 total 30 row 1 30 row 2
     * CornStalk - 60 total 30 row 3 30 row 4
     * TomatoPlant - 30 total row 5
     * First In, First Updated, First Out (data type queue) maybe a linked list
     */
    
    @Override
    public CropRow findSpecific() { //by rowNumber
        return null;
    }

    @Override
    public CropRow listAll() { 
        return null;
    }

    @Override
    public CropRow status() { //update
        return null;
    }

    @Override
    public CropRow remove() { //delete
        return null;
    }

    @Override
    public CropRow store() { //add
        return null;
    }
    
}
