package com.born.fcs.pm.biz.service.contract;

import java.util.Date;
import java.util.List;

import com.born.fcs.pm.biz.service.base.BaseAutowiredDomainService;
import com.born.fcs.pm.dal.dataobject.ContractTemplateDO;
import com.born.fcs.pm.ws.enums.ContractTemplateTypeEnum;
import com.born.fcs.pm.ws.enums.LetterTypeEnum;
import com.born.fcs.pm.ws.enums.StampPhaseEnum;
import com.born.fcs.pm.ws.enums.TemplateTypeEnum;
import com.born.fcs.pm.ws.info.contract.ContractTemplateInfo;
import com.born.fcs.pm.ws.order.contract.ContractTemplateOrder;
import com.born.fcs.pm.ws.order.contract.ContractTemplateQueryOrder;
import com.born.fcs.pm.ws.result.base.FcsBaseResult;
import com.born.fcs.pm.ws.service.contract.ContractTemplateService;
import org.springframework.stereotype.Service;


import com.born.fcs.pm.biz.convert.UnBoxingConverter;
import com.born.fcs.pm.biz.exception.ExceptionFactory;
import com.born.fcs.pm.domain.context.FcsPmDomainHolder;
import com.born.fcs.pm.util.DateUtil;
import com.born.fcs.pm.ws.base.PageComponent;
import com.born.fcs.pm.ws.enums.base.FcsResultEnum;
import com.born.fcs.pm.ws.result.base.FormBaseResult;
import com.born.fcs.pm.ws.result.base.QueryBaseBatchResult;
import com.yjf.common.domain.api.Domain;
import com.yjf.common.lang.beans.cglib.BeanCopier;
import com.yjf.common.service.base.BeforeProcessInvokeService;
import rop.thirdparty.com.google.common.collect.Lists;

@Service("contractTemplateService")
public class ContractTemplateServiceImpl extends BaseAutowiredDomainService implements
		ContractTemplateService {

	private ContractTemplateInfo convertDO2Info(ContractTemplateDO DO) {
		if (DO == null)
			return null;
		ContractTemplateInfo info = new ContractTemplateInfo();
		BeanCopier.staticCopy(DO, info);
		info.setContractType(ContractTemplateTypeEnum.getByCode(DO.getContractType()));
		info.setStampPhase(StampPhaseEnum.getByCode(DO.getStampPhase()));
		info.setTemplateType(TemplateTypeEnum.getByCode(DO.getTemplateType()));
		info.setLetterType(LetterTypeEnum.getByCode(DO.getLetterType()));
		return info;
	}

	@Override
	protected FormBaseResult createResult() {
		return new FormBaseResult();
	}

	@Override
	public ContractTemplateInfo findById(long tempalteId) {
		ContractTemplateInfo info = null;
		if (tempalteId > 0) {
			ContractTemplateDO DO = contractTemplateDAO.findById(tempalteId);
			info = convertDO2Info(DO);
		}
		return info;
	}

	@Override
	public FcsBaseResult save(final ContractTemplateOrder order) {
		return commonProcess(order, "保存合同模板", new BeforeProcessInvokeService() {

			@SuppressWarnings("deprecation")
			@Override
			public Domain before() {
				ContractTemplateDO contract = null;
				final Date now = FcsPmDomainHolder.get().getSysDate();
				if (order.getTemplateId() != null && order.getTemplateId() > 0) {
					contract = contractTemplateDAO.findById(order.getTemplateId());
					if (contract == null) {
						throw ExceptionFactory
								.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "合同模板不存在");
					}
				}

				if (contract == null) { //新增
					contract = new ContractTemplateDO();
					BeanCopier.staticCopy(order, contract, UnBoxingConverter.getInstance());
					contract.setRawAddTime(now);
					if(order.getCheckStatus().equals("0")){
					contract.setStatus("TEMPORARY");
					}else{
					contract.setStatus("IN_USE");
					}
					contractTemplateDAO.insert(contract);
				} else { //修改
					BeanCopier.staticCopy(order, contract, UnBoxingConverter.getInstance());
					if(order.getCheckStatus().equals("0")){
						contract.setStatus("TEMPORARY");
					}else{
						contract.setStatus("IN_USE");
					}
					contractTemplateDAO.update(contract);

				}

				return null;
			}
		}, null, null);

	}

	@Override
	public QueryBaseBatchResult<ContractTemplateInfo> query(ContractTemplateQueryOrder order) {
		QueryBaseBatchResult<ContractTemplateInfo> baseBatchResult = new QueryBaseBatchResult<ContractTemplateInfo>();

		ContractTemplateDO queryCondition = new ContractTemplateDO();
		Date opTimeStart = null;
		Date opTimeEnd = null;
		if (order != null)
			BeanCopier.staticCopy(order, queryCondition);

		if (order.getName() != null)
			queryCondition.setName(order.getName());
		if (order.getBusiType() != null)
			queryCondition.setBusiType(order.getBusiType());
		if (order.getContractType() != null)
			queryCondition.setContractType(order.getContractType());
		if (order.getCreditConditionType() != null)
			queryCondition.setCreditConditionType(order.getCreditConditionType());
		if (order.getPledgeType() != null)
			queryCondition.setPledgeType(order.getPledgeType());
		if (order.getStatus() != null)
			queryCondition.setStatus(order.getStatus());
		if (order.getOperateDate() != null) {
			opTimeStart = DateUtil.getStartTimeOfTheDate(order.getOperateDate());
			opTimeEnd = DateUtil.getEndTimeOfTheDate(order.getOperateDate());
		}
//		if("IS".equals(order.getIsChooseNull())){
//			queryCondition.setNeedNullBusiType("IS");
//		}
		if (order.getIsMain() != null) {
			queryCondition.setIsMain(order.getIsMain());
		}
		if(order.getTemplateType()!=null){
			queryCondition.setTemplateType(order.getTemplateType().code());
		}else{
			queryCondition.setTemplateType(TemplateTypeEnum.CONTRACT.code());
		}
		if(order.getLetterType()!=null){
			queryCondition.setLetterType(order.getLetterType().code());
		}
//		if(order.getBusiTypeList()!=null&&order.getBusiTypeList().size()>0){
//			queryCondition.setBusiTypeList(order.getBusiTypeList());
//		}

		long totalSize = contractTemplateDAO.findByConditionCount(queryCondition,order.getIsChooseNull(),order.getNeedNullPledgeType(),order.getBusiTypeList(),order.getConditionTypeList(),order.getIsGetTemplates(),order.getNotGuarantor());

		PageComponent component = new PageComponent(order, totalSize);

		List<ContractTemplateDO> pageList = contractTemplateDAO.findByCondition(queryCondition,
				component.getFirstRecord(), component.getPageSize(),order.getSortCol(),order.getSortOrder(),order.getIsChooseNull(),order.getNeedNullPledgeType(),order.getBusiTypeList(),order.getConditionTypeList(),order.getIsGetTemplates(),order.getNotGuarantor());

		List<ContractTemplateInfo> list = baseBatchResult.getPageList();
		if (totalSize > 0) {
			for (ContractTemplateDO contract : pageList) {
				list.add(convertDO2Info(contract));
			}
		}

		baseBatchResult.initPageParam(component);
		baseBatchResult.setPageList(list);
		baseBatchResult.setSuccess(true);
		return baseBatchResult;
	}

	@Override
	public FcsBaseResult deleteById(final ContractTemplateOrder order) {
		return commonProcess(order, "删除合同模板", new BeforeProcessInvokeService() {
			@Override
			public Domain before() {
				if (order.getTemplateId() <= 0) {
					throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "未找到合同模板");
				} else {
					contractTemplateDAO.deleteById(order.getTemplateId());
				}
				return null;
			}
		}, null, null);
	}

	@Override
	public List<ContractTemplateInfo> queryTemplates(String busiType) {
		List<ContractTemplateDO> pageList = contractTemplateDAO.findTemplates(busiType);
		List<ContractTemplateInfo> list = Lists.newArrayList();
		if (pageList.size() > 0) {
			for (ContractTemplateDO contract : pageList) {
				list.add(convertDO2Info(contract));
			}
		}
		return list;
	}
}
