package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

public interface Eater{

    <T extends Edible> String eat();
  <T extends Animal>  Boolean hasEaten();


}
