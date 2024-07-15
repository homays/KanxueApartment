package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.ApartmentFeeValue;
import com.arrebol.web.admin.service.ApartmentFeeValueService;
import com.arrebol.web.admin.mapper.ApartmentFeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class ApartmentFeeValueServiceImpl extends ServiceImpl<ApartmentFeeValueMapper, ApartmentFeeValue>
    implements ApartmentFeeValueService{

}




