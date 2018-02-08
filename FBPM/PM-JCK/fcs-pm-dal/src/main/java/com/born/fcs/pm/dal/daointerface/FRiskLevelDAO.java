/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRiskLevelDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_risk_level</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_risk_level.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FRiskLevelDAO {
	/**
	 *  Insert one <tt>FRiskLevelDO</tt> object to DB table <tt>f_risk_level</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_risk_level(form_id,project_code,project_name,customer_id,customer_name,busi_type,busi_type_name,credit_amount,evaluation,evaluation_level,reevaluation_id,reevaluation_account,reevaluation_name,reevaluation,reevaluation_level,enterprise_type,project_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FRiskLevel
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FRiskLevelDO FRiskLevel) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_risk_level</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_risk_level set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, credit_amount=?, evaluation=?, evaluation_level=?, reevaluation_id=?, reevaluation_account=?, reevaluation_name=?, reevaluation=?, reevaluation_level=?, enterprise_type=?, project_type=? where (id = ?)</tt>
	 *
	 *	@param FRiskLevel
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FRiskLevelDO FRiskLevel) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_risk_level</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_risk_level set project_code=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, credit_amount=?, evaluation=?, evaluation_level=?, reevaluation_id=?, reevaluation_account=?, reevaluation_name=?, reevaluation=?, reevaluation_level=?, enterprise_type=?, project_type=? where (form_id = ?)</tt>
	 *
	 *	@param FRiskLevel
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FRiskLevelDO FRiskLevel) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_risk_level</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_level where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FRiskLevelDO
	 *	@throws DataAccessException
	 */	 
    public FRiskLevelDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_risk_level</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_level where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FRiskLevelDO
	 *	@throws DataAccessException
	 */	 
    public FRiskLevelDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_risk_level</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_level where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FRiskLevelDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRiskLevelDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_risk_level</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_level where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_risk_level</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_level where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_risk_level</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_level where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}