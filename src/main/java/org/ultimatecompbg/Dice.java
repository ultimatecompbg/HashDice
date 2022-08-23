package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Dice {
    int throwNumber;
    String combination = "";

    public static ArrayList<Dice> dice(int throwNumber){

        ArrayList<Dice> diceStats = new ArrayList<Dice>();
        Random random = new Random();
        for(int i = 0; i < throwNumber; i++){
            Dice newDice = new Dice();
            newDice.throwNumber = i + 1;
            newDice.combination += Integer.toString((int)(Math.random() * 6) + 1);
            newDice.combination += "x";
            newDice.combination += Integer.toString((int)(Math.random() * 6) + 1);
            diceStats.add(newDice);
        }

        return diceStats;
    }
}
