package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.ApartmentFeeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【apartment_fee_value(公寓&杂费关联表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.ApartmentFeeValue
*/
@Mapper
public interface ApartmentFeeValueMapper extends BaseMapper<ApartmentFeeValue> {

}




