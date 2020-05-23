package by.gsu.pms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Locale;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader("src/input.txt"));
            sc.useLocale(Locale.ENGLISH);

            final int Purchases_num = 6;
            Purchase[] purchases = new Purchase[Purchases_num];

            Purchase maximumCost = new Purchase("maxCost", new Cost(0), 0);
            boolean areEqual = true;

            for (int i = 0; i < purchases.length; i++) {
                purchases[i] = PurchasesFactory.getPurchaseFromFactory(sc);
                if (purchases[i].getCost().compareTo(maximumCost.getCost()) > 0) maximumCost = purchases[i];
                if (areEqual) {
                    areEqual = purchases[i].equals(purchases[0]);
                }
                System.out.println(purchases[i]);
            }

            System.out.println("Покупка с максимальной ценой = " + maximumCost);
            if (areEqual)
                System.out.println("Все товары куплены");

        } catch (FileNotFoundException e) {
            System.err.println("Входной файл не найден");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}