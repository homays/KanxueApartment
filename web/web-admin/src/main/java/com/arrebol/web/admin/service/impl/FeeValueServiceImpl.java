package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.FeeValue;
import com.arrebol.web.admin.service.FeeValueService;
import com.arrebol.web.admin.mapper.FeeValueMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue>
    implements FeeValueService{

}




