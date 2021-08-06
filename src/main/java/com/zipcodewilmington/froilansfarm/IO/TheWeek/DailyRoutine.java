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
     *      mount();
     *      <Horse> move()</Horse>
     *      dismount()
     *       <Horse>hasBeenExercised(True)</Horse>
     *       store(Stable)
     *      <Horse>hasEaten(False)</Horse>
     *      feed()
     *      <Horse>eat()</Horse>
     *      <Horse>hasEaten(true)</Horse>
     *  > Chickens
     *      <chicken>yield(1 egg)</chicken>
     *      <chicken>hasEgg(True)</chicken>
     *      checkFertilized() // check if the hen slept in the same coop as the rooster
     *      store(foodstorage OR incubator)
     *      <chicken>hasEgg(False)</chicken>
     *
     *      assigncoop();
     *      <Chicken>hasEaten(False)</Chicken>
     *       feed()
     *      <Chicken>eat()</Chicken>
     *      <Chicken>hasEaten(True)</Chicken>
     *  >Eat breakfast // Froilan = 4 eggs 3 potatoes | Froilanda 3 eggs & 2 potatos
     *      eat(Edible) //
     *      hasEaten() //when enough edibles have been consumed Froilan = 7 & Froilanda = 5
     *  >Eat Lunch //Froilan 3 corn 2 tomatoes | Froilanda 2 corn 1 tomato
     *      eat(Edible)
     *      hasEaten() //when enough edibles have been consumed Froilan = 5 & Froilanda = 3
     *  >Eat Dinner //Froilan 2 egg 2 tomato, 2 corn 2 potato Froilanda = 1 egg, 1 tomato, 2 corn, 2 potato
     *      eat(Edible)
     *      hasEaten() //when enough edibles have been consumed Froilan = 8 & Froilanda = 6
     *  >Sleep
     *      sleep() //end day
     *      reset any an all methods that need to be
     *
     */






}
