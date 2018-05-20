package HW6.podarok;

import HW6.sladosti.Sladosti;

import java.util.Comparator;

public class SortBySugar implements Comparator<Sladosti> {
    public int compare(Sladosti o1, Sladosti o2){
        double p1 = o1.getSugar();
        double p2 = o2.getSugar();

        if (p1 < p2){
            return 1;
        }
        else if (p1 > p2){
            return -1;
        }
        else return 0;

    }
}
