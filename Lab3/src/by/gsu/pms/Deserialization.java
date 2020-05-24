package by.gsu.pms;

import java.io.*;

public class Deserialization {

    public Patient[] deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("Serialization.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Patient[] people = (Patient[]) objectInputStream.readObject();
        objectInputStream.close();
        return people;
    }
}