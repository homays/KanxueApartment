package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.RoomLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.RoomLabel
*/
@Mapper
public interface RoomLabelMapper extends BaseMapper<RoomLabel> {

}




