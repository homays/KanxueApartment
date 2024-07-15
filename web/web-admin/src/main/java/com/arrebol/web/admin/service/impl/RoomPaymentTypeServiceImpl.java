package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.RoomPaymentType;
import com.arrebol.web.admin.service.RoomPaymentTypeService;
import com.arrebol.web.admin.mapper.RoomPaymentTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【room_payment_type(房间&支付方式关联表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class RoomPaymentTypeServiceImpl extends ServiceImpl<RoomPaymentTypeMapper, RoomPaymentType>
    implements RoomPaymentTypeService{

}




