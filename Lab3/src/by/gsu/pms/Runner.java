package by.gsu.pms;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    private static void print(Patient[] men) {
        for (Patient person : men) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        final String input = "src/input.txt";
        final int amount_patient = 10;
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(input));
            sc.useLocale(Locale.ENGLISH);
            Patient[] men = new Patient[amount_patient];
            double totalAge = 0;
            int amountOfFemale = 0;

            for (int i = 0; i < men.length; i++) {
                String surname = sc.next();
                int age = sc.nextInt();
                int gender = sc.nextInt();
                men[i] = new Patient(surname, age, gender); // male=0, female=1
            }
            print(men);

            Serialization serialization = new Serialization();
            serialization.serialization(men);

            Patient[] newMen;
            Deserialization deserialization = new Deserialization();
            newMen = deserialization.deserialization();

            System.out.println();
            System.out.println("После сериализации:");
            print(newMen);

            for (Patient person : newMen) {
                totalAge += person.getAge();
                if (person.getGender() == Gender.female) {
                    amountOfFemale++;
                }
            }

            System.out.println();
            System.out.println("Средний возраст " + totalAge / amount_patient);
            System.out.println("Количество женщин " + amountOfFemale);
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println("Статический файл отсутствует");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}