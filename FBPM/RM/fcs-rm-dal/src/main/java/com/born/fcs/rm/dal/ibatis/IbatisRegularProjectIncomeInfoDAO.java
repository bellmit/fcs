/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.rm.dal.daointerface.RegularProjectIncomeInfoDAO;


// auto generated imports
import com.born.fcs.rm.dal.dataobject.RegularProjectIncomeInfoDO;
import java.util.Date;
import org.springframework.dao.DataAccessException;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.rm.dal.daointerface.RegularProjectIncomeInfoDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_income_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("rawtypes") 
public class IbatisRegularProjectIncomeInfoDAO extends SqlMapClientDaoSupport implements RegularProjectIncomeInfoDAO {
	/**
	 *  Insert one <tt>RegularProjectIncomeInfoDO</tt> object to DB table <tt>regular_project_income_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into regular_project_income_info(report_date,report_year,report_month,report_day,customer_id,customer_name,busi_license_no,project_code,project_name,income_this_year,income_this_month,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param regularProjectIncomeInfo
	 *	@return Date
	 *	@throws DataAccessException
	 */	 
    public Date insert(RegularProjectIncomeInfoDO regularProjectIncomeInfo) throws DataAccessException {
    	if (regularProjectIncomeInfo == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-REGULAR-PROJECT-INCOME-INFO-INSERT", regularProjectIncomeInfo);

        return regularProjectIncomeInfo.getReportDate();
    }

	/**
	 *  Update DB table <tt>regular_project_income_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update regular_project_income_info set report_year=?, report_month=?, report_day=?, customer_id=?, customer_name=?, busi_license_no=?, project_name=?, income_this_year=?, income_this_month=? where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param regularProjectIncomeInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RegularProjectIncomeInfoDO regularProjectIncomeInfo) throws DataAccessException {
    	if (regularProjectIncomeInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-REGULAR-PROJECT-INCOME-INFO-UPDATE", regularProjectIncomeInfo);
    }

	/**
	 *  Query DB table <tt>regular_project_income_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from regular_project_income_info where ((report_date = ?) AND (project_code = ?))</tt>
	 *
	 *	@param reportDate
	 *	@param projectCode
	 *	@return RegularProjectIncomeInfoDO
	 *	@throws DataAccessException
	 */	 
    public RegularProjectIncomeInfoDO findByPrimary(Date reportDate, String projectCode) throws DataAccessException {
        Map param = new HashMap();

        param.put("reportDate", reportDate);
        param.put("projectCode", projectCode);

        return (RegularProjectIncomeInfoDO) getSqlMapClientTemplate().queryForObject("MS-REGULAR-PROJECT-INCOME-INFO-FIND-BY-PRIMARY", param);

    }

	/**
	 *  Delete records from DB table <tt>regular_project_income_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from regular_project_income_info where (report_date = ?)</tt>
	 *
	 *	@param reportDate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportDate(Date reportDate) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-REGULAR-PROJECT-INCOME-INFO-DELETE-BY-REPORT-DATE", reportDate);
    }

}