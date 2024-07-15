package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.RoomLeaseTerm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.RoomLeaseTerm
*/
@Mapper
public interface RoomLeaseTermMapper extends BaseMapper<RoomLeaseTerm> {

}




