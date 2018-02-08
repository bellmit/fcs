/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularProjectRunInfoDO;
import java.util.Date;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>regular_project_run_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_run_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface RegularProjectRunInfoDAO {
	/**
	 *  Insert one <tt>RegularProjectRunInfoDO</tt> object to DB table <tt>regular_project_run_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_project_run_info(report_date,report_year,report_month,report_day,customer_id,customer_name,busi_license_no,project_code,project_name,balance_beginning,balance_ending,occur_amount_this_year,occur_amount_this_month,occur_amount_this_month_detail,release_amount_this_year,release_amount_this_month,release_amount_this_month_detail,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularProjectRunInfo
	 *	@return Date
	 *	@throws DataAccessException
	 */	 
    public Date insert(RegularProjectRunInfoDO regularProjectRunInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>regular_project_run_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_project_run_info set report_year=?, report_month=?, report_day=?, customer_id=?, customer_name=?, busi_license_no=?, project_name=?, balance_beginning=?, balance_ending=?, occur_amount_this_year=?, occur_amount_this_month=?, occur_amount_this_month_detail=?, release_amount_this_year=?, release_amount_this_month=?, release_amount_this_month_detail=? where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param regularProjectRunInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularProjectRunInfoDO regularProjectRunInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>regular_project_run_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_project_run_info where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param projectCode
	 *	@return RegularProjectRunInfoDO
	 *	@throws DataAccessException
	 */	 
    public RegularProjectRunInfoDO findByPrimary(Date reportDate, String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>regular_project_run_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_project_run_info where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(Date reportDate) throws DataAccessException;

}