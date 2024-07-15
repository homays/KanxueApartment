package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.ApartmentLabel;
import com.arrebol.web.admin.service.ApartmentLabelService;
import com.arrebol.web.admin.mapper.ApartmentLabelMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService{

}




