package prev.ndz.springcloud2021.openfeign.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignOrder80Application.class, args);
    }
}
