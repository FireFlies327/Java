package by.gsu.pms;

public class PurchaseTransport extends AbstractPurchase implements Information {

    private double TransportCost;

    public PurchaseTransport(Commodity commodity, int CountOfPurchasedUnits, double transportExpenses) {
        super(commodity, CountOfPurchasedUnits);
        this.TransportCost = transportExpenses;
    }

    public double getTransportExpenses() {
        return TransportCost;
    }

    public void setTransportExpenses(double transportExpenses) {
        this.TransportCost = transportExpenses;
    }

    public double getCost() {
        return getCommodity().getPrice() * getCountOfPurchasedUnits() + TransportCost;
    }
}