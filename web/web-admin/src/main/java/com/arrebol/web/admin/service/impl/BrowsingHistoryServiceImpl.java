package com.arrebol.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.arrebol.model.entity.BrowsingHistory;
import com.arrebol.web.admin.service.BrowsingHistoryService;
import com.arrebol.web.admin.mapper.BrowsingHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author arrebol
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service实现
* @createDate 2024-07-15
*/
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory>
    implements BrowsingHistoryService{

}




