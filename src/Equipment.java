import items.Backpack;
import items.Item;

public class Equipment {
    private Item armor;
    private Item legs;
    private Item boots;
    private Item weapon;
    private Item shield;
    private Item helmet;
    private Item amulet;
    private Item ring;
    private Backpack backpack;

    public Equipment() {
        this.backpack = new Backpack();
    }
}
