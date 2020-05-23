package by.gsu.pms;

public abstract class AbstractPurchase {

    private Commodity commodity;
    private int CountOfPurchasedUnits;

    public AbstractPurchase() {
        this.commodity = new Commodity();
        this.CountOfPurchasedUnits = 0;
    }

    public AbstractPurchase(Commodity commodity, int countOfPurchasedUnits) {
        this.commodity = commodity;
        this.CountOfPurchasedUnits = countOfPurchasedUnits;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getCountOfPurchasedUnits() {
        return CountOfPurchasedUnits;
    }

    public void setCountOfPurchasedUnits(int countOfPurchasedUnits) {
        this.CountOfPurchasedUnits = countOfPurchasedUnits;
    }

    public abstract double getCost();

    public String toString(){
        return commodity.toString() + ";" + CountOfPurchasedUnits + ";" + getCost();
    }

    public boolean CompareTo(AbstractPurchase purchase){
        return getCost() > purchase.getCost();
    }
}