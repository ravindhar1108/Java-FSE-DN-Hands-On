public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(String item, int quantity) {
        orderRepository.saveOrder(item, quantity);
    }
}
