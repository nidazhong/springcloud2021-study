package prev.ndz.springcloud2021.openfeign.order80.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import prev.ndz.commons.entities.CommonResult;
import prev.ndz.commons.entities.Payment;

/**
 * FeignClient 注解的Value为被调用者服务的注册名称（ApplicationName）
 * FeignClient 注解在客户端，value值是提供者的服务注册名称
 */
@Component
@FeignClient(value = "PROVIDER-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
