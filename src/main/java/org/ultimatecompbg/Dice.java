package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Dice {
    static int throwNumber;
    static int combinationX;
    static int combinationY;

    public ArrayList<Dice> dice(int throwNumber){
        Dice newDice = new Dice();
        ArrayList<Dice> diceStats = new ArrayList<Dice>();
        Random random = new Random();
        for(int i = 0; i < throwNumber; i++){
            Dice.throwNumber = throwNumber;
            Dice.combinationX = (int)(Math.random() * 6) + 1;
            Dice.combinationY = (int)(Math.random() * 6) + 1;
            diceStats.add(newDice);
        }

        return diceStats;
    }
}
