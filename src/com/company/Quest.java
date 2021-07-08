package com.company;

import java.util.Scanner;

public class Quest {
    static Scanner scanner = new Scanner(System.in);

    public static int earnMoney(){
        int reward = 100 + (int)(Math.random() * ((1000 - 100) + 100));
        int x = 1 + (int)(Math.random() * ((100 - 1) + 1));
        int y = 1 + (int)(Math.random() * ((100 - 1) + 1));
        int result = x+y;
        System.out.println("How much is "+x+" + "+y+"?");
        int answer = scanner.nextInt();
        if(result == answer){
            System.out.println("Well done! :)\nYou won: $"+reward);
            return reward;
        }
        else{
            System.out.println("Wrong answer :(");
            return 0;
        }
    }
}
