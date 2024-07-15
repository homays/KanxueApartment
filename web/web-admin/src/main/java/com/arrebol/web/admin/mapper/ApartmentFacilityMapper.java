package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.ApartmentFacility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.ApartmentFacility
*/
@Mapper
public interface ApartmentFacilityMapper extends BaseMapper<ApartmentFacility> {

}



