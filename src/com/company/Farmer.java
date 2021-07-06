package com.company;

import com.company.animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Farmer extends Human {
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
    public void delAnimal(){
        showAnimals();
        System.out.println("Type animal number you want delete");
        int del = scanner.nextInt();
        animalArrayList.remove(del);
        System.out.println("Success! Animal was removed.");

    }
    public void showAnimals(){
        System.out.println("Your all animals: ");
        for (int i = 0; i < animalArrayList.size(); i++) {
            System.out.println((i+1)+". "+ animalArrayList.get(i).getName());
        }
        }
    public void sortAnimalsbyName(){
        Collections.sort(animalArrayList, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorted by names: ");
        for (int i = 0; i < animalArrayList.size(); i++) {
            System.out.println((i+1)+". "+ animalArrayList.get(i).getName());
        }

    }public void sortAnimalsbyWeight(){
        Collections.sort(animalArrayList, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });
        System.out.println("Sorted by weight: ");
        for (int i = 0; i < animalArrayList.size(); i++) {
            System.out.println((i+1)+". "+ animalArrayList.get(i).getName());
        }
    }
}
