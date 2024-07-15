package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.UserInfo;
import com.arrebol.web.admin.service.UserInfoService;
import com.arrebol.web.admin.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




