package by.gsu.pms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.String.valueOf;

public class Runner {

    public static void main(String[] args) {
        Iphone iphone_clean = new Iphone();
        ArrayList<Iphone> IPhones = new ArrayList<>();
        IPhones.add(new Iphone("Alex", "Krasuk", "Olegovi4", "Krasuk_address",
                new Date(System.currentTimeMillis()), Weekday.Sunday));
        IPhones.add(new Iphone("Ivanov", "Ivan", "Dmirtievi4", "Ivanov_address",
                new Date(2020, 1, 5, 0, 20, 13), Weekday.Thursday));
        IPhones.add(new Iphone("Sidorov", "Anton", "Olegovi4", "Sidorov_address",
                new Date(2020, 2, 9, 0, 40, 26), Weekday.Tuesday));
        IPhones.add(new Iphone("Popov", "Nikita", "Alexandrovi4", "Popov_address",
                new Date(2020, 3, 15, 1, 0, 39), Weekday.Wednesday));
        IPhones.add(new Iphone("Petrov", "Artem", "Nikolaevi4", "Petrov_address",
                new Date(2020, 4, 19, 1, 20, 52), Weekday.Wednesday));

        Serialization serialization = new Serialization();
        serialization.serialize(IPhones);

        Deserialization deserialization = new Deserialization();
        ArrayList<Iphone> loaded = deserialization.deserialize();
        loaded.sort(new IPhonesNameSorter());
        Date time_to_compare = new Date(System.currentTimeMillis());
        System.out.println(iphone_clean.get_iphone_by_surname(loaded, "Ivanov"));
        System.out.println(iphone_clean.get_iphone_by_surname(loaded, "Popov"));
        System.out.println(iphone_clean.get_iphone_by_surname(loaded, "Petrov"));
        System.out.println(iphone_clean.get_iphone_by_surname(loaded, "Sidorov"));
        System.out.println(iphone_clean.get_iphone_by_time_between_city_talk(loaded, Weekday.Thursday, time_to_compare));
        System.out.println(iphone_clean.get_iphone_by_time_between_city_talk(loaded, Weekday.Tuesday, time_to_compare));

        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter( "output.txt", true));
            for (Iphone iphone :loaded) {
                writer.write(iphone.toString()+"\n");
            }
            writer.close();

        }
        catch ( IOException e)
        {
            System.out.println(valueOf(e));
        }
    }
}