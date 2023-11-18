import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PantryTest {

    @Test
    void testAddItemSuccess() {
        Pantry pantry = new Pantry();
        Item item = pantry.addItem("Rice", 5, "2023-12-31");
        assertEquals("Rice", item.getName());
        assertEquals(5, item.getQuantity());
        assertEquals("2023-12-31", item.getExpiryDate());
        assertEquals(1, pantry.getItems().size());
    }

    @Test
    void testAddItemNegativeQuantity() {
        Pantry pantry = new Pantry();
        assertThrows(IllegalArgumentException.class, () -> {
            pantry.addItem("Cereal", -2, "2023-10-15");
        });
        assertEquals(0, pantry.getItems().size());
    }

    @Test
    void testAddItemEmptyName() {
        Pantry pantry = new Pantry();
        assertThrows(IllegalArgumentException.class, () -> {
            pantry.addItem("", 3, "2023-10-15");
        });
        assertEquals(0, pantry.getItems().size());
    }
}
