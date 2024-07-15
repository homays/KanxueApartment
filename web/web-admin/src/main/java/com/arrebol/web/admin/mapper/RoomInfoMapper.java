package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.RoomInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.RoomInfo
*/
@Mapper
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

}




