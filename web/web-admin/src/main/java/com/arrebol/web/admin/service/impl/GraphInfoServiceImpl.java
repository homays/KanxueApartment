package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.GraphInfo;
import com.arrebol.web.admin.service.GraphInfoService;
import com.arrebol.web.admin.mapper.GraphInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【graph_info(图片信息表)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo>
    implements GraphInfoService{

}




