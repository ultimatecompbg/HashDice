package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {

    public static void test(ArrayList<Dice> diceStats){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int combinationRolls = 0;
        for(int i = 0; i < diceStats.size(); i++){
            int throwNumber = diceStats.get(i).throwNumber;
            if(diceStats.get(i).combination.equals(input)){
                combinationRolls++;
                System.out.printf("Combination (%s) thrown at position %s%n", input, throwNumber);
            }

        }
        System.out.printf("Number of rolls: %s", combinationRolls);
    }
}
