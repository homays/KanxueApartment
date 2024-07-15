package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.FeeKey;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.FeeKey
*/
@Mapper
public interface FeeKeyMapper extends BaseMapper<FeeKey> {

}




