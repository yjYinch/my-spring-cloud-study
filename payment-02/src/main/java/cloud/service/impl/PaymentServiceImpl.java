package cloud.service.impl;

import cloud.mapper.PaymentMapper;
import cloud.service.PaymentService;
import com.zyj.cloud.beans.PaymentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangyijun
 * @date: created in 16:59 2021/1/9
 * @description
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Integer insert(PaymentBean paymentBean) {
        return paymentMapper.insert(paymentBean);
    }

    @Override
    public List<PaymentBean> getPaymentByCondition(PaymentBean paymentBean) {
        return paymentMapper.getPaymentByCondition(paymentBean);
    }
}
