package org.ultimatecompbg;

import java.util.ArrayList;
import java.util.Comparator;

public class PrintStats {
    public static void printStats(ArrayList<Dice> diceStats){
        StatsComparator statsComparator = new StatsComparator();
        diceStats.sort(statsComparator);
        for(int i = 0; i < diceStats.size(); i++){
            System.out.printf("%s : %s%n", diceStats.get(i).combination, diceStats.get(i).throwNumber);
        }

    }
}
