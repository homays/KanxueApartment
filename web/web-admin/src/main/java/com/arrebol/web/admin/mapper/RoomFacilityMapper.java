package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.RoomFacility;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【room_facility(房间&配套关联表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.RoomFacility
*/
@Mapper
public interface RoomFacilityMapper extends BaseMapper<RoomFacility> {

}




