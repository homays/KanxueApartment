package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【user_info(用户信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.UserInfo
*/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}




