import com.springboot.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

  @Bean
  User user() {
    User user = new User();
    user.setPassword("123");
    user.setUserName("vagish");
    return user;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
