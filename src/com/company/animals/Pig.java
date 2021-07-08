package com.company.animals;

public class Pig extends Animal{
    final private double price = 1500;

    public Pig(String name, double weight)
    {
        super(name,"Pig" , weight);
    }
    @Override
    public double getPrice() {
        return price;
    }
}
