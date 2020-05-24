package by.gsu.pms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObj {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("patient.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Patient[] patients = (Patient[]) ois.readObject();

            if(patients.length == 0)
                throw new ExceptionEmptyPatients();

            System.out.println(Arrays.toString(patients));

            ois.close();
        } catch (ExceptionEmptyPatients e) {
            System.out.println("Массив пуст");
        } catch (StackOverflowError e) {
            System.out.println("Вам не хватает памяти");
        } catch (FileNotFoundException e) {
            System.out.println("Файл \"patient.bin\" не найден");
        } catch (IOException e) {
            System.out.println("Проблема с вводом данных");
        } catch (ClassNotFoundException e) {
            System.out.println("Класс с именем Patient не найден");
        }
    }
}