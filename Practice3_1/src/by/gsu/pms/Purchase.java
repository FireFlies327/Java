package by.gsu.pms;

import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private String name;
    private Cost price;
    private int numUnits;

    public Purchase() {
    }

    public Purchase(String name, Cost price, int numberUnits) {
        this.name = name;
        this.price = price;
        this.numUnits = numberUnits;
    }

    public Purchase(Scanner sc) {
        this.name = sc.next();
        this.price = new Cost(sc.nextInt());
        this.numUnits = sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public Cost getPrice() {
        return price;
    }

    public int getnumUnits() {
        return numUnits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Cost price) {
        this.price = price;
    }

    public void setUnitsNumber(int unitsNumber) {
        this.numUnits = unitsNumber;
    }

    public Cost getCost() {
        Cost total = new Cost(price);
        return total.mul(numUnits);
    }

    protected String fieldsToString() {
        return name + ";" + price + ";" + numUnits;
    }

    public String toString() {
        return fieldsToString() + ";" + getCost();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Purchase)) return false;
        Purchase purchase = (Purchase) obj;
        return Objects.equals(name, purchase.name)
                && price.equals(purchase.price);
    }
}