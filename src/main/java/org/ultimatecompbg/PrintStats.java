package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class PrintStats {
    public static void printStats(HashMap<String, ArrayList<Integer>> diceStats){
        /*StatsComparator statsComparator = new StatsComparator();
        Comparator<Dice> compareDice = Comparator.comparing(Dice::getCombination).reversed();
        Comparator<Dice> compareThrowNumber = Comparator.comparing(Dice::getThrowNumber);
        Comparator<Dice> compareAll = compareDice.thenComparing(compareThrowNumber);*/

        for(HashMap.Entry<String, ArrayList<Integer>> entry : diceStats.entrySet()){
            String combination = entry.getKey();
            ArrayList<Integer> throwNumbers = entry.getValue();
                System.out.printf("%s : %n", combination);
                for(Integer throwNumber : throwNumbers){
                    System.out.printf("#%s%n", throwNumber);
                }
        }

    }
}
