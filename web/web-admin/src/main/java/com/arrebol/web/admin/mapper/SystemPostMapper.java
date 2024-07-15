package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.SystemPost;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【system_post(岗位信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.SystemPost
*/
@Mapper
public interface SystemPostMapper extends BaseMapper<SystemPost> {

}




