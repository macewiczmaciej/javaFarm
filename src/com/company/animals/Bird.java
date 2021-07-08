package com.company.animals;

public class Bird extends Animal{
    final private double price = 1200;

    public Bird(String name, double weight)
    {
        super(name, "Bird", weight);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
