package com.arrebol.web.admin.service.impl;

import com.arrebol.model.entity.SystemUser;
import com.arrebol.web.admin.mapper.SystemUserMapper;
import com.arrebol.web.admin.service.SystemUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author arrebol
 * @description 针对表【system_user(员工信息表)】的数据库操作Service实现
 * @createDate 2024-07-15
 */
@Service
public class SystemUserServiceImpl extends ServiceImpl<SystemUserMapper, SystemUser>
        implements SystemUserService {

}




