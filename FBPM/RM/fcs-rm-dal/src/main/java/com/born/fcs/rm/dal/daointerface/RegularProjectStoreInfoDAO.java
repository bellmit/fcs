/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularProjectStoreInfoDO;
import java.util.Date;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>regular_project_store_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_store_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface RegularProjectStoreInfoDAO {
	/**
	 *  Insert one <tt>RegularProjectStoreInfoDO</tt> object to DB table <tt>regular_project_store_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_project_store_info(report_date,report_year,report_month,report_day,customer_id,customer_name,busi_license_no,project_code,project_name,amount,fee_rate,fee_type,fee_describe,time_limit,time_unit,month_num,progress,conucil_finish_date,council_type,full_sign,contract_status,credit_status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularProjectStoreInfo
	 *	@return Date
	 *	@throws DataAccessException
	 */	 
    public Date insert(RegularProjectStoreInfoDO regularProjectStoreInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>regular_project_store_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_project_store_info set report_year=?, report_month=?, report_day=?, customer_id=?, customer_name=?, busi_license_no=?, project_name=?, amount=?, fee_rate=?, fee_type=?, fee_describe=?, time_limit=?, time_unit=?, month_num=?, progress=?, conucil_finish_date=?, council_type=?, full_sign=?, contract_status=?, credit_status=? where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param regularProjectStoreInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularProjectStoreInfoDO regularProjectStoreInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>regular_project_store_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_project_store_info where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param projectCode
	 *	@return RegularProjectStoreInfoDO
	 *	@throws DataAccessException
	 */	 
    public RegularProjectStoreInfoDO findByPrimary(Date reportDate, String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>regular_project_store_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_project_store_info where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(Date reportDate) throws DataAccessException;

}