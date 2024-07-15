package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.BrowsingHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【browsing_history(浏览历史)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.BrowsingHistory
*/
@Mapper
public interface BrowsingHistoryMapper extends BaseMapper<BrowsingHistory> {

}




