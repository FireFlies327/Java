package by.gsu.pms;

import java.io.Serializable;

public class Patient implements Serializable {
    private String surname;
    private int age;
    private Gender gender;

    public Patient() {
    }

    public Patient(String surname, int age, Gender gender) {
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Patient(String surname, int age, int gender) {
        this(surname, age, Gender.values()[gender]);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String toString() {
        return surname + ";" + age + ";" + gender;
    }
}