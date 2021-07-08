package com.company;

import com.company.animals.Animal;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String farmerFirstName = scanner.next();
        System.out.println("second name? ");
        String farmerSecondName = scanner.next();
        Farmer farmer = new Farmer(farmerFirstName,farmerSecondName);

        System.out.println(farmer.firstName+" "+farmer.secondName+" welcome in myFarm\n");
        System.out.println("You have: $"+farmer.getCash());

        int choice = -1;
        do{
            System.out.println("\n1. Buy animal");
            System.out.println("2. Sell animal");
            System.out.println("3. Show all your animals");
            System.out.println("4. Sort animals by name");
            System.out.println("5. Sort animals by weight");
            System.out.println("6. Check price list of animals");
            System.out.println("7. Show animals by species");
            System.out.println("8. Earn money!");
            System.out.println("0. Quit\n");
            System.out.println(farmer.getCash());
            System.out.println("What you want to do: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0 -> System.out.println("Have a nice day :)");
                case 1 -> farmer.addAnimal();
                case 2 -> farmer.delAnimal();
                case 3 -> farmer.showAnimals();
                case 4 -> farmer.sortAnimalsbyName();
                case 5 -> farmer.sortAnimalsbyWeight();
                case 6 -> farmer.showPriceList();
                case 7 -> farmer.showAnimalsSpecies();
                case 8 -> farmer.setCash(farmer.getCash()+Quest.earnMoney());

                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
        while(choice != 0);
    }
}
