/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectCreditMarginDO;
import org.springframework.dao.DataAccessException;
import com.yjf.common.lang.util.money.Money;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_credit_margin</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_credit_margin.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectCreditMarginDAO {
	/**
	 *  Insert one <tt>ProjectCreditMarginDO</tt> object to DB table <tt>project_credit_margin</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_credit_margin(confirm_id,credit_id,project_code,margin_amount,account_name,bank,account,period,period_unit,in_time,is_pledge,is_frozen,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectCreditMargin
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectCreditMarginDO projectCreditMargin) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_credit_margin</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_credit_margin set confirm_id=?, credit_id=?, project_code=?, margin_amount=?, account_name=?, bank=?, account=?, period=?, period_unit=?, in_time=?, is_pledge=?, is_frozen=? where (id = ?)</tt>
	 *
	 *	@param projectCreditMargin
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectCreditMarginDO projectCreditMargin) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_margin where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectCreditMarginDO
	 *	@throws DataAccessException
	 */	 
    public ProjectCreditMarginDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_margin where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return ProjectCreditMarginDO
	 *	@throws DataAccessException
	 */	 
    public ProjectCreditMarginDO findByConfirmId(long confirmId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select SUM(m.margin_amount) marginAmount from project_credit_margin m</tt>
	 *
	 *	@param projectCode
	 *	@return Money
	 *	@throws DataAccessException
	 */	 
    public Money findMarginAmountByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_margin where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<ProjectCreditMarginDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectCreditMarginDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_credit_margin</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_credit_margin where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_credit_margin</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_credit_margin where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByConfirmId(long confirmId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_margin where (1 = 1)</tt>
	 *
	 *	@param projectCreditMargin
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectCreditMarginDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectCreditMarginDO> findByCondition(ProjectCreditMarginDO projectCreditMargin, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_credit_margin</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_credit_margin where (1 = 1)</tt>
	 *
	 *	@param projectCreditMargin
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectCreditMarginDO projectCreditMargin) throws DataAccessException;

}