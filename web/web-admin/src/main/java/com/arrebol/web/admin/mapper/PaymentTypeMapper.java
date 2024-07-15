package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.PaymentType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author arrebol
 * @description 针对表【payment_type(支付方式表)】的数据库操作Mapper
 * @createDate 2024-07-15
 * @Entity com.arrebol.model.PaymentType
 */
@Mapper
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

}




