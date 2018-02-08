/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.born.fcs.pm.dal.common.ProjectDataModifyCache;
import com.born.fcs.pm.dal.daointerface.ProjectDAO;
// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectDO;

/**
 * An ibatis based implementation of dao interface
 * <tt>com.born.fcs.pm.dal.daointerface.ProjectDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/project.xml</tt>). Modify the configuration
 * file according to your needs, then run <tt>specialmer-dalgen</tt> to generate
 * this file.
 *
 * @author peigen
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class IbatisProjectDAO extends SqlMapClientDaoSupport implements ProjectDAO {
	/**
	 * Insert one <tt>ProjectDO</tt> object to DB table <tt>project</tt>, return
	 * primary key
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>insert into project(project_id,project_code,project_name,customer_id,customer_name,customer_type,busi_type,busi_type_name,busi_sub_type,busi_sub_type_name,industry_code,industry_name,loan_purpose,time_limit,time_unit,start_time,end_time,amount,accumulated_issue_amount,loaned_amount,used_amount,repayed_amount,charged_amount,refund_amount,is_maximum_amount,released_amount,releasable_amount,releasing_amount,customer_deposit_amount,self_deposit_amount,comp_principal_amount,comp_interest_amount,contract_no,contract_time,contract_amount,sp_id,sp_code,is_approval,is_approval_del,approval_time,busi_manager_id,busi_manager_account,busi_manager_name,busi_managerb_id,busi_managerb_account,busi_managerb_name,dept_id,dept_code,dept_name,dept_path,dept_path_name,belong_to_nc,phases,phases_status,status,is_continue,is_recouncil,last_recouncil_time,is_court_ruling,court_ruling_time,reinsurance_ratio,reinsurance_amount,regulator_approval_amount,is_redo,is_redo_project,redo_from,redo_risk_handle_id,right_voucher_exten_date,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 * @param project
	 * @return long
	 * @throws DataAccessException
	 */
	public long insert(ProjectDO project) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		
		getSqlMapClientTemplate().insert("MS-PROJECT-INSERT", project);
		ProjectDataModifyCache.addModify(project.getProjectCode(), project);
		return project.getProjectId();
	}
	
	/**
	 * Update DB table <tt>project</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>update project set project_code=?, project_name=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, busi_sub_type=?, busi_sub_type_name=?, industry_code=?, industry_name=?, loan_purpose=?, time_limit=?, time_unit=?, start_time=?, end_time=?, amount=?, accumulated_issue_amount=?, loaned_amount=?, used_amount=?, repayed_amount=?, charged_amount=?, refund_amount=?, is_maximum_amount=?, released_amount=?, releasable_amount=?, releasing_amount=?, customer_deposit_amount=?, self_deposit_amount=?, comp_principal_amount=?, comp_interest_amount=?, contract_no=?, contract_time=?, contract_amount=?, sp_id=?, sp_code=?, is_approval=?, is_approval_del=?, approval_time=?, busi_manager_id=?, busi_manager_account=?, busi_manager_name=?, busi_managerb_id=?, busi_managerb_account=?, busi_managerb_name=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, belong_to_nc=?, phases=?, phases_status=?, status=?, is_continue=?, is_recouncil=?, last_recouncil_time=?, is_court_ruling=?, court_ruling_time=?, reinsurance_ratio=?, reinsurance_amount=?, regulator_approval_amount=?, is_redo=?, is_redo_project=?, redo_from=?, redo_risk_handle_id=?, right_voucher_exten_date=? where (project_id = ?)</tt>
	 *
	 * @param project
	 * @return int
	 * @throws DataAccessException
	 */
	public int update(ProjectDO project) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		ProjectDataModifyCache.addModify(project.getProjectCode(), project);
		
		return getSqlMapClientTemplate().update("MS-PROJECT-UPDATE", project);
	}
	
	/**
	 * Update DB table <tt>project</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>update project set project_name=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, busi_sub_type=?, busi_sub_type_name=?, industry_code=?, industry_name=?, loan_purpose=?, time_limit=?, time_unit=?, start_time=?, end_time=?, amount=?, accumulated_issue_amount=?, loaned_amount=?, used_amount=?, repayed_amount=?, charged_amount=?, refund_amount=?, is_maximum_amount=?, released_amount=?, releasable_amount=?, releasing_amount=?, customer_deposit_amount=?, self_deposit_amount=?, comp_principal_amount=?, comp_interest_amount=?, contract_no=?, contract_time=?, contract_amount=?, sp_id=?, sp_code=?, is_approval=?, is_approval_del=?, approval_time=?, busi_manager_id=?, busi_manager_account=?, busi_manager_name=?, busi_managerb_id=?, busi_managerb_account=?, busi_managerb_name=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, belong_to_nc=?, phases=?, phases_status=?, status=?, is_continue=?, is_recouncil=?, last_recouncil_time=?, is_court_ruling=?, court_ruling_time=?, reinsurance_ratio=?, reinsurance_amount=?, regulator_approval_amount=?, is_redo=?, is_redo_project=?, redo_from=?, redo_risk_handle_id=?, right_voucher_exten_date=? where (project_code = ?)</tt>
	 *
	 * @param project
	 * @return int
	 * @throws DataAccessException
	 */
	public int updateByProjectCode(ProjectDO project) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		ProjectDataModifyCache.addModify(project.getProjectCode(), project);
		
		return getSqlMapClientTemplate().update("MS-PROJECT-UPDATE-BY-PROJECT-CODE", project);
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (project_id = ?)</tt>
	 *
	 * @param projectId
	 * @return ProjectDO
	 * @throws DataAccessException
	 */
	public ProjectDO findById(long projectId) throws DataAccessException {
		Long param = new Long(projectId);
		
		return (ProjectDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FIND-BY-ID", param);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (project_id = ?) for update</tt>
	 *
	 * @param projectId
	 * @return ProjectDO
	 * @throws DataAccessException
	 */
	public ProjectDO findByIdForUpdate(long projectId) throws DataAccessException {
		Long param = new Long(projectId);
		
		return (ProjectDO) getSqlMapClientTemplate().queryForObject(
			"MS-PROJECT-FIND-BY-ID-FOR-UPDATE", param);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (project_code = ?)</tt>
	 *
	 * @param projectCode
	 * @return ProjectDO
	 * @throws DataAccessException
	 */
	public ProjectDO findByProjectCode(String projectCode) throws DataAccessException {
		
		return (ProjectDO) getSqlMapClientTemplate().queryForObject(
			"MS-PROJECT-FIND-BY-PROJECT-CODE", projectCode);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (project_code = ?) for update</tt>
	 *
	 * @param projectCode
	 * @return ProjectDO
	 * @throws DataAccessException
	 */
	public ProjectDO findByProjectCodeForUpdate(String projectCode) throws DataAccessException {
		
		return (ProjectDO) getSqlMapClientTemplate().queryForObject(
			"MS-PROJECT-FIND-BY-PROJECT-CODE-FOR-UPDATE", projectCode);
		
	}
	
	/**
	 * Delete records from DB table <tt>project</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>delete from project where (project_id = ?)</tt>
	 *
	 * @param projectId
	 * @return int
	 * @throws DataAccessException
	 */
	public int deleteById(long projectId) throws DataAccessException {
		Long param = new Long(projectId);
		
		return getSqlMapClientTemplate().delete("MS-PROJECT-DELETE-BY-ID", param);
	}
	
	/**
	 * Delete records from DB table <tt>project</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>delete from project where (project_code = ?)</tt>
	 *
	 * @param projectCode
	 * @return int
	 * @throws DataAccessException
	 */
	public int deleteByProjectCode(String projectCode) throws DataAccessException {
		
		return getSqlMapClientTemplate().delete("MS-PROJECT-DELETE-BY-PROJECT-CODE", projectCode);
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (1 = 1)</tt>
	 *
	 * @param project
	 * @param projectCodeOrName
	 * @param loginUserId
	 * @param hasLoanAmount
	 * @param hasUseAmount
	 * @param hasBothAmount
	 * @param hasChargeAmount
	 * @param hasIssueAmount
	 * @param hasCompensatoryAmount
	 * @param dockFormType
	 * @param isReleasing
	 * @param busiTypeList
	 * @param deptIdList
	 * @param phases
	 * @param phasesStatus
	 * @param status
	 * @param approvalTimeStart
	 * @param approvalTimeEnd
	 * @param hasContract
	 * @param contractTimeStart
	 * @param contractTimeEnd
	 * @param recoverySelecterId
	 * @param relatedRoleList
	 * @param hasCourtRuling
	 * @param isHisProject
	 * @param riskManager
	 * @param sortCol
	 * @param sortOrder
	 * @param limitStart
	 * @param pageSize
	 * @return List<ProjectDO>
	 * @throws DataAccessException
	 */
	public List<ProjectDO> findByCondition(ProjectDO project, String projectCodeOrName,
											long loginUserId, String hasLoanAmount,
											String hasUseAmount, String hasBothAmount,
											String hasChargeAmount, String hasIssueAmount,
											String hasCompensatoryAmount, String dockFormType,
											String isReleasing, List busiTypeList, List deptIdList,
											List phases, List phasesStatus, List status,
											Date approvalTimeStart, Date approvalTimeEnd,
											String hasContract, Date contractTimeStart,
											Date contractTimeEnd, String recoverySelecterId,
											List relatedRoleList, String hasCourtRuling,
											String isHisProject, String riskManager,
											String sortCol, String sortOrder, long limitStart,
											long pageSize) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("project", project);
		param.put("projectCodeOrName", projectCodeOrName);
		param.put("loginUserId", new Long(loginUserId));
		param.put("hasLoanAmount", hasLoanAmount);
		param.put("hasUseAmount", hasUseAmount);
		param.put("hasBothAmount", hasBothAmount);
		param.put("hasChargeAmount", hasChargeAmount);
		param.put("hasIssueAmount", hasIssueAmount);
		param.put("hasCompensatoryAmount", hasCompensatoryAmount);
		param.put("dockFormType", dockFormType);
		param.put("isReleasing", isReleasing);
		param.put("busiTypeList", busiTypeList);
		param.put("deptIdList", deptIdList);
		param.put("phases", phases);
		param.put("phasesStatus", phasesStatus);
		param.put("status", status);
		param.put("approvalTimeStart", approvalTimeStart);
		param.put("approvalTimeEnd", approvalTimeEnd);
		param.put("hasContract", hasContract);
		param.put("contractTimeStart", contractTimeStart);
		param.put("contractTimeEnd", contractTimeEnd);
		param.put("recoverySelecterId", recoverySelecterId);
		param.put("relatedRoleList", relatedRoleList);
		param.put("hasCourtRuling", hasCourtRuling);
		param.put("isHisProject", isHisProject);
		param.put("riskManager", riskManager);
		param.put("sortCol", sortCol);
		param.put("sortOrder", sortOrder);
		param.put("limitStart", new Long(limitStart));
		param.put("pageSize", new Long(pageSize));
		
		return getSqlMapClientTemplate().queryForList("MS-PROJECT-FIND-BY-CONDITION", param);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select COUNT(*) from project where (1 = 1)</tt>
	 *
	 * @param project
	 * @param projectCodeOrName
	 * @param loginUserId
	 * @param hasLoanAmount
	 * @param hasUseAmount
	 * @param hasBothAmount
	 * @param hasChargeAmount
	 * @param hasIssueAmount
	 * @param hasCompensatoryAmount
	 * @param dockFormType
	 * @param isReleasing
	 * @param busiTypeList
	 * @param deptIdList
	 * @param phases
	 * @param phasesStatus
	 * @param status
	 * @param approvalTimeStart
	 * @param approvalTimeEnd
	 * @param hasContract
	 * @param contractTimeStart
	 * @param contractTimeEnd
	 * @param recoverySelecterId
	 * @param relatedRoleList
	 * @param hasCourtRuling
	 * @param isHisProject
	 * @param riskManager
	 * @return long
	 * @throws DataAccessException
	 */
	public long findByConditionCount(ProjectDO project, String projectCodeOrName, long loginUserId,
										String hasLoanAmount, String hasUseAmount,
										String hasBothAmount, String hasChargeAmount,
										String hasIssueAmount, String hasCompensatoryAmount,
										String dockFormType, String isReleasing, List busiTypeList,
										List deptIdList, List phases, List phasesStatus,
										List status, Date approvalTimeStart, Date approvalTimeEnd,
										String hasContract, Date contractTimeStart,
										Date contractTimeEnd, String recoverySelecterId,
										List relatedRoleList, String hasCourtRuling,
										String isHisProject, String riskManager)
																				throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("project", project);
		param.put("projectCodeOrName", projectCodeOrName);
		param.put("loginUserId", new Long(loginUserId));
		param.put("hasLoanAmount", hasLoanAmount);
		param.put("hasUseAmount", hasUseAmount);
		param.put("hasBothAmount", hasBothAmount);
		param.put("hasChargeAmount", hasChargeAmount);
		param.put("hasIssueAmount", hasIssueAmount);
		param.put("hasCompensatoryAmount", hasCompensatoryAmount);
		param.put("dockFormType", dockFormType);
		param.put("isReleasing", isReleasing);
		param.put("busiTypeList", busiTypeList);
		param.put("deptIdList", deptIdList);
		param.put("phases", phases);
		param.put("phasesStatus", phasesStatus);
		param.put("status", status);
		param.put("approvalTimeStart", approvalTimeStart);
		param.put("approvalTimeEnd", approvalTimeEnd);
		param.put("hasContract", hasContract);
		param.put("contractTimeStart", contractTimeStart);
		param.put("contractTimeEnd", contractTimeEnd);
		param.put("recoverySelecterId", recoverySelecterId);
		param.put("relatedRoleList", relatedRoleList);
		param.put("hasCourtRuling", hasCourtRuling);
		param.put("isHisProject", isHisProject);
		param.put("riskManager", riskManager);
		
		Long retObj = (Long) getSqlMapClientTemplate().queryForObject(
			"MS-PROJECT-FIND-BY-CONDITION-COUNT", param);
		
		if (retObj == null) {
			return 0;
		} else {
			return retObj.longValue();
		}
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (1 = 1)</tt>
	 *
	 * @return List<ProjectDO>
	 * @throws DataAccessException
	 */
	public List<ProjectDO> findCountGroupByPhases() throws DataAccessException {
		
		return getSqlMapClientTemplate()
			.queryForList("MS-PROJECT-FIND-COUNT-GROUP-BY-PHASES", null);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from project where (1 = 1)</tt>
	 *
	 * @param project
	 * @param updateTime
	 * @param limitStart
	 * @param pageSize
	 * @return List<ProjectDO>
	 * @throws DataAccessException
	 */
	public List<ProjectDO> findByAll(ProjectDO project, Date updateTime, long limitStart,
										long pageSize) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("project", project);
		param.put("updateTime", updateTime);
		param.put("limitStart", new Long(limitStart));
		param.put("pageSize", new Long(pageSize));
		
		return getSqlMapClientTemplate().queryForList("MS-PROJECT-FIND-BY-ALL", param);
		
	}
	
	/**
	 * Query DB table <tt>project</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select COUNT(*) from project where (1 = 1)</tt>
	 *
	 * @param project
	 * @param updateTime
	 * @return long
	 * @throws DataAccessException
	 */
	public long findByAllCount(ProjectDO project, Date updateTime) throws DataAccessException {
		if (project == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("project", project);
		param.put("updateTime", updateTime);
		
		Long retObj = (Long) getSqlMapClientTemplate().queryForObject(
			"MS-PROJECT-FIND-BY-ALL-COUNT", param);
		
		if (retObj == null) {
			return 0;
		} else {
			return retObj.longValue();
		}
		
	}
	
}