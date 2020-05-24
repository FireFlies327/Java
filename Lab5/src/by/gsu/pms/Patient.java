package by.gsu.pms;

import java.io.Serializable;

public class Patient implements Serializable {

    private int gender;
    private String surname;
    private int age;

    public Patient(int gender, String surname, int age) {
        if(gender < 0)
            throw new NegativeNumberException("Пол не может быть пустым"); // male=0, female=1
        if(age < 0)
            throw new NegativeNumberException("Возраст не может быть меньше 0");
        if(surname.equals("") || surname == null)
            throw new ExceptionEmptySurname("Фамилия не может быть пустой");

        this.gender = gender;
        this.surname = surname;
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Gender: "+ gender + ", Surname: " + surname + ", Age:  " + age + "\n";
    }
}
