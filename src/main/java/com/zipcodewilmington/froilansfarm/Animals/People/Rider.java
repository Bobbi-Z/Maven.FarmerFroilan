package com.zipcodewilmington.froilansfarm.Animals.People;

import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Rideable;

public interface Rider <Person> {

   <T extends Rideable> String mount();
   <T extends Rideable> String dismount();




}
