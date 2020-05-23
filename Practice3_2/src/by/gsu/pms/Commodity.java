package by.gsu.pms;

public class Commodity {
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Commodity{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }

    private String product;
    private double price;

    public Commodity() {
        this.product = "Default";
        this.price = 0;
    }

    public Commodity(String product, double price) {
        this.product = product;
        this.price = price;
    }

}