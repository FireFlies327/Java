package by.gsu.pms;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {

        Commodity Milk = new Commodity("Milk", 2.5);
        Commodity Meat = new Commodity("Meat", 1.2);
        Commodity Bread = new Commodity("Bread", 1.2);

        AbstractPurchase[] purchases = new AbstractPurchase[9];
        purchases[0] = new Price(Milk, 1, 0.15);
        purchases[1] = new Percent(Milk, 2, 20);
        purchases[2] = new PurchaseTransport(Milk, 9, 6);
        purchases[3] = new Price(Meat, 3, 0.3);
        purchases[4] = new Percent(Meat, 4, 15);
        purchases[5] = new PurchaseTransport(Meat, 2, 1);
        purchases[6] = new Price(Bread, 5, 0.4);
        purchases[7] = new Percent(Bread, 6, 25);
        purchases[8] = new PurchaseTransport(Bread, 5, 2);

        System.out.println("До:");
        for (AbstractPurchase purchase: purchases){
            System.out.println(purchase.toString());;
        }

        Arrays.sort(purchases, Comparator.comparing(AbstractPurchase::getCost));

        System.out.println("После:");
        for (AbstractPurchase purchase: purchases){
            System.out.println(purchase.toString());
        }

        System.out.println("Минимальная цена:");
        System.out.println(purchases[0].toString());

    }
}