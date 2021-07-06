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



        int choice = -1;
        do{
            System.out.println("\n1. Add animal");
            System.out.println("2. Sell animal");
            System.out.println("3. Show all your animals");
            System.out.println("4. Sort animals by weight");
            System.out.println("5. Sort animals by name");
            System.out.println("0. Quit\n");
            System.out.println("What you want to do: ");
            choice = scanner.nextInt();
                switch(choice){
                    case 0:
                        System.out.println("Have a nice day :)");
                        break;
                    case 1:

                        farmer.addAnimal();
                        break;
                    case 2:


                    case 3:
                        farmer.showAnimals();
                        break;

                    case 4:

                        break;
                    case 5:

                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
            }}
        while(choice != 0);
        }
        }
