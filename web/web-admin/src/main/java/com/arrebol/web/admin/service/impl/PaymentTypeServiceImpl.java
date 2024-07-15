package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.PaymentType;
import com.arrebol.web.admin.service.PaymentTypeService;
import com.arrebol.web.admin.mapper.PaymentTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

}




