package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.LabelInfo;
import com.arrebol.web.admin.service.LabelInfoService;
import com.arrebol.web.admin.mapper.LabelInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【label_info(标签信息表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo>
    implements LabelInfoService{

}




