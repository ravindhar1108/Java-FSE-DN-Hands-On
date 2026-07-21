import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExampleTest {

    @Test
    public void testDifferentAssertions() {
        // Exercise 3: Assertions in JUnit
        
        // 1. assertEquals
        String expectedMessage = "Hello World";
        String actualMessage = "Hello World";
        assertEquals(expectedMessage, actualMessage, "Strings should match exactly");

        // 2. assertTrue / assertFalse
        boolean condition = (5 > 3);
        assertTrue(condition, "Condition should be true");
        assertFalse(5 < 3, "Condition should be false");

        // 3. assertNull / assertNotNull
        Object nullObject = null;
        Object nonNullObject = new Object();
        assertNull(nullObject, "Object should be null");
        assertNotNull(nonNullObject, "Object should not be null");
        
        // 4. assertThrows
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        }, "Should throw ArithmeticException for division by zero");
    }
}
