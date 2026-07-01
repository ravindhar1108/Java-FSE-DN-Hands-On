import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.digitalnurture")
public class AppConfig {
    // Config class to enable component scanning for dependency injection
}
