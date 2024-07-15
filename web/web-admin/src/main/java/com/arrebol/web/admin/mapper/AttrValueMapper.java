package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.AttrValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.AttrValue
*/
@Mapper
public interface AttrValueMapper extends BaseMapper<AttrValue> {

}




