package by.gsu.pms;

public class Travel {

    private static int daily_rate = 25000;

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getAmount_days() {
        return amount_days;
    }

    public void setAmount_days(int amount_days) {
        this.amount_days = amount_days;
    }

    public int getTrans_cost() {
        return trans_cost;
    }

    public void setTrans_cost(int trans_cost) {
        this.trans_cost = trans_cost;
    }

    private String acc;
    private int amount_days;
    private int trans_cost;

    public Travel(String acc, int trans_cost, int amount_days) {
        this.acc = acc;
        this.trans_cost = trans_cost;
        this.amount_days = amount_days;
    }

    public Travel() {
        this.acc = "Account";
        this.trans_cost = 0;
        this.amount_days = 1;
    }



    public float get_total(){
        if (amount_days ==1){
            return trans_cost;
        } else {
            return daily_rate * amount_days + trans_cost;
        }
    }

    public void show(){
        System.out.println("Количество дней: " + amount_days);
        System.out.println("Имя: " + acc);
        System.out.println("Дневная норма " + daily_rate);
        System.out.println("Транспортные расходы: " + trans_cost);
        System.out.println("Общие расходы: " + get_total());
    }

    public String to_string(){
        return daily_rate +";"+trans_cost+";"+ amount_days +";"+ acc+";"+get_total();
    }
}