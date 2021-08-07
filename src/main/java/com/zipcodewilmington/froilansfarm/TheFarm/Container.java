package com.zipcodewilmington.froilansfarm.TheFarm;

public abstract class Container  {

    public abstract <T extends Container> findSpecific(); //Read
     listAll(); //Read
     status(); //Update
     remove (); //Delete
     store(); //Create

}
