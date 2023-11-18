import java.util.ArrayList;
import java.util.List;

public class Pantry {
    private List<Item> items;

    public Pantry() {
        this.items = new ArrayList<>();
    }

    public Item addItem(String name, int quantity, String expiryDate) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive integer");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }

        Item item = new Item(name, quantity, expiryDate);
        items.add(item);
        return item;
    }

    public List<Item> getItems() {
        return items;
    }
}
