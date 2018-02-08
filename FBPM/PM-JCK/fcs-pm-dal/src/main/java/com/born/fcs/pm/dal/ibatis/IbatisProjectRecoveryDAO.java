/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisProjectRecoveryDAO extends SqlMapClientDaoSupport implements ProjectRecoveryDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryDO</tt> object to DB table <tt>project_recovery</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery(project_code,recovery_amount,legal_manager_id,legal_manager_name,recovery_status,status_update_time,recovery_principal_amount,recovery_interest_amount,recovery_interest_penalty_amount,recovery_compensation_amount,recovery_other_amount,litigation_on,debtor_reorganization_on,estimate_lose_amount,apportion_lose_amount,lose_cognizance_amount,close_form_id,apply_user_id,apply_user_account,apply_user_name,apply_dept_id,apply_dept_code,apply_dept_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecovery
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryDO projectRecovery) throws DataAccessException {
    	if (projectRecovery == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-INSERT", projectRecovery);

        return projectRecovery.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery set project_code=?, recovery_amount=?, legal_manager_id=?, legal_manager_name=?, recovery_status=?, status_update_time=?, recovery_principal_amount=?, recovery_interest_amount=?, recovery_interest_penalty_amount=?, recovery_compensation_amount=?, recovery_other_amount=?, litigation_on=?, debtor_reorganization_on=?, estimate_lose_amount=?, apportion_lose_amount=?, lose_cognizance_amount=?, close_form_id=?, apply_user_id=?, apply_user_account=?, apply_user_name=?, apply_dept_id=?, apply_dept_code=?, apply_dept_name=? where (id = ?)</tt>
	 *
	 *	@param projectRecovery
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryDO projectRecovery) throws DataAccessException {
    	if (projectRecovery == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-UPDATE", projectRecovery);
    }

	/**
	 *  Query DB table <tt>project_recovery</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery where (close_form_id = ?)</tt>
	 *
	 *	@param closeFormId
	 *	@return ProjectRecoveryDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryDO findByFormId(long closeFormId) throws DataAccessException {
        Long param = new Long(closeFormId);

        return (ProjectRecoveryDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return ProjectRecoveryDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryDO findByProjectCode(String projectCode) throws DataAccessException {

        return (ProjectRecoveryDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-DELETE-BY-ID", param);
    }

}