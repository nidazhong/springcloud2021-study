package prev.ndz.springcloud2021.order80.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import prev.ndz.springcloud2021.order80.myrule.MySelfRule;

/**
 * 配置负载均衡实现RestTemplate
 */
@Configuration
@LoadBalancerClient(name = "PROVIDER-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class ConfigBean {

    /**
     * 使用负载均衡注解
     * @return
     */
//    @LoadBalanced
//    @Bean
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }


    @LoadBalanced
    @Bean
    public RestOperations getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
