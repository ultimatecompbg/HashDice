package org.ultimatecompbg;

import java.util.Comparator;

public class StatsComparator implements Comparator<Dice> {
    public int compare(Dice d1, Dice d2){
        if(d1.combination.equals(d2.combination)){
            return 1;
        }
        return 0;
    }
}
