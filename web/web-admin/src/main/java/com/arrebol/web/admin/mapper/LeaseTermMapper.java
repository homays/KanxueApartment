package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.LeaseTerm;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【lease_term(租期)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.LeaseTerm
*/
@Mapper
public interface LeaseTermMapper extends BaseMapper<LeaseTerm> {

}




