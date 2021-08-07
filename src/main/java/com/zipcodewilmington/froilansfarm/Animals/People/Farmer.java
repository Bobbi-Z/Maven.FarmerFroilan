package com.zipcodewilmington.froilansfarm.Animals.People;

import com.zipcodewilmington.froilansfarm.Animals.BabyChicks;
import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.TheFarm.CropsCropRowField.Crop;
import com.zipcodewilmington.froilansfarm.MultipackageInterfaces.Consumable;

public class Farmer extends Person implements Botanist <Person>, Rider <Person>{

 private String job;

 public Farmer() {

 }

 public Farmer(Integer id, String name, Boolean hasEaten, String job) {
  setId(id);
  setName(name);
  setHasEaten(hasEaten);
  setJob(job);
 }

 @Override
 public Integer getId() {
  return super.getId();
 }

 @Override
 public void setId(Integer id) {
  super.setId(id);
 }

 @Override
 public String getName() {
  return super.getName();
 }

 @Override
 public void setName(String name) {
  super.setName(name);
 }

 @Override
 public Boolean getHasEaten() {
  return super.getHasEaten();
 }

 @Override
 public void setHasEaten(Boolean hasEaten) {
  super.setHasEaten(hasEaten);
 }

 public String getJob() {
  return job;
 }

 public void setJob(String job) {
  this.job = job;
 }
 @Override
 public <T extends Crop> String plant() {
  return null;
 }

 @Override
 public <T extends Rideable> String mount() {
  return null;
 }

 @Override
 public <T extends Rideable> String dismount() {
  return null;
 }

 @Override
 public String eat() {
  return super.eat();
 }

 @Override
 public Boolean hasEaten() {
  return super.hasEaten();
 }

 @Override
 public String makeNoise() {
  return super.makeNoise();
 }

 @Override
 public String nap() {
  return super.nap();
 }

 @Override
 public String sleep() {
  return super.sleep();
 }

 @Override
 public String wakeUp() {
  return super.wakeUp();
 }

 @Override
 public String party() {
  return super.party();
 }


 public <T extends Consumable> Object trade(BabyChicks babyChicks){
  return null;
 }

 public <T extends Chicken, Horse> String feed(Edible edible){
  return null;
 }


 @Override
 public String toString() {
  return "Farmer{" +
          "job='" + job + '\'' +
          "} " + super.toString();
 }
}