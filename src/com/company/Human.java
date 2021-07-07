package com.company;

import java.util.Random;

public class Human {
    public String firstName;
    public String secondName;
    private double cash;

    Random r = new Random();

    public Human(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
        this.cash = Math.round(1000.0 + (10000.0-1000.0) * r.nextDouble()*100)/100D;
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

}
