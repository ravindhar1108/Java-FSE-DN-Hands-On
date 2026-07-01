import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderServiceTest {
    @Test
    public void testPlaceOrder() {
        OrderRepository mockRepository = mock(OrderRepository.class);
        OrderService orderService = new OrderService(mockRepository);

        orderService.placeOrder("Laptop", 1);

        verify(mockRepository).saveOrder("Laptop", 1);
    }
}
