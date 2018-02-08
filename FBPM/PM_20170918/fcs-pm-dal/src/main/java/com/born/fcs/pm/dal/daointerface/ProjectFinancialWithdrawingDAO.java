/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectFinancialWithdrawingDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import com.yjf.common.lang.util.money.Money;

/**
 * A dao interface provides methods to access database table <tt>project_financial_withdrawing</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_financial_withdrawing.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectFinancialWithdrawingDAO {
	/**
	 *  Insert one <tt>ProjectFinancialWithdrawingDO</tt> object to DB table <tt>project_financial_withdrawing</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_financial_withdrawing(id,project_code,transfer_trade_id,product_id,product_name,withdraw_type,interest_rate,buy_date,expire_date,principal,transfer_to,withdrawing_interest,withdrawed_interest,total_interest,withdraw_date,withdraw_month,withdraw_day,withdraw_finish,year_day_num,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectFinancialWithdrawing
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectFinancialWithdrawingDO projectFinancialWithdrawing) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_financial_withdrawing</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_financial_withdrawing set project_code=?, transfer_trade_id=?, product_id=?, product_name=?, withdraw_type=?, interest_rate=?, buy_date=?, expire_date=?, principal=?, transfer_to=?, withdrawing_interest=?, withdrawed_interest=?, total_interest=?, withdraw_date=?, withdraw_month=?, withdraw_day=?, withdraw_finish=?, year_day_num=? where (id = ?)</tt>
	 *
	 *	@param projectFinancialWithdrawing
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectFinancialWithdrawingDO projectFinancialWithdrawing) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_withdrawing where ((project_code = ?) AND (withdraw_type = 'RECEIPT'))</tt>
	 *
	 *	@param projectCode
	 *	@return ProjectFinancialWithdrawingDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialWithdrawingDO findLatest(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_withdrawing where ((project_code = ?) AND (withdraw_month = ?) AND (withdraw_type = 'RECEIPT'))</tt>
	 *
	 *	@param projectCode
	 *	@param withdrawMonth
	 *	@return ProjectFinancialWithdrawingDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialWithdrawingDO findByProjectCodeAndMonth(String projectCode, String withdrawMonth) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_withdrawing where ((transfer_trade_id = ?) AND (withdraw_type = 'PAYMENT'))</tt>
	 *
	 *	@param transferTradeId
	 *	@return ProjectFinancialWithdrawingDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialWithdrawingDO findLatestTransfer(long transferTradeId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_withdrawing where ((transfer_trade_id = ?) AND (withdraw_month = ?) AND (withdraw_type = 'PAYMENT'))</tt>
	 *
	 *	@param transferTradeId
	 *	@param withdrawMonth
	 *	@return ProjectFinancialWithdrawingDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialWithdrawingDO findByTradeIdAndMonth(long transferTradeId, String withdrawMonth) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_financial_withdrawing</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_financial_withdrawing where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_withdrawing where (1 = 1)</tt>
	 *
	 *	@param projectFinancialWithdrawing
	 *	@param withdrawDateStart
	 *	@param withdrawDateEnd
	 *	@param withdrawMonthStart
	 *	@param withdrawMonthEnd
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectFinancialWithdrawingDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectFinancialWithdrawingDO> findByCondition(ProjectFinancialWithdrawingDO projectFinancialWithdrawing, Date withdrawDateStart, Date withdrawDateEnd, String withdrawMonthStart, String withdrawMonthEnd, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_financial_withdrawing where (1 = 1)</tt>
	 *
	 *	@param projectFinancialWithdrawing
	 *	@param withdrawDateStart
	 *	@param withdrawDateEnd
	 *	@param withdrawMonthStart
	 *	@param withdrawMonthEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectFinancialWithdrawingDO projectFinancialWithdrawing, Date withdrawDateStart, Date withdrawDateEnd, String withdrawMonthStart, String withdrawMonthEnd) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_withdrawing</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select sum(withdrawed_interest) from project_financial_withdrawing where (1 = 1)</tt>
	 *
	 *	@param projectFinancialWithdrawing
	 *	@param withdrawDateStart
	 *	@param withdrawDateEnd
	 *	@param withdrawMonthStart
	 *	@param withdrawMonthEnd
	 *	@return Money
	 *	@throws DataAccessException
	 */	 
    public Money findByConditionStatistics(ProjectFinancialWithdrawingDO projectFinancialWithdrawing, Date withdrawDateStart, Date withdrawDateEnd, String withdrawMonthStart, String withdrawMonthEnd) throws DataAccessException;

}