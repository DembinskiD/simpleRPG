package items;

import java.util.ArrayList;
import java.util.List;

public class Backpack extends Item {
    private Backpack parent;
    private List<Item> children;

    public Backpack() {
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public Backpack(Backpack withParent) {
        this.parent = withParent;
        this.children = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        this.children.add(item);
        return this.children.contains(item);
    }

    public void removeItem(Item item) {
        this.children.remove(item);
    }

    public List<Item> getContent() {
        return this.children;
    }

    public Backpack getParent() {
        return parent;
    }

    public void setParent(Backpack parent) {
        this.parent = parent;
    }
}
