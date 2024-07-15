package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【system_user(员工信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.SystemUser
*/
@Mapper
public interface SystemUserMapper extends BaseMapper<SystemUser> {

}




