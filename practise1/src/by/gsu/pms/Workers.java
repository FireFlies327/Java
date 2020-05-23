package by.gsu.pms;

public class Workers{

    private static int allowance = 25000;
    private String acc;
    private int trans_cost;
    private int days;

    public Workers(String acc, int trans_cost, int days) {
        this.acc = acc;
        this.trans_cost = trans_cost;
        this.days = days;
    }

    public Workers() {
        this.acc = "";
        this.trans_cost = 0;
        this.days = 1;
    }

    public String get_acc() {
        return acc;
    }

    public void set_acc(String acc) {
        this.acc = acc;
    }

    public int get_trans_cost() {
        return trans_cost;
    }

    public void set_trans_cost(int trans_cost) {
        this.trans_cost = trans_cost;
    }

    public int get_days() {
        return days;
    }

    public void set_days(int number_of_days) {
        this.days = number_of_days;
    }

    public float total(){
        if (days==1){
            return trans_cost;
        } else {
            return allowance * days + trans_cost;
        }
    }

    public void show(){
        System.out.println(" ******* ");
        System.out.println("ставка = " + allowance);
        System.out.println("счет = " + acc);
        System.out.println("транспорт = " + trans_cost);
        System.out.println("дни = " + days);
        System.out.println("итого = " + total());
    }

    public String to_string(){
        return allowance +";"+ acc+";"+trans_cost+";"+days+";"+total();
    }
}