/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckReportProjectDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_afterwards_check_report_project</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_report_project.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FAfterwardsCheckReportProjectDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckReportProjectDO</tt> object to DB table <tt>f_afterwards_check_report_project</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check_report_project(form_id,project_name,project_type,opening_date,closing_date,opening_area,received_amount,receiving_amount,saling_area,saling_amount,project_plan,paid_land_amount,paid_project_amount,plan_area,plan_project_amount,plan_invest_amount,project_desc,del_able,check_status,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheckReportProject
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckReportProjectDO FAfterwardsCheckReportProject) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check_report_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_report_project set form_id=?, project_name=?, project_type=?, opening_date=?, closing_date=?, opening_area=?, received_amount=?, receiving_amount=?, saling_area=?, saling_amount=?, project_plan=?, paid_land_amount=?, paid_project_amount=?, plan_area=?, plan_project_amount=?, plan_invest_amount=?, project_desc=?, del_able=?, check_status=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckReportProject
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckReportProjectDO FAfterwardsCheckReportProject) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_afterwards_check_report_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_report_project set project_name=?, project_type=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckReportProject
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateSimple(FAfterwardsCheckReportProjectDO FAfterwardsCheckReportProject) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check_report_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_report_project where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FAfterwardsCheckReportProjectDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckReportProjectDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_afterwards_check_report_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_report_project where (form_id = ?) order by sort_order ASC, id ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FAfterwardsCheckReportProjectDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckReportProjectDO> findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_report_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_report_project where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_report_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_report_project where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

}