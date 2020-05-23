package by.gsu.pms;

public class Material {
    private String title;
    private double density;

    public Material() {
    }

    public Material(String title, double density) {
        this.title = title;
        this.density = density;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public String toString() {
        return title + ";" + density;
    }
}