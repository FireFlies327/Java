package by.gsu.pms;

import java.util.Scanner;

public class Price extends Purchase {
    private Cost rebate;

    public Price() {
    }

    public Price(String name, Cost price, int numberUnits, Cost discount) {
        super(name, price, numberUnits);
        this.rebate = discount;
    }

    public Price(Scanner sc) {
        super(sc);
        this.rebate = new Cost(sc.nextInt());
    }

    public Cost getCost() {
        Cost total = new Cost(getPrice());
        return total.sub(rebate).mul(getnumUnits());
    }

    protected String fieldsToString() {
        return super.fieldsToString() + ";" + rebate;
    }
}