package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {

    public static void test(HashMap<String, ArrayList<Integer>> diceStats){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int combinationRolls = 0;
        for(HashMap.Entry<String, ArrayList<Integer>> entry : diceStats.entrySet()){
            String combination = entry.getKey();
            ArrayList<Integer> throwNumbers = entry.getValue();
            if(combination.equals(input)){
                combinationRolls += throwNumbers.size();
                System.out.printf("Combination (%s) thrown at position/s:%n", input);
                for(Integer throwNumber : throwNumbers){
                    System.out.printf("%s%n", throwNumber);
                    combinationRolls++;
                }
                System.out.printf("Number of rolls: %s%n", combinationRolls);
                System.out.println("###");

            }

        }

    }
}
