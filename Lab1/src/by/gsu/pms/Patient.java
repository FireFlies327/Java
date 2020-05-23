package by.gsu.pms;

public class Patient implements Comparable<Patient> {
    private String surname;
    private int age;
    private Gender gender;

    public Patient(String surname, int age, Gender gender) {
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Patient() {
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println("Фамилия = " + surname);
        System.out.println("Возраст = " + age);
        System.out.println("Пол = " + gender);
    }

    public String toString() {
        return surname + ";" + age + ";" + gender;
    }

    public int compareTo(Patient person) {
        return Integer.compare(this.age, person.age);
    }
}