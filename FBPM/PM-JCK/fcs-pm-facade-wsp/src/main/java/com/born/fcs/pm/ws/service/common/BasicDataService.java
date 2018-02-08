package com.born.fcs.pm.ws.service.common;

import java.util.List;
import javax.jws.WebService;
import com.born.fcs.pm.ws.info.common.BusiTypeInfo;
import com.born.fcs.pm.ws.info.common.EnterpriseScaleRuleInfo;
import com.born.fcs.pm.ws.info.common.IndustryInfo;
import com.born.fcs.pm.ws.info.common.RegionInfo;
import com.born.fcs.pm.ws.order.common.BusiTypeQueryOrder;
import com.born.fcs.pm.ws.order.common.IndustryQueryOrder;
import com.born.fcs.pm.ws.order.common.RegionQueryOrder;
import com.born.fcs.pm.ws.result.base.QueryBaseBatchResult;

/**
 * 基础数据服务
 *
 * @author wuzj
 */
@WebService
public interface BasicDataService {
	
	/**
	 * 查询国民经济行业分类
	 * @param order
	 * @return
	 */
	QueryBaseBatchResult<IndustryInfo> queryIndustry(IndustryQueryOrder order);
	
	/**
	 * 查询行政区域划分
	 * @param order
	 * @return
	 */
	QueryBaseBatchResult<RegionInfo> queryRegion(RegionQueryOrder order);
	
	/**
	 * 查询业务类型
	 * @param order
	 * @return
	 */
	QueryBaseBatchResult<BusiTypeInfo> queryBusiType(BusiTypeQueryOrder order);
	
	/**
	 * 查询业务类型
	 * @param code
	 * @param customerType
	 * @return
	 */
	BusiTypeInfo querySingleBusiType(String code, String customerType);
	
	/**
	 * 查询所有企业规模计算规则
	 * @return
	 */
	List<EnterpriseScaleRuleInfo> queryEnterpriseScaleRule();
	
}
