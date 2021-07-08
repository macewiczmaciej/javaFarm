package com.company;

import com.company.animals.Animal;
import com.company.animals.AnimalComparator;
import com.company.animals.Cow;

import java.util.*;

public class Farmer extends Human {
    private ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
    Scanner scanner = new Scanner(System.in);

    public Farmer(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public void buyAnimal(){
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Species: ");
        String species = scanner.next();
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();
        Animal animal = new Animal(name,species,weight);
        if(animal.getPrice()>getCash()) {
            System.out.println("You have no money!");
        }else{
            animalArrayList.add(animal);
            System.out.println(animal.getPrice());
            setCash(getCash()-animal.getPrice());
            System.out.println("Success! "+animal.getName()+" was added.");
        }
    }
    public void sellAnimal(){
        if(animalArrayList.size()>0)
        {
            showAnimals();
            System.out.println("Type animal number you want delete");
            int del = scanner.nextInt();
            animalArrayList.remove(del);
            System.out.println("Success! Animal was removed.");
        }else{
            System.out.println("You have no animals");
        }
    }
    public void showAnimals(){
        if(animalArrayList.size()>0)
        {
            System.out.println("Your all animals: ");
            for (int i = 0; i < animalArrayList.size(); i++) {
                System.out.println((i+1)+". "+ animalArrayList.get(i).getName());
            }
        }else{
            System.out.println("You have no animals");
        }
    }
    public void sortAnimalsByName(){
        if(animalArrayList.size()>0)
        {
            animalArrayList.sort(new Comparator<Animal>() {
                @Override
                public int compare(Animal o1, Animal o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println("Sorted by names: ");
            for (int i = 0; i < animalArrayList.size(); i++) {
                System.out.println((i+1)+". "+ animalArrayList.get(i).getName());
            }
        }else{
            System.out.println("You have no animals");
        }
    }
    public void sortAnimalsByWeight(){
        if(animalArrayList.size()>0)
        {
            List<Animal> weightSortedList = new ArrayList<>(animalArrayList);
            weightSortedList.sort(new AnimalComparator());
            System.out.println("Sorted by weight: ");
            for (int i = 0; i < weightSortedList.size(); i++) {
                System.out.println((i+1)+". "+ weightSortedList.get(i).getName());
            }
        }else{
            System.out.println("You have no animals");
        }
    }
    public void showAnimalsSpecies(){
        if(animalArrayList.size()>0)
        {
            Set<String> animalSpecies = new HashSet<>();
            for (Animal animal : animalArrayList) {
                animalSpecies.add(animal.getSpecies());
            }
            int i = 1;
            for (String animalSpecy : animalSpecies) {
                System.out.println(i+". "+animalSpecy);
                i++;
            }
            System.out.println("\nWhich species you want to see?");
            int x = (scanner.nextInt()-1);
            String[] species = animalSpecies.toArray(new String[animalSpecies.size()]);
            i = 1;
            for (Animal animal : animalArrayList) {
                if (animal.getSpecies().equals(species[x])) {
                    System.out.println(i+". "+animal.getName());
                    i++;
                }
            }
        }else{
            System.out.println("You have no animals");
        }
    }

    public void showPriceList() {
    }
}
