package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.ApartmentLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.ApartmentLabel
*/
@Mapper
public interface ApartmentLabelMapper extends BaseMapper<ApartmentLabel> {

}




