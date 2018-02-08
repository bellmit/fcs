/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectContractDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_project_contract</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_contract.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FProjectContractDAO {
	/**
	 *  Insert one <tt>FProjectContractDO</tt> object to DB table <tt>f_project_contract</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_contract(contract_id,form_id,project_code,project_name,customer_id,customer_name,free_flow,apply_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectContract
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectContractDO FProjectContract) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_contract</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_contract set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, free_flow=? where (contract_id = ?)</tt>
	 *
	 *	@param FProjectContract
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectContractDO FProjectContract) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select contract_id, form_id, project_code, project_name, customer_id, customer_name, raw_add_time, free_flow, apply_type, raw_update_time from f_project_contract where (contract_id = ?)</tt>
	 *
	 *	@param contractId
	 *	@return FProjectContractDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractDO findById(long contractId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select contract_id, form_id, project_code, project_name, customer_id, customer_name, free_flow, apply_type, raw_add_time, raw_update_time from f_project_contract where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FProjectContractDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select contract_id, form_id, project_code, project_name, customer_id, customer_name, free_flow, apply_type, raw_add_time, raw_update_time from f_project_contract where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FProjectContractDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_contract</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_contract where (contract_id = ?)</tt>
	 *
	 *	@param contractId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long contractId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_contract</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_contract where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_project_contract</tt>
	 *
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findAllCount() throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_contract where (contract_id = ?)</tt>
	 *
	 *	@param FProjectContract
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FProjectContractDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectContractDO> findByCondition(FProjectContractDO FProjectContract, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_contract where (id = ?)</tt>
	 *
	 *	@param FProjectContract
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FProjectContractDO FProjectContract) throws DataAccessException;

}