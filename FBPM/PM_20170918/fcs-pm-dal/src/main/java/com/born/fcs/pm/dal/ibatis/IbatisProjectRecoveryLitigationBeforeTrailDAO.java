/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationBeforeTrailDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryLitigationBeforeTrailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Date;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectRecoveryLitigationBeforeTrailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_before_trail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectRecoveryLitigationBeforeTrailDAO extends SqlMapClientDaoSupport implements ProjectRecoveryLitigationBeforeTrailDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryLitigationBeforeTrailDO</tt> object to DB table <tt>project_recovery_litigation_before_trail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_litigation_before_trail(project_recovery_id,opening_time,notice_time,clerk_arrived_time,jurisdiction_objection,jurisdiction_objection_judgment,jurisdiction_objection_appeal,jurisdiction_objection_judgment_second,evidence_exchange,appraisal_apply,appraisal_material,appraisal_amount,investigating_apply,witnesses_apply,increase_litigation_apply,memo,end_notice,litigation_index,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryLitigationBeforeTrail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryLitigationBeforeTrailDO projectRecoveryLitigationBeforeTrail) throws DataAccessException {
    	if (projectRecoveryLitigationBeforeTrail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-INSERT", projectRecoveryLitigationBeforeTrail);

        return projectRecoveryLitigationBeforeTrail.getId();
    }

	/**
	 *  Update DB table <tt>project_recovery_litigation_before_trail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_before_trail set project_recovery_id=?, opening_time=?, notice_time=?, clerk_arrived_time=?, jurisdiction_objection=?, jurisdiction_objection_judgment=?, jurisdiction_objection_appeal=?, jurisdiction_objection_judgment_second=?, evidence_exchange=?, appraisal_apply=?, appraisal_material=?, appraisal_amount=?, investigating_apply=?, witnesses_apply=?, increase_litigation_apply=?, memo=?, end_notice=?, litigation_index=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationBeforeTrail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryLitigationBeforeTrailDO projectRecoveryLitigationBeforeTrail) throws DataAccessException {
    	if (projectRecoveryLitigationBeforeTrail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-UPDATE", projectRecoveryLitigationBeforeTrail);
    }

	/**
	 *  Update DB table <tt>project_recovery_litigation_before_trail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_before_trail set end_notice=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationBeforeTrail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateEndNotice(ProjectRecoveryLitigationBeforeTrailDO projectRecoveryLitigationBeforeTrail) throws DataAccessException {
    	if (projectRecoveryLitigationBeforeTrail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-UPDATE-END-NOTICE", projectRecoveryLitigationBeforeTrail);
    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_before_trail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_before_trail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryLitigationBeforeTrailDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationBeforeTrailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectRecoveryLitigationBeforeTrailDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_before_trail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_before_trail where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return List<ProjectRecoveryLitigationBeforeTrailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryLitigationBeforeTrailDO> findByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-FIND-BY-RECOVERY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_recovery_litigation_before_trail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_before_trail where (1 = 1)</tt>
	 *
	 *	@param openingTimeStart
	 *	@param openingTimeEnd
	 *	@return List<ProjectRecoveryLitigationBeforeTrailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectRecoveryLitigationBeforeTrailDO> findNoticeByOpeningTime(Date openingTimeStart, Date openingTimeEnd) throws DataAccessException {
        Map param = new HashMap();

        param.put("openingTimeStart", openingTimeStart);
        param.put("openingTimeEnd", openingTimeEnd);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-FIND-NOTICE-BY-OPENING-TIME", param);

    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_before_trail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_before_trail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_before_trail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_before_trail where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException {
        Long param = new Long(projectRecoveryId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-RECOVERY-LITIGATION-BEFORE-TRAIL-DELETE-BY-RECOVERY-ID", param);
    }

}