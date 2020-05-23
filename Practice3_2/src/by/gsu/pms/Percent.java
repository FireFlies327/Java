package by.gsu.pms;

public class Percent extends AbstractPurchase implements Information {

    private double rebate ;

    public Percent(Commodity commodity, int countOfPurchasedUnits, double rebate) {
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
        return getCommodity().getPrice() * getCountOfPurchasedUnits() * (100-rebate)/100;
    }
}