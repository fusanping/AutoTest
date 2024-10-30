import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fusanping
 * @date 2024Äê10ÔÂ30ÈÕ 16:19
 */
@SpringBootApplication
@ComponentScan("com.course.server")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
