package by.gsu.pms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization {

    public ArrayList<Iphone> deserialize() {
        ArrayList<Iphone> IPhones = null;
        try(

                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:Iphone.dat"))
        )
        {
            IPhones =(ArrayList<Iphone>)ois.readObject();

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return IPhones;
    }
}