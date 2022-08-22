package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test {

    public static void test(ArrayList<Dice> diceStats){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] combination = input.split("x");
        int combinationX = parseInt(combination[0]);
        int combinationY = parseInt(combination[1]);
        int combinationRolls = 0;
        for(int i = 0; i < diceStats.size(); i++){
            int throwNumber = diceStats.get(i).throwNumber;
            if(diceStats.get(i).combinationX == combinationX && diceStats.get(i).combinationY == combinationY){
                System.out.println(String.format("Combination ({0},{1}) thrown at position {2}", combinationX, combinationY, throwNumber));
            }
            combinationRolls++;
        }
        System.out.println(String.format("Number of rolls: {0}", combinationRolls));
    }
}
