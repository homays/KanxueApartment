package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.AttrValue;
import com.arrebol.web.admin.service.AttrValueService;
import com.arrebol.web.admin.mapper.AttrValueMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue>
    implements AttrValueService{

}




