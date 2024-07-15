package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.LeaseTerm;
import com.arrebol.web.admin.service.LeaseTermService;
import com.arrebol.web.admin.mapper.LeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【lease_term(租期)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
    implements LeaseTermService{

}




