package by.gsu.pms;

public class Price extends AbstractPurchase implements Information {

    private double rebate;

    public Price(Commodity commodity, int countOfPurchasedUnits, double rebate) {
        super(commodity, countOfPurchasedUnits);
        this.rebate = rebate;
    }

    public double getRebate() {
        return rebate;
    }

    public void setRebate(double rebate) {
        this.rebate = rebate;
    }

    public double getCost() {
        return (getCommodity().getPrice() - rebate) * getCountOfPurchasedUnits();
    }
}