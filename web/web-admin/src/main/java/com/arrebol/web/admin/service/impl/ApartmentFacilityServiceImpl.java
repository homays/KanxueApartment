package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.ApartmentFacility;
import com.arrebol.web.admin.service.ApartmentFacilityService;
import com.arrebol.web.admin.mapper.ApartmentFacilityMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService{

}




