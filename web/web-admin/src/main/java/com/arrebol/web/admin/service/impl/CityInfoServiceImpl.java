package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.CityInfo;
import com.arrebol.web.admin.service.CityInfoService;
import com.arrebol.web.admin.mapper.CityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【city_info】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo>
    implements CityInfoService{

}




