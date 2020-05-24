package by.gsu.pms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Iphone implements Serializable {


    public Iphone() {
    }

    public String getDestination_point() {
        return surname;
    }

    private String surname;
    private String name;
    private String full_name;
    private String address;
    private Date between_city_talk;
    private Weekday weekday;

    public Iphone(String surname, String name, String full_name, String address, Date between_city_talk, Weekday weekday) {
        this.surname = surname;
        this.name = name;
        this.full_name = full_name;
        this.address = address;
        this.between_city_talk = between_city_talk;
        this.weekday = weekday;
    }

    public String toString() {
        return  "\nAirline{" +
                "surname='" + surname + '\'' +
                ", name=" + name +
                ", full_name=" + full_name +
                ", address=" + address +
                ", between_city_talk=" + between_city_talk +
                ", weekday=" + weekday + '}';
    }


    public ArrayList<Iphone> get_IPhones_by_day(ArrayList<Iphone> IPhones, Weekday current_weekday) {

        ArrayList<Iphone> IPhones_by_day = new ArrayList<>();
        for (Iphone iphone : IPhones) {
            if (iphone.weekday==current_weekday) {
                IPhones_by_day.add(iphone);
            }
        }
        return IPhones_by_day;
    }

    public ArrayList<Iphone> get_iphone_by_surname(ArrayList<Iphone> IPhones, String given_surname) {

        ArrayList<Iphone> iphone_by_surname = new ArrayList<>();
        for (Iphone iphone : IPhones) {
            if (iphone.surname.equals(given_surname)) {
                iphone_by_surname.add(iphone);
            }
        }
        return iphone_by_surname;
    }

    public ArrayList<Iphone> get_iphone_by_time_between_city_talk(ArrayList<Iphone> IPhones, Weekday current_weekday, Date current_time_of_between_city_talk) {

        ArrayList<Iphone> iphone_by_time_between_city_talk = new ArrayList<>();
        for (Iphone iphone : IPhones) {
            if (iphone.weekday==current_weekday &&
                    iphone.between_city_talk.compareTo(current_time_of_between_city_talk)>0 ) {
                iphone_by_time_between_city_talk.add(iphone);
            }
        }
        return iphone_by_time_between_city_talk;
    }
}