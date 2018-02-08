/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.daointerface;

// auto generated imports
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.born.fcs.fm.dal.dataobject.ProjectRelatedUserDO;

/**
 * A dao interface provides methods to access database table <tt>project_related_user</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_related_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ProjectRelatedUserDAO {
	/**
	 *  Insert one <tt>ProjectRelatedUserDO</tt> object to DB table <tt>project_related_user</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_related_user(related_id,project_code,user_type,user_id,user_account,user_name,user_mobile,user_email,dept_id,dept_code,dept_name,dept_path,dept_path_name,transfer_time,transfer_related_id,remark,is_current,is_del,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRelatedUser
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRelatedUserDO projectRelatedUser) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_related_user set project_code=?, user_type=?, user_id=?, user_account=?, user_name=?, user_mobile=?, user_email=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, transfer_time=?, transfer_related_id=?, remark=?, is_current=?, is_del=? where (related_id = ?)</tt>
	 *
	 *	@param projectRelatedUser
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRelatedUserDO projectRelatedUser) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return ProjectRelatedUserDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRelatedUserDO findById(long relatedId) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<ProjectRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRelatedUserDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_related_user where ((project_code = ?) AND (user_type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param userType
	 *	@return List<ProjectRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRelatedUserDO> findByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_related_user where ((project_code = ?) AND (user_type = ?) AND (is_current = 'IS') AND (is_del = 'NO'))</tt>
	 *
	 *	@param projectCode
	 *	@param userType
	 *	@return List<ProjectRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRelatedUserDO> findCurrentByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_related_user where ((project_code = ?) AND (user_id = ?) AND (user_type = 'FLOW_RELATED'))</tt>
	 *
	 *	@param projectCode
	 *	@param userId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int revokeFlowRelated(String projectCode, long userId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long relatedId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_related_user where ((project_code = ?) AND (user_type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param userType
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_related_user where (1 = 1)</tt>
	 *
	 *	@param projectRelatedUser
	 *	@param deptIdList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRelatedUserDO> findByCondition(ProjectRelatedUserDO projectRelatedUser, List deptIdList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_related_user where (1 = 1)</tt>
	 *
	 *	@param projectRelatedUser
	 *	@param deptIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectRelatedUserDO projectRelatedUser, List deptIdList) throws DataAccessException;

}