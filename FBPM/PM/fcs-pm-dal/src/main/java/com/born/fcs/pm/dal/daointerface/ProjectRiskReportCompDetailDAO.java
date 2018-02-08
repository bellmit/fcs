/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRiskReportCompDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_risk_report_comp_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_risk_report_comp_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectRiskReportCompDetailDAO {
	/**
	 *  Insert one <tt>ProjectRiskReportCompDetailDO</tt> object to DB table <tt>project_risk_report_comp_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_risk_report_comp_detail(detail_id,report_id,project_code,comp_amount,comp_date,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRiskReportCompDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRiskReportCompDetailDO projectRiskReportCompDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_risk_report_comp_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_risk_report_comp_detail set report_id=?, project_code=?, comp_amount=?, comp_date=? where (detail_id = ?)</tt>
	 *
	 *	@param projectRiskReportCompDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRiskReportCompDetailDO projectRiskReportCompDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_report_comp_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select detail_id, report_id, project_code, comp_amount, comp_date, raw_add_time, raw_update_time from project_risk_report_comp_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return ProjectRiskReportCompDetailDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRiskReportCompDetailDO findById(long detailId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_risk_report_comp_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_risk_report_comp_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long detailId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_risk_report_comp_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_risk_report_comp_detail where (report_id = ?)</tt>
	 *
	 *	@param reportId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportId(long reportId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_report_comp_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select detail_id, report_id, project_code, comp_amount, comp_date, raw_add_time, raw_update_time from project_risk_report_comp_detail where (1 = 1)</tt>
	 *
	 *	@param projectRiskReportCompDetail
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@return List<ProjectRiskReportCompDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRiskReportCompDetailDO> findByCondition(ProjectRiskReportCompDetailDO projectRiskReportCompDetail, long limitStart, long pageSize, Date startTimeBegin, Date startTimeEnd) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_report_comp_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_risk_report_comp_detail where (1 = 1)</tt>
	 *
	 *	@param projectRiskReportCompDetail
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectRiskReportCompDetailDO projectRiskReportCompDetail, Date startTimeBegin, Date startTimeEnd) throws DataAccessException;

}