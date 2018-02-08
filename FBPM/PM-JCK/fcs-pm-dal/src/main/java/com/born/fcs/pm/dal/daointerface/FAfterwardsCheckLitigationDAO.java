/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckLitigationDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_afterwards_check_litigation</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_litigation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FAfterwardsCheckLitigationDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckLitigationDO</tt> object to DB table <tt>f_afterwards_check_litigation</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check_litigation(form_id,project_name,project_code,customer_id,customer_name,amount,co_institution_id,co_institution_name,co_institution_charge,co_institution_charge_type,guarantee_fee,guarantee_fee_type,busi_manager_name,risk_manager_name,assure_object,case_status,opening_date,judge_date,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheckLitigation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckLitigationDO FAfterwardsCheckLitigation) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check_litigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_litigation set form_id=?, project_name=?, project_code=?, customer_id=?, customer_name=?, amount=?, co_institution_id=?, co_institution_name=?, co_institution_charge=?, co_institution_charge_type=?, guarantee_fee=?, guarantee_fee_type=?, busi_manager_name=?, risk_manager_name=?, assure_object=?, case_status=?, opening_date=?, judge_date=?, remark=? where (litigation_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckLitigation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckLitigationDO FAfterwardsCheckLitigation) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check_litigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_litigation set project_name=?, project_code=?, customer_id=?, customer_name=?, amount=?, co_institution_id=?, co_institution_name=?, co_institution_charge=?, co_institution_charge_type=?, guarantee_fee=?, guarantee_fee_type=?, busi_manager_name=?, risk_manager_name=?, assure_object=?, case_status=?, opening_date=?, judge_date=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckLitigation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FAfterwardsCheckLitigationDO FAfterwardsCheckLitigation) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check_litigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_litigation where (litigation_id = ?)</tt>
	 *
	 *	@param litigationId
	 *	@return FAfterwardsCheckLitigationDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckLitigationDO findById(long litigationId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check_litigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_litigation where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FAfterwardsCheckLitigationDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckLitigationDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_litigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_litigation where (litigation_id = ?)</tt>
	 *
	 *	@param litigationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long litigationId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_litigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_litigation where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

}