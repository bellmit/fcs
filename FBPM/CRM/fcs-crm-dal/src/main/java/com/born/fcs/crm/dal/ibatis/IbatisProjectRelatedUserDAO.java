/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.ProjectRelatedUserDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.ProjectRelatedUserDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.ProjectRelatedUserDAO</tt>.
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
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectRelatedUserDAO extends SqlMapClientDaoSupport implements ProjectRelatedUserDAO {
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
    public long insert(ProjectRelatedUserDO projectRelatedUser) throws DataAccessException {
    	if (projectRelatedUser == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RELATED-USER-INSERT", projectRelatedUser);

        return projectRelatedUser.getRelatedId();
    }

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
    public int update(ProjectRelatedUserDO projectRelatedUser) throws DataAccessException {
    	if (projectRelatedUser == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RELATED-USER-UPDATE", projectRelatedUser);
    }

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
    public ProjectRelatedUserDO findById(long relatedId) throws DataAccessException {
        Long param = new Long(relatedId);

        return (ProjectRelatedUserDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RELATED-USER-FIND-BY-ID", param);

    }

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
    public List<ProjectRelatedUserDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RELATED-USER-FIND-BY-PROJECT-CODE", projectCode);

    }

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
    public List<ProjectRelatedUserDO> findByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("userType", userType);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RELATED-USER-FIND-BY-PROJECT-CODE-AND-USER-TYPE", param);

    }

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
    public List<ProjectRelatedUserDO> findCurrentByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("userType", userType);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RELATED-USER-FIND-CURRENT-BY-PROJECT-CODE-AND-USER-TYPE", param);

    }

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
    public int revokeFlowRelated(String projectCode, long userId) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("userId", new Long(userId));

        return getSqlMapClientTemplate().delete("MS-PROJECT-RELATED-USER-REVOKE-FLOW-RELATED", param);
    }

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
    public int deleteById(long relatedId) throws DataAccessException {
        Long param = new Long(relatedId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RELATED-USER-DELETE-BY-ID", param);
    }

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
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-PROJECT-RELATED-USER-DELETE-BY-PROJECT-CODE", projectCode);
    }

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
    public int deleteByProjectCodeAndUserType(String projectCode, String userType) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("userType", userType);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RELATED-USER-DELETE-BY-PROJECT-CODE-AND-USER-TYPE", param);
    }

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
    public List<ProjectRelatedUserDO> findByCondition(ProjectRelatedUserDO projectRelatedUser, List deptIdList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (projectRelatedUser == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectRelatedUser", projectRelatedUser);
        param.put("deptIdList", deptIdList);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RELATED-USER-FIND-BY-CONDITION", param);

    }

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
    public long findByConditionCount(ProjectRelatedUserDO projectRelatedUser, List deptIdList) throws DataAccessException {
    	if (projectRelatedUser == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectRelatedUser", projectRelatedUser);
        param.put("deptIdList", deptIdList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RELATED-USER-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}