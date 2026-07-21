import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Exercise 5: Configuring the Spring IoC Container
        // Here we initialize the Spring IoC container using the AppConfig class
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the bean from the IoC container
        MessageService messageService = context.getBean(MessageService.class);
        
        // Use the bean
        messageService.printMessage();
    }
}
