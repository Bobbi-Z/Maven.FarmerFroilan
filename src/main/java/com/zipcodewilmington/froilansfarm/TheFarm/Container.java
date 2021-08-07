package com.zipcodewilmington.froilansfarm.TheFarm;

public interface Container <T> {

    T findSpecific(); //Read
    T listAll(); //Read
    T status(); //Update
    T remove (); //Delete
    T store(); //Create

}
