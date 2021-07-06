package com.company;

public class Human {
    public String firstName;
    public String secondName;
    private int age;
    private double cash;

    public Human(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Human() {

    }

    double getCash(){
        return this.cash;
    }
    void setCash(double value)
    {
        this.cash = value;
    }


    public void buyAnimal(Human seller, Human buyer, double price){

    }
    public void sellAnimal(Human seller, Human buyer, double price){

    }



}
