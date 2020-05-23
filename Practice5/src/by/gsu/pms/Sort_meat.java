package by.gsu.pms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort_meat {

    public static ArrayList<Meat> sortButtersByPrice(ArrayList<Meat> meats) {
        meats.sort(Comparator.comparing(Meat::getPrice));
        return meats;
    }

    public static ArrayList<Meat> sortMeatByCountry(ArrayList<Meat> meats) {
        meats.sort(Comparator.comparing(Meat::getCountry));
        return meats;
    }
}