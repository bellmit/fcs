/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.daointerface;

// auto generated imports
import com.born.fcs.rm.dal.dataobject.ReportRuleDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>report_rule</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/report_rule.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ReportRuleDAO {
	/**
	 *  Insert one <tt>ReportRuleDO</tt> object to DB table <tt>report_rule</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into report_rule(report_id,report_name,sql_str,access_roles,filter1_name,filter1_type,filter1_sql,filter2_name,filter2_type,filter2_sql,filter3_name,filter3_type,filter3_sql,filter4_name,filter4_type,filter4_sql,filter5_name,filter5_type,filter5_sql,filter6_name,filter6_type,filter6_sql,filter1_options,filter2_options,filter3_options,filter4_options,filter5_options,filter6_options,note,sort_order) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param reportRule
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ReportRuleDO reportRule) throws DataAccessException;

	/**
	 *  Update DB table <tt>report_rule</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update report_rule set report_name=?, sql_str=?, access_roles=?, filter1_name=?, filter1_type=?, filter1_sql=?, filter2_name=?, filter2_type=?, filter2_sql=?, filter3_name=?, filter3_type=?, filter3_sql=?, filter4_name=?, filter4_type=?, filter4_sql=?, filter5_name=?, filter5_type=?, filter5_sql=?, filter6_name=?, filter6_type=?, filter6_sql=?, filter1_options=?, filter2_options=?, filter3_options=?, filter4_options=?, filter5_options=?, filter6_options=?, note=?, sort_order=? where (report_id = ?)</tt>
	 *
	 *	@param reportRule
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ReportRuleDO reportRule) throws DataAccessException;

	/**
	 *  Query DB table <tt>report_rule</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_id, report_name, sql_str, access_roles, filter1_name, filter1_type, filter1_sql, filter2_name, filter2_type, filter2_sql, filter3_name, filter3_type, filter3_sql, filter4_name, filter4_type, filter4_sql, filter5_name, filter5_type, filter5_sql, filter6_name, filter6_type, filter6_sql, filter1_options, filter2_options, filter3_options, filter4_options, filter5_options, filter6_options, note, sort_order from report_rule where (report_id = ?)</tt>
	 *
	 *	@param reportId
	 *	@return ReportRuleDO
	 *	@throws DataAccessException
	 */	 
    public ReportRuleDO findById(long reportId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>report_rule</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from report_rule where (report_id = ?)</tt>
	 *
	 *	@param reportId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long reportId) throws DataAccessException;

	/**
	 *  Query DB table <tt>report_rule</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from report_rule</tt>
	 *
	 *	@return List<Long>
	 *	@throws DataAccessException
	 */	 
    public List<Long> findAllCount() throws DataAccessException;

	/**
	 *  Query DB table <tt>report_rule</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_id, report_name, sql_str, access_roles, filter1_name, filter1_type, filter1_sql, filter2_name, filter2_type, filter2_sql, filter3_name, filter3_type, filter3_sql, filter4_name, filter4_type, filter4_sql, filter5_name, filter5_type, filter5_sql, filter6_name, filter6_type, filter6_sql, filter1_options, filter2_options, filter3_options, filter4_options, filter5_options, filter6_options, note, sort_order from report_rule where (report_id = ?)</tt>
	 *
	 *	@param reportRule
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ReportRuleDO>
	 *	@throws DataAccessException
	 */	 
    public List<ReportRuleDO> findByCondition(ReportRuleDO reportRule, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>report_rule</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from report_rule r</tt>
	 *
	 *	@param reportRule
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ReportRuleDO reportRule) throws DataAccessException;

}