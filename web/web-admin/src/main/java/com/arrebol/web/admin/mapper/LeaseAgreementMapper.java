package com.arrebol.web.admin.mapper;

import com.arrebol.model.entity.LeaseAgreement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author arrebol
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
* @createDate 2024-07-15
* @Entity com.arrebol.model.LeaseAgreement
*/
@Mapper
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

}




