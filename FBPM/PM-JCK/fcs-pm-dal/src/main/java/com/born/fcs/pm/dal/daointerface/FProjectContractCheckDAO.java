/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectContractCheckDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_project_contract_check</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_contract_check.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FProjectContractCheckDAO {
	/**
	 *  Insert one <tt>FProjectContractCheckDO</tt> object to DB table <tt>f_project_contract_check</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_contract_check(id,contract_id,contract_item_id,user_id,user_name,file_url,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectContractCheck
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectContractCheckDO FProjectContractCheck) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_contract_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_contract_check set contract_id=?, contract_item_id=?, user_id=?, user_name=?, file_url=?, remark=? where (id = ?)</tt>
	 *
	 *	@param FProjectContractCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectContractCheckDO FProjectContractCheck) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, contract_id, contract_item_id, user_id, user_name, file_url, remark, raw_add_time, raw_update_time from f_project_contract_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectContractCheckDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractCheckDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, contract_id, contract_item_id, user_id, user_name, file_url, remark, raw_add_time, raw_update_time from f_project_contract_check where (contract_item_id = ?)</tt>
	 *
	 *	@param contractItemId
	 *	@return List<FProjectContractCheckDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectContractCheckDO> findByContractItemId(long contractItemId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, contract_id, contract_item_id, user_id, user_name, file_url, remark, raw_add_time, raw_update_time from f_project_contract_check where ((contract_item_id = ?) AND (user_id = ?))</tt>
	 *
	 *	@param contractItemId
	 *	@param userId
	 *	@return FProjectContractCheckDO
	 *	@throws DataAccessException
	 */	 
    public FProjectContractCheckDO findByContractItemIdAndUserId(long contractItemId, long userId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_contract_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_contract_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_contract_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_project_contract_check</tt>
	 *
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findAllCount() throws DataAccessException;

}