import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Exercise 1: Configuring a Basic Spring Application
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        MessageService messageService = context.getBean(MessageService.class);
        System.out.println(messageService.getMessage());
    }
}
