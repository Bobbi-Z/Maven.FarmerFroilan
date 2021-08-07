package com.zipcodewilmington.froilansfarm.Animals.People;

import com.zipcodewilmington.froilansfarm.Animals.Animal;

public class Person extends Animal {

   private Integer id;
   private String name;
   private Boolean hasEaten;

    public Person() {


    }

    public Person(Integer id, String name, Boolean hasEaten) {
        setId(id);
        setName(name);
        setHasEaten(hasEaten);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasEaten() {
        return hasEaten;
    }

    public void setHasEaten(Boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public Boolean hasEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }

 public String nap(){
        return null;
 }

 public String sleep(){
        return null;
 }

 public String wakeUp(){
        return null;
 }

 public String party(){
        return null;
 }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hasEaten=" + hasEaten +
                '}';
    }
}
