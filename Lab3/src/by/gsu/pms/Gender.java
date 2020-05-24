package by.gsu.pms;

public enum Gender {
    male, female;

    public String toString() {
        return name().toLowerCase();
    }
}