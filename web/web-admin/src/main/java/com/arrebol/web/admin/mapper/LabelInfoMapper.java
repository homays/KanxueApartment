package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.LabelInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.LabelInfo
*/
@Mapper
public interface LabelInfoMapper extends BaseMapper<LabelInfo> {

}




