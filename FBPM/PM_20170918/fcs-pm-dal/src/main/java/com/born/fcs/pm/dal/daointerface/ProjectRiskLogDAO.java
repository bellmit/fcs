/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRiskLogDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>project_risk_log</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_risk_log.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectRiskLogDAO {
	/**
	 *  Insert one <tt>ProjectRiskLogDO</tt> object to DB table <tt>project_risk_log</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_risk_log(log_id,customer_id,customer_name,project_code,project_name,busi_manager_id,busi_manager_name,occur_time,event_title,event_detail,need_announce,log_status,raw_add_time,create_man_id,create_man_name,participant_ids,participant_names,council_place) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRiskLog
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRiskLogDO projectRiskLog) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_risk_log</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_risk_log set customer_id=?, customer_name=?, project_code=?, project_name=?, busi_manager_id=?, busi_manager_name=?, occur_time=?, event_title=?, event_detail=?, need_announce=?, log_status=?, create_man_id=?, create_man_name=?, participant_ids=?, participant_names=?, council_place=? where (log_id = ?)</tt>
	 *
	 *	@param projectRiskLog
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRiskLogDO projectRiskLog) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select log_id, customer_id, customer_name, project_code, project_name, busi_manager_id, busi_manager_name, occur_time, event_title, event_detail, need_announce, log_status, raw_add_time, raw_update_time, create_man_id, create_man_name, participant_ids, participant_names, council_place from project_risk_log where (log_id = ?)</tt>
	 *
	 *	@param logId
	 *	@return ProjectRiskLogDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRiskLogDO findById(long logId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_risk_log</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_risk_log where (log_id = ?)</tt>
	 *
	 *	@param logId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long logId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select lg.* from project_risk_log lg where (1 = 1)</tt>
	 *
	 *	@param projectRiskLog
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param occurTimeBegin
	 *	@param occurTimeEnd
	 *	@param titleDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@return List<ProjectRiskLogDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRiskLogDO> findByCondition(ProjectRiskLogDO projectRiskLog, long limitStart, long pageSize, Date startTimeBegin, Date startTimeEnd, Date occurTimeBegin, Date occurTimeEnd, String titleDetail, String sortCol, String sortOrder, long loginUserId, List deptIdList, List relatedRoleList) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_risk_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_risk_log lg where (1 = 1)</tt>
	 *
	 *	@param projectRiskLog
	 *	@param startTimeBegin
	 *	@param startTimeEnd
	 *	@param occurTimeBegin
	 *	@param occurTimeEnd
	 *	@param titleDetail
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param relatedRoleList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectRiskLogDO projectRiskLog, Date startTimeBegin, Date startTimeEnd, Date occurTimeBegin, Date occurTimeEnd, String titleDetail, long loginUserId, List deptIdList, List relatedRoleList) throws DataAccessException;

}