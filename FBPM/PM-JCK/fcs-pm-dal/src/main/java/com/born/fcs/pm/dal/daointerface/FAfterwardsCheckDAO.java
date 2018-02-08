/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_afterwards_check</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FAfterwardsCheckDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckDO</tt> object to DB table <tt>f_afterwards_check</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check(form_id,project_code,project_name,customer_id,customer_name,edition,check_date,check_address,round_year,round_time,is_lastest,amount,used_amount,repayed_amount,use_way,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, edition=?, check_date=?, check_address=?, round_year=?, round_time=?, is_lastest=?, amount=?, used_amount=?, repayed_amount=?, use_way=? where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set project_code=?, project_name=?, customer_id=?, customer_name=?, edition=?, check_date=?, check_address=?, round_year=?, round_time=?, is_lastest=?, amount=?, used_amount=?, repayed_amount=?, use_way=? where (form_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set is_lastest='NO' where ((is_lastest = 'YES') AND (project_code = ?))</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateIsLasetByProjectCode(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FAfterwardsCheckDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FAfterwardsCheckDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FAfterwardsCheckDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckDO> findByCondition(FAfterwardsCheckDO FAfterwardsCheck, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException;

}