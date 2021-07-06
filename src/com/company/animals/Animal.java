package com.company.animals;

public class Animal {
    final private String name;
    final private String species;
    private int hungerLevel = 12;
    private double weight;
    private int age;

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
    }
    public String getName(){
        return this.name;
    }
    public void feed(){
        this.hungerLevel-=1;
        this.weight+=1;
    }
    public void checkHungerLevel(){
        System.out.println("Hunger level of "+this.name+": "+this.hungerLevel);
    }

}
