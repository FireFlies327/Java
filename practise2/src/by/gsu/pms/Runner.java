package by.gsu.pms;

public class Runner {

    public static void main(String[] args) {
        Material Steel = new Material("steel", 7850);
        Subject wire = new Subject("wire", Steel, 0.03);

        System.out.println("Стальной провод: " + wire + "\nМасса стального провода равна: " + wire.getMass() + " кг");

        Material Copper = new Material("copper", 8500);
        wire.setMaterial(Copper);
        System.out.println("Медный провод: " + wire + "\nМасса медного провода равна: " + wire.getMass() + " кг");
    }
}