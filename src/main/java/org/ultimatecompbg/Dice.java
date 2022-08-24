package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Dice {
    String combination = "";


    public static HashMap<String, ArrayList<Integer>> dice(int throwNumber){

        HashMap<String, ArrayList<Integer>> diceStats = new HashMap<String, ArrayList<Integer>>();
        Random random = new Random();
        for(int i = 0; i < throwNumber; i++){
            Dice newDice = new Dice();
            ArrayList<Integer> throwNumbers = new ArrayList<Integer>();
            throwNumbers.add(i + 1);
            newDice.combination += Integer.toString((int)(Math.random() * 6) + 1);
            newDice.combination += "x";
            newDice.combination += Integer.toString((int)(Math.random() * 6) + 1);
            if(diceStats.containsKey(newDice.combination)){
                diceStats.computeIfAbsent(newDice.combination, k -> new ArrayList<>()).add(i + 1);
            }else{
                diceStats.put(newDice.combination, throwNumbers);
            }

        }

        return diceStats;
    }
}
