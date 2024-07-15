package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.RoomLeaseTerm;
import com.arrebol.web.admin.service.RoomLeaseTermService;
import com.arrebol.web.admin.mapper.RoomLeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm>
    implements RoomLeaseTermService{

}




