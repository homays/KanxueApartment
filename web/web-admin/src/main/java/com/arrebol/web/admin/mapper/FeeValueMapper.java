package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.FeeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.FeeValue
*/
@Mapper
public interface FeeValueMapper extends BaseMapper<FeeValue> {

}




