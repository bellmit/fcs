/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryNoticeLetterDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryNoticeLetterDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryNoticeLetterDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_notice_letter.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisProjectRecoveryNoticeLetterDAO extends SqlMapClientDaoSupport implements ProjectRecoveryNoticeLetterDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryNoticeLetterDO</tt> object to DB table <tt>project_recovery_notice_letter</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_notice_letter(project_recovery_id,letter_type,content,content_message,letter_status,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryNoticeLetter
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryNoticeLetterDO projectRecoveryNoticeLetter) throws DataAccessException {
    	if (projectRecoveryNoticeLetter == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-NOTICE-LETTER-INSERT", projectRecoveryNoticeLetter);

        return projectRecoveryNoticeLetter.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery_notice_letter</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_notice_letter set project_recovery_id=?, letter_type=?, content=?, content_message=?, letter_status=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryNoticeLetter
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryNoticeLetterDO projectRecoveryNoticeLetter) throws DataAccessException {
    	if (projectRecoveryNoticeLetter == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-NOTICE-LETTER-UPDATE", projectRecoveryNoticeLetter);
    }

	/**
	 *  Query DB table <tt>project_recovery_notice_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_notice_letter where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryNoticeLetterDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryNoticeLetterDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryNoticeLetterDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-NOTICE-LETTER-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_notice_letter</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_notice_letter where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryNoticeLetterDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryNoticeLetterDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-NOTICE-LETTER-FIND-BY-RECOVERY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery_notice_letter</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_notice_letter where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-NOTICE-LETTER-DELETE-BY-ID", param);
    }

}