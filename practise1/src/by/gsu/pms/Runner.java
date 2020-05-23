package by.gsu.pms;

public class Runner {
    public static void main(String[] args) {

        Workers[] workers = new Workers[7];
        workers[0] = new Workers("Anton", 50000, 5);
        workers[1] = new Workers("Alex", 60000, 7);
        workers[2] = new Workers("Anatoly", 55000, 6);
        workers[3] = new Workers("Masha", 65000, 8);
        workers[4] = new Workers("Lena", 45000, 4);
        workers[5] = new Workers("Dima", 70000, 9);
        workers[6] = new Workers("Victor", 40000, 3);

        for (Workers Workers : workers) {
            if (Workers != null) {
                Workers.show();
            }
        }

        workers[workers.length-2].set_trans_cost(53);

        for (int workers_id = 0; workers_id < workers.length; workers_id++) {
            int sum_of_length = 0;
            if (workers[workers_id] != null){
                sum_of_length = workers[workers_id].get_days();
            } else {
                continue;
            }
            for (int workers_2_id = workers_id + 1; workers_2_id < workers.length; workers_2_id++) {
                if (workers[workers_2_id] != null
                        && workers[workers_id].get_acc().equals(workers[workers_2_id].get_acc())){

                    sum_of_length += workers[workers_2_id].get_days();
                }
            }
            System.out.println("Сотрудник "+workers[workers_id].get_acc()+" был(а) в командировке "+sum_of_length
                    + " дня(-ей)");
        }

        for (Workers worker : workers) {
            if (worker != null) {
                System.out.println(worker.to_string());
            }
        }

        int total_cost = 0;
        for (Workers worker : workers) {
            if (worker != null) {
                total_cost += worker.total();
            }
        }
        System.out.println("Сумма всех рассходов: " + total_cost);

        int workers_numb = 0;
        float workers_total = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                float total = workers[i].total();
                if (total > workers_total){
                    workers_numb = i;
                    workers_total = total;
                }
            }
        }
        System.out.println("Наибольшая сумма рассходов: " + workers_total + " y " +
                workers[workers_numb].get_acc());

    }
}