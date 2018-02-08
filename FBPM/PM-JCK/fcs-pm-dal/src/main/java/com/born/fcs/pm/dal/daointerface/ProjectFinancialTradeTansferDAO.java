/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectFinancialTradeTansferDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_financial_trade_tansfer</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_financial_trade_tansfer.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectFinancialTradeTansferDAO {
	/**
	 *  Insert one <tt>ProjectFinancialTradeTansferDO</tt> object to DB table <tt>project_financial_trade_tansfer</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_financial_trade_tansfer(trade_id,flow_no,project_code,apply_id,transfer_price,transfer_num,transfer_interest,transfer_time,is_transfer_ownership,is_buy_back,buy_back_price,buy_back_time,is_confirm,confirm_time,transfer_reason,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectFinancialTradeTansfer
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectFinancialTradeTansferDO projectFinancialTradeTansfer) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_financial_trade_tansfer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_financial_trade_tansfer set flow_no=?, project_code=?, apply_id=?, transfer_price=?, transfer_num=?, transfer_interest=?, transfer_time=?, is_transfer_ownership=?, is_buy_back=?, buy_back_price=?, buy_back_time=?, is_confirm=?, confirm_time=?, transfer_reason=?, attach=? where (trade_id = ?)</tt>
	 *
	 *	@param projectFinancialTradeTansfer
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectFinancialTradeTansferDO projectFinancialTradeTansfer) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_trade_tansfer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_tansfer where (trade_id = ?)</tt>
	 *
	 *	@param tradeId
	 *	@return ProjectFinancialTradeTansferDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialTradeTansferDO findById(long tradeId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_trade_tansfer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_tansfer where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return ProjectFinancialTradeTansferDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialTradeTansferDO findByApplyId(long applyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_trade_tansfer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_tansfer where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return ProjectFinancialTradeTansferDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialTradeTansferDO findByCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_financial_trade_tansfer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_financial_trade_tansfer where (trade_id = ?)</tt>
	 *
	 *	@param tradeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long tradeId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_financial_trade_tansfer</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_financial_trade_tansfer where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_trade_tansfer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_tansfer where (1 = 1)</tt>
	 *
	 *	@param projectFinancialTradeTansfer
	 *	@param transferTimeStart
	 *	@param transferTimeEnd
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectFinancialTradeTansferDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectFinancialTradeTansferDO> findByCondition(ProjectFinancialTradeTansferDO projectFinancialTradeTansfer, Date transferTimeStart, Date transferTimeEnd, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_financial_trade_tansfer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_financial_trade_tansfer where (1 = 1)</tt>
	 *
	 *	@param projectFinancialTradeTansfer
	 *	@param transferTimeStart
	 *	@param transferTimeEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectFinancialTradeTansferDO projectFinancialTradeTansfer, Date transferTimeStart, Date transferTimeEnd) throws DataAccessException;

}