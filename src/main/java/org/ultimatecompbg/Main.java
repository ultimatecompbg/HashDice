package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static org.ultimatecompbg.Dice.dice;

import static org.ultimatecompbg.PrintStats.printStats;
import static org.ultimatecompbg.Test.test;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rolls = scanner.nextInt();
        HashMap<String, ArrayList<Integer>> diceStats = dice(rolls);
        printStats(diceStats);
        System.out.println("########TEST########");
        test(diceStats);
    }
}