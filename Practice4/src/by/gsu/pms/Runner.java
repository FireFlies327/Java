package by.gsu.pms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("src/Input.txt");
        Scanner scanner = new Scanner(file);

        double rate = Double.parseDouble(scanner.nextLine().split("=")[1]);
        int[] indices = Arrays.stream(scanner
                .nextLine()
                .split("=")[1]
                .split(";"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Travel[] Travels = new Travel[indices.length];

        for (int i=0; i < indices.length; i++){
            String account = scanner.nextLine().split("=")[1];
            int transport_expenses = Integer.parseInt(scanner.nextLine().split("=")[1]);
            int days_quantity = Integer.parseInt(scanner.nextLine().split("=")[1]);

            Travels[i] = new Travel(account, transport_expenses, days_quantity);
        }

        Arrays.sort(Travels, Comparator.comparing(Travel::get_total).reversed());

        for(Travel Trip: Travels){
            Trip.show();
        }
    }
}