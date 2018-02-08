/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryDebtorReorganizationAmountDetailDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryDebtorReorganizationAmountDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryDebtorReorganizationAmountDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_debtor_reorganization_amount_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectRecoveryDebtorReorganizationAmountDetailDAO extends SqlMapClientDaoSupport implements ProjectRecoveryDebtorReorganizationAmountDetailDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryDebtorReorganizationAmountDetailDO</tt> object to DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_debtor_reorganization_amount_detail(project_recovery_id,project_recovery_debtor_reorganization_id,project_recovery_litigation_execute_id,project_recovery_type,recovery_amount,recovery_time,recovery_goods,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryDebtorReorganizationAmountDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryDebtorReorganizationAmountDetailDO projectRecoveryDebtorReorganizationAmountDetail) throws DataAccessException {
    	if (projectRecoveryDebtorReorganizationAmountDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-INSERT", projectRecoveryDebtorReorganizationAmountDetail);

        return projectRecoveryDebtorReorganizationAmountDetail.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_debtor_reorganization_amount_detail set project_recovery_id=?, project_recovery_debtor_reorganization_id=?, project_recovery_litigation_execute_id=?, project_recovery_type=?, recovery_amount=?, recovery_time=?, recovery_goods=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryDebtorReorganizationAmountDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryDebtorReorganizationAmountDetailDO projectRecoveryDebtorReorganizationAmountDetail) throws DataAccessException {
    	if (projectRecoveryDebtorReorganizationAmountDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-UPDATE", projectRecoveryDebtorReorganizationAmountDetail);
    }

	/**
	 *  Query DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_debtor_reorganization_amount_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryDebtorReorganizationAmountDetailDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryDebtorReorganizationAmountDetailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryDebtorReorganizationAmountDetailDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_debtor_reorganization_amount_detail where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryDebtorReorganizationAmountDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryDebtorReorganizationAmountDetailDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-FIND-BY-RECOVERY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_debtor_reorganization_amount_detail where ((project_recovery_id = ?) AND (project_recovery_type = ?))</tt>
	 *
	 *	@param projectRecoveryId
	 *	@param projectRecoveryType
	 *	@return List<ProjectRecoveryDebtorReorganizationAmountDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryDebtorReorganizationAmountDetailDO> findByRecoveryIdAndType(long projectRecoveryId, String projectRecoveryType) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectRecoveryId", new Long(projectRecoveryId));
        param.put("projectRecoveryType", projectRecoveryType);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-FIND-BY-RECOVERY-ID-AND-TYPE", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_debtor_reorganization_amount_detail where (project_recovery_debtor_reorganization_id = ?)</tt>
	 *
	 *	@param projectRecoveryDebtorReorganizationId
	 *	@return List<ProjectRecoveryDebtorReorganizationAmountDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryDebtorReorganizationAmountDetailDO> findByDebtorReorganizationId(long projectRecoveryDebtorReorganizationId) throws DataAccessException {
        Long param = new Long(projectRecoveryDebtorReorganizationId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-FIND-BY-DEBTOR-REORGANIZATION-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_debtor_reorganization_amount_detail where (project_recovery_litigation_execute_id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationExecuteId
	 *	@return List<ProjectRecoveryDebtorReorganizationAmountDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryDebtorReorganizationAmountDetailDO> findByLitigationExecuteId(long projectRecoveryLitigationExecuteId) throws DataAccessException {
        Long param = new Long(projectRecoveryLitigationExecuteId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-FIND-BY-LITIGATION-EXECUTE-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_debtor_reorganization_amount_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_debtor_reorganization_amount_detail where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-DELETE-BY-RECOVERY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_debtor_reorganization_amount_detail where ((project_recovery_id = ?) AND (project_recovery_type = ?))</tt>
	 *
	 *	@param projectRecoveryId
	 *	@param projectRecoveryType
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryIdAndType(long projectRecoveryId, String projectRecoveryType) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectRecoveryId", new Long(projectRecoveryId));
        param.put("projectRecoveryType", projectRecoveryType);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-DELETE-BY-RECOVERY-ID-AND-TYPE", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_debtor_reorganization_amount_detail where (project_recovery_debtor_reorganization_id = ?)</tt>
	 *
	 *	@param projectRecoveryDebtorReorganizationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByDebtorReorganizationId(long projectRecoveryDebtorReorganizationId) throws DataAccessException {
        Long param = new Long(projectRecoveryDebtorReorganizationId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-DELETE-BY-DEBTOR-REORGANIZATION-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_debtor_reorganization_amount_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_debtor_reorganization_amount_detail where (project_recovery_litigation_execute_id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationExecuteId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByLitigationExecuteId(long projectRecoveryLitigationExecuteId) throws DataAccessException {
        Long param = new Long(projectRecoveryLitigationExecuteId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DEBTOR-REORGANIZATION-AMOUNT-DETAIL-DELETE-BY-LITIGATION-EXECUTE-ID", param);
    }

}