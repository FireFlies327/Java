package by.gsu.pms;

import java.util.Scanner;

public class Percent extends Purchase {
    private double rebate;
    private static final int LIMIT = 5;

    public Percent() {
    }

    public Percent(String name, Cost price, int numberUnits, double discount) {
        super(name, price, numberUnits);
        this.rebate = discount;
    }

    public Percent(Scanner sc) {
        super(sc);
        this.rebate = sc.nextDouble();
    }

    public Cost getCost() {
        Cost cost = super.getCost();
        Cost percent100 = new Cost(100);
        if (getnumUnits() > LIMIT) {
            cost.mul(((100 - rebate) / 100), Cost.RoundMethod.CEILING, 0);
        }
        return cost;
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + rebate;
    }
}