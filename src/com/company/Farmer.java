package com.company;

import com.company.animals.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Farmer extends Human{
    private ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
    Scanner scanner = new Scanner(System.in);


    public Farmer(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public Farmer(String farmerFirstName, String farmerSecondName, int sizeOfFarm) {
        super();
    }

    public void addAnimal(){
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Species: ");
        String species = scanner.next();
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();
        Animal animal = new Animal(name,species,weight);
        animalArrayList.add(animal);
        System.out.println("Success! "+animal.getName()+" was added.");
    }
    public void buyAnimal(){

    }
    public void showAnimals(){
        for (Animal animal : animalArrayList) {
            System.out.println(animal.getName());
        }
    }
}
