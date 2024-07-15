package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.RoomLabel;
import com.arrebol.web.admin.service.RoomLabelService;
import com.arrebol.web.admin.mapper.RoomLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService{

}




