package items;

public class Armor extends Item {
    private int armor;
    private String name;
    private double weight;

    public Armor(int armor, String name, double weight) {
        this.armor = armor;
        this.name = name;
        this.weight = weight;
    }
}
