package by.gsu.pms;

import java.util.Comparator;

public class IPhonesNameSorter implements Comparator<Iphone> {

    public int compare(Iphone o1, Iphone o2) {
        return o2.getDestination_point().compareToIgnoreCase(o1.getDestination_point());
    }
}