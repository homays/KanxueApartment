package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.GraphInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.GraphInfo
*/
@Mapper
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

}




