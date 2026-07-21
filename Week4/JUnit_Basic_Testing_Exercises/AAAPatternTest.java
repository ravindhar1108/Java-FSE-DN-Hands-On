import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AAAPatternTest {
    
    // Test Fixture
    private List<String> shoppingCart;

    // Setup Method
    @BeforeEach
    public void setUp() {
        shoppingCart = new ArrayList<>();
        System.out.println("Setup: Shopping cart initialized.");
    }

    // Teardown Method
    @AfterEach
    public void tearDown() {
        shoppingCart.clear();
        System.out.println("Teardown: Shopping cart cleared.");
    }

    @Test
    public void testAddItemToCart() {
        // Exercise 4: Arrange-Act-Assert (AAA) Pattern Example
        
        // Arrange
        String item = "Laptop";
        
        // Act
        shoppingCart.add(item);
        
        // Assert
        assertEquals(1, shoppingCart.size(), "Shopping cart should have 1 item");
        assertEquals("Laptop", shoppingCart.get(0), "Item in cart should be 'Laptop'");
    }
}
