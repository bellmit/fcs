/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularProjectBaseInfoMonthDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>regular_project_base_info_month</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_base_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface RegularProjectBaseInfoMonthDAO {
	/**
	 *  Insert one <tt>RegularProjectBaseInfoMonthDO</tt> object to DB table <tt>regular_project_base_info_month</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_project_base_info_month(report_date,report_year,report_month,customer_id,customer_name,customer_outer_level,project_code,project_name,dept_id,dept_code,dept_name,come_from,from_project_code,from_project_name,project_channel,project_channel_code,project_channel_type,capital_channel,capital_channel_code,capital_channel_type,busi_type,busi_type_name,busi_type_detail,amount,contract_amount,fee_rate,fee_type,fee_describe,start_time,end_time,time_limit,time_unit,month_num,is_new,is_insurance,busi_manager_account,busi_manager_name,risk_manager_account,risk_manager_name,legal_manager_account,legal_manager_name,charge_plan,repay_plan,balance,first_occur_date,occur_amount,release_amount,is_his_ptoject,is_belong2nc,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularProjectBaseInfoMonth
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(RegularProjectBaseInfoMonthDO regularProjectBaseInfoMonth) throws DataAccessException;

	/**
	 *  Update DB table <tt>regular_project_base_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_project_base_info_month set report_year=?, report_month=?, customer_id=?, customer_name=?, customer_outer_level=?, project_name=?, dept_id=?, dept_code=?, dept_name=?, come_from=?, from_project_code=?, from_project_name=?, project_channel=?, project_channel_code=?, project_channel_type=?, capital_channel=?, capital_channel_code=?, capital_channel_type=?, busi_type=?, busi_type_name=?, busi_type_detail=?, amount=?, contract_amount=?, fee_rate=?, fee_type=?, fee_describe=?, start_time=?, end_time=?, time_limit=?, time_unit=?, month_num=?, is_new=?, is_insurance=?, busi_manager_account=?, busi_manager_name=?, risk_manager_account=?, risk_manager_name=?, legal_manager_account=?, legal_manager_name=?, charge_plan=?, repay_plan=?, balance=?, first_occur_date=?, occur_amount=?, release_amount=?, is_his_ptoject=?, is_belong2nc=? where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param regularProjectBaseInfoMonth
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularProjectBaseInfoMonthDO regularProjectBaseInfoMonth) throws DataAccessException;

	/**
	 *  Query DB table <tt>regular_project_base_info_month</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_project_base_info_month where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param projectCode
	 *	@return RegularProjectBaseInfoMonthDO
	 *	@throws DataAccessException
	 */	 
    public RegularProjectBaseInfoMonthDO findByPrimary(String reportDate, String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>regular_project_base_info_month</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_project_base_info_month where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(String reportDate) throws DataAccessException;

}