package by.gsu.pms;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {

    private static double middleAge(Patient[] patient) {
        double result = 0;
        for (Patient item : patient)
            result += item.getAge();
        return result / patient.length;
    }

    private static int amountOfMen(Patient[] patient) {
        int result = 0;
        for (Patient item : patient)
            if (item.getGender().equals(Gender.male)) result++;
        return result;
    }

    public static void main(String[] args) {
        Patient[] patient = new Patient[10];
        patient[0] = new Patient("Ivanov", 15, Gender.male);
        patient[1] = new Patient("Sidorov", 44, Gender.male);
        patient[2] = new Patient("Popov", 36, Gender.male);
        patient[3] = new Patient("Petrova", 29, Gender.female);
        patient[4] = new Patient("Sokolov", 23, Gender.male);
        patient[5] = new Patient("Lebedeva", 55, Gender.female);
        patient[6] = new Patient("Volkova", 20, Gender.female);
        patient[7] = new Patient("Zaiceva", 18, Gender.female);
        patient[8] = new Patient("Komarov", 48, Gender.male);
        patient[9] = new Patient("Tarasova", 32, Gender.female);

        for (Patient item : patient)
            item.show();

        System.out.println("*******");
        for (Patient item : patient)
            System.out.println(item);

        System.out.println("*******");
        System.out.println("Средний возраст = " + middleAge(patient));
        System.out.println("Количество мужчин = " + amountOfMen(patient));

        Arrays.sort(patient);

        System.out.println("*******");
        System.out.println("Сортировка по возрасту:");
        for (Patient item : patient)
            System.out.println(item);

        class SortedBySurname implements Comparator<Patient> {
            public int compare(Patient obj1, Patient obj2) {
                String str1 = obj1.getSurname();
                String str2 = obj2.getSurname();
                return str1.compareTo(str2);
            }
        }

        Arrays.sort(patient, new SortedBySurname());

        System.out.println("*******");
        System.out.println("Сортировка по фамилиям:");
        for (Patient item : patient)
            System.out.println(item);
    }
}