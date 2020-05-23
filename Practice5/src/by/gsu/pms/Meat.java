package by.gsu.pms;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.String.valueOf;

public class Meat implements Comparable<Meat> {
    public Meat() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmountOfDopant() {
        return amountOfDopant;
    }

    public void setAmountOfDopant(int amountOfDopant) {
        this.amountOfDopant = amountOfDopant;
    }

    private String country;
    private float price;
    private int amountOfDopant;

    public Meat(String country, float price, int amountOfDopant) {
        this.country = country;
        this.price = price;
        this.amountOfDopant = amountOfDopant;
    }

    public String toString() {
        return valueOf(country)+";"+valueOf(price)+";"+valueOf(amountOfDopant);
    }

    public int compareTo(Meat o) {
        return Float.compare(this.price,o.price);
    }
}