package com.zipcodewilmington.froilansfarm.IO.TheWeek;

public interface DailyRoutine {

    /**
     * Froilan & Froilanda
     *  >WakeUp
     *      wakeUp() //start day
     *  >Horses
     *      <Horse>hasBeenGroomed()</Horse>
     *       groom();
     *     <Horse>hasBeenExercised(False)</Horse>
     *     mount
     *      ride
     *      <Horse> move()</Horse>
     *      dismount()
     *       <Horse>hasBeenExercised(True)</Horse>
     *       store(Stable)
     *      <Horse>hasEaten(False)</Horse>
     *      feed //horse food to edibles
     *      <Horse>eat()</Horse>
     *      <Horse>hasEaten(true)</Horse>
     *  > Chickens
     *      <chicken>yield(1 egg)</chicken>
     *      <chicken>hasEgg(True)</chicken>
     *      checkFertilized() // check if the hen slept in the same coop as the rooster
     *      collect(eggs)
     *      <chicken>hasEgg(False)</chicken>
     *      store(foodstorage OR incubator)
     *      <Chicken>hasEaten(False)</Chicken>
     *       feed() // add chicken feed to edibles
     *      <Chicken>eat()</Chicken>
     *      <Chicken>hasEaten(True)</Chicken>
     *  > Feed horses

     *  >Eat breakfast
     *      <Edible>isPrepared(false)</Edible>
     *      cook(Edible)
     *      <Edible>isPrepared(true)</Edible>
     *      eat(Edible)
     *      isfull() //when enough edibles have been consumed Froilan = 8 & Froilanda = 6
     *  >Eat Lunch
     *      <Edible>isEdible(false)</Edible>
     *      cook(Edible)
     *      <Edible>isEdible(true)</Edible>
     *      eat(Edible)
     *      isfull() //when enough edibles have been consumed Froilan = 4 & Froilanda = 3
     *  >Eat Dinner
     *      <Edible>isEdible(false)</Edible>
     *      cook(Edible)
     *      <Edible>isEdible(true)</Edible>
     *      eat(Edible)
     *      isfull() //when enough edibles have been consumed Froilan = 12 & Froilanda = 9
     *  >Sleep
     *      sleep() //end day
     *      reset any an all methods that need to be
     *
     */






}
