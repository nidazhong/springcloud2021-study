package prev.ndz.springcloud2021.payment8001.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prev.ndz.springcloud2021.payment8001.dao.PaymentDao;
import prev.ndz.springcloud2021.payment8001.service.PaymentService;
import prev.ndz.commons.entities.Payment;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
