package prev.ndz.springcloud2021.payment8001.service;

import prev.ndz.commons.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
