package com.zipcodewilmington.froilansfarm.IO.TheWeek.WorkWeek;

import com.zipcodewilmington.froilansfarm.IO.TheWeek.Week;

public class Friday extends Week {
    /**
     * wake up()
     *  - reset all booleans
     *  -get inventory for edibles & consumables
     *
     *
     * eat(Edibles) //Breakfast //removes food from storage
     * hasEaten(numEdibles) = true stop false keep eating
     *
     *  has egg() // default true reset every day
     * true = chicken yields
     * sleepwithrooster() //check every chicken
     * if true check iffertalized
     * if false send to food storgae & set has egg to false
     * check iffertilized  //check once yield
     * true = incubator //set hasegg to false
     * false = food storage // set hasegg to false
     *
     * has eaten()//default false reset every day
     * false = feed() //switch to true
     * chicken eat //removes food from storage
     *
     * hasbeengroomed()//default false //rest every day
     * groom()//set boolean to true
     *
     * hasbeenrideen()//default false //reset everyday
     * mount()
     * move()//set ridden to true
     * dismount()
     *
     * has eaten()//default false reset every day
     * false = feed() //switch to true
     * horse eat //removes food from storage
     *
     * eat()//lunch //removes food from storage
     * has eaten(int) // check every meal
     *
     *mount() ->check that hasbeenridden is false, has fuel is true, has fertilizer is true
     * move() //switch has been ridden to true
     * hasBeenRidden()// default false // must be RESET
     * operateOnFarm()// trigger fertilize
     * hasFuel() //default true
     * harvest()// delete from field/ croprow
     *
     * harvest(21-30 TomatoPlant Row 5);
     * harvest(21-30 CornStalk Row 4);
     * harvest(21-30 CornStalk Row 3);
     * harvest(21-30 PotatoRoot Row 2);
     * harvest(21-30 PotatoRoot Row 1);
     ** refuel() // resets has fuel to true & removes fuel from shed
     *
     *
     * eat()//dinner //removes food from storage
     * has eaten(int) // check every meal & then reset
     *
     *assign coops
     * assign stables
     *
     *sleep()
     *
     *
     */


}
