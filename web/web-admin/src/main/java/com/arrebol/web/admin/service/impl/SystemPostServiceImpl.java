package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.SystemPost;
import com.arrebol.web.admin.service.SystemPostService;
import com.arrebol.web.admin.mapper.SystemPostMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【system_post(岗位信息表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class SystemPostServiceImpl extends ServiceImpl<SystemPostMapper, SystemPost>
    implements SystemPostService{

}




