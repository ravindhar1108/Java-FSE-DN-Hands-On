import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Exercise 5: Configuring the Spring IoC Container
    // We declare beans that the Spring IoC container will manage.

    @Bean
    public MessageService messageService() {
        return new MessageService("Hello from the Spring IoC Container!");
    }
}
