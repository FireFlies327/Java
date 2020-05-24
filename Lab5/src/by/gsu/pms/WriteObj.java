package by.gsu.pms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObj {
    public static void main(String[] args) {
        try {
            Patient[] patients = {
                    new Patient(0, "Ivanov", 15),
                    new Patient(0, "Sidorov",44),
                    new Patient(0,"Popov",36),
                    new Patient(1, "Petrova",29),
                    new Patient(0, "Sokolov",23),
                    new Patient(1, "Lebedeva",55),
                    new Patient(1, "Volkova",20),
                    new Patient(1, "Zaiceva",18),
                    new Patient(0, "Komarov",48),
                    new Patient(1, "Tarasova",32)
            };
            // male=0, female=1

            FileOutputStream fos = new FileOutputStream("patient.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(patients);

            oos.close();
        } catch (StackOverflowError e) {
            System.out.println("Вам не хватает памяти");
        } catch (ExceptionEmptySurname e) {
            System.out.println(e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"patient.bin\" не найден");
        } catch (IOException e) {
            System.out.println("Проблема с вводом данных");
        }
    }
}