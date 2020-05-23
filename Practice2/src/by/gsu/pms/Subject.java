package by.gsu.pms;

public class Subject {
    private String title;
    private Material material;
    private double volume;

    public Subject() {
    }

    public Subject(String title, Material material, double volume) {
        this.title = title;
        this.material = material;
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public Material getMaterial() {
        return material;
    }

    public double getVolume() {
        return volume;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return material.getDensity() * volume;
    }

    public String toString() {
        return title + ";" + material + ";" + volume + ";";
    }
}