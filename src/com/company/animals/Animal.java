package com.company.animals;

import java.util.*;

public class Animal implements Comparable<Animal>{
    final private String name;
    final private String species;
    private double hungerLevel;
    private double weight;
    private int age;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getSpecies(){
        return this.species;
    }

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }
    public void feed(){
        this.hungerLevel-=1;
        this.weight+=1;
    }

    public void setHungerLevel() {
        this.hungerLevel = 1 + (int)(Math.random() * ((12 - 1) + 1));
    }

    public void checkHungerLevel(){
        System.out.println("Hunger level of "+this.name+": "+this.hungerLevel);
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }

}
