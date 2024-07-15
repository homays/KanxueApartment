package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.ApartmentInfo
*/
@Mapper
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

}




