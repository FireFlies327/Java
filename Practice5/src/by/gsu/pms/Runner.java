package by.gsu.pms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Meat> sortedByCountry = new ArrayList<Meat>();
        ArrayList<Meat> sortedByPrice = new ArrayList<Meat>();
        Meat[] meatList = new Meat[9];
        meatList[0] = new Meat("Беларусь", 10000, 0);
        meatList[1] = new Meat("Россия", 15000, 1);
        meatList[2] = new Meat("Украина", 20000, 2);
        meatList[3] = new Meat("Литва", 25000, 1);
        meatList[4] = new Meat("Латвия", 30000, 3);
        meatList[5] = new Meat("Польша", 35000, 0);
        meatList[6] = new Meat("Казахстан", 40000, 2);
        meatList[7] = new Meat("Германия", 55000, 4);
        meatList[8] = null;

        System.out.println("\n\nNot sorted");
        for (Meat Meat:meatList) {
            if ((Meat!=null)) {
                System.out.println(Meat.toString());
                if (Meat.getPrice()>0) {
                    sortedByPrice.add(Meat);
                    sortedByCountry.add(Meat);
                }
            }
        }

        System.out.println("\nСортировка по странам:");
        sortedByCountry = Sort_meat.sortMeatByCountry(sortedByCountry);

        for (Meat meat:sortedByCountry) {
            System.out.println(meat.toString());
        }

        System.out.println("\nСортировка по цене:");

        for (Meat meat:sortedByPrice) {
            System.out.println(meat.toString());
        }

        float total_price = 0;
        for (Meat meat:meatList) {
            if (meat != null) {
                total_price+=meat.getPrice();
            }
        }

        System.out.println("\nЦена всего мяса: "+valueOf(total_price));

        int amountOfMeatWithDopant = 0;
        for (Meat meat:meatList) {
            if (meat != null) {
                if (meat.getAmountOfDopant()>0) {
                    amountOfMeatWithDopant+=1;
                }
            }
        }

        System.out.println("Количество мяса с добавками: "+valueOf(amountOfMeatWithDopant));

    }
}