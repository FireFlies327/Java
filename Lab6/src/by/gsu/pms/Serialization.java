package by.gsu.pms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Serialization {


    public void serialize(ArrayList<Iphone> airlinesList)  {
        ObjectOutputStream oos = null;
        try {
            System.out.println("Serialized");
            oos = new ObjectOutputStream(new FileOutputStream("C:Iphone.dat"));
            oos.writeObject(airlinesList);
            oos.close();
        } catch (IOException e) {
            System.out.println(valueOf(e));
        }


    }


}