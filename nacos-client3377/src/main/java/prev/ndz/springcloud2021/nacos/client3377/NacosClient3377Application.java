package prev.ndz.springcloud2021.nacos.client3377;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class NacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosClient3377Application.class, args);
    }
}
