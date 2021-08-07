package com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField;

import com.zipcodewilmington.froilansfarm.TheFarm.Container;
import com.zipcodewilmington.froilansfarm.TheFarm.Store;

public class CropRowUtils <T extends Crop> implements Container<T> {
    /**
     * maintains list of crops
     * PotatoRoot - 60 total 30 row 1 30 row 2
     * CornStalk - 60 total 30 row 3 30 row 4
     * TomatoPlant - 30 total row 5
     * First In, First Updated, First Out (data type queue) maybe a linked list
     */
    
    @Override
    public T findSpecific() { //by rowNumber
        return null;
    }

    @Override
    public T listAll() {
        return null;
    }

    @Override
    public T status() { //update
        return null;
    }

    @Override
    public T remove() { //delete
        return null;
    }

    @Override
    public T store() { //add
        return null;
    }
    
}
