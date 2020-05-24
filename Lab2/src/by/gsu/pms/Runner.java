package by.gsu.pms;

import java.util.Arrays;
import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {

        double final_sum = 0;

        TaxiPark Car1 = new TaxiPark(150);
        final_sum += Car1.getTaxiPark();

        TaxiPark Car2 = new TaxiPark(250);
        final_sum += Car2.getTaxiPark();

        TaxiPark Car3 = new TaxiPark(100);
        final_sum += Car3.getTaxiPark();

        TaxiPark Car4 = new TaxiPark(300);
        final_sum += Car4.getTaxiPark();

        TaxiPark Car5 = new TaxiPark(50);
        final_sum += Car5.getTaxiPark();
        System.out.println("Стоимость автопарка: " + final_sum);

        Expense fuelRate1 = new Expense(7);
        final_sum += fuelRate1.getExpense();
        System.out.println("Расход Car1: 7");

        Expense fuelRate2 = new Expense(8);
        final_sum += fuelRate2.getExpense();
        System.out.println("Расход Car2: 8");

        Expense fuelRate3 = new Expense(9);
        final_sum += fuelRate3.getExpense();
        System.out.println("Расход Car3: 9");

        Expense fuelRate4 = new Expense(10);
        final_sum += fuelRate4.getExpense();
        System.out.println("Расход Car4: 10");

        Expense fuelRate5 = new Expense(11);
        final_sum += fuelRate5.getExpense();
        System.out.println("Расход Car5: 11");

        Speed Speed1 = new Speed(200);
        final_sum += Speed1.getSpeed();

        Speed Speed2 = new Speed(180);
        final_sum += Speed2.getSpeed();

        Speed Speed3 = new Speed(210);
        final_sum += Speed3.getSpeed();

        Speed Speed4 = new Speed(250);
        final_sum += Speed4.getSpeed();

        Speed Speed5 = new Speed(190);
        final_sum += Speed5.getSpeed();

        double[] Park = new double[]{
                Speed1.getSpeed(),
                Speed2.getSpeed(),
                Speed3.getSpeed(),
                Speed4.getSpeed(),
                Speed5.getSpeed()};
        Arrays.sort(Park);

        System.out.println("There is "+valueOf(Park.length)+" taxes");
        System.out.println("Самая быстрая машина "+valueOf(Park[4]));
    }
}