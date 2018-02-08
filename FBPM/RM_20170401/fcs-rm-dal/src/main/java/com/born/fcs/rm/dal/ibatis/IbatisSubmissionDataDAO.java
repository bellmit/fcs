/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.rm.dal.daointerface.SubmissionDataDAO;


// auto generated imports
import com.born.fcs.rm.dal.dataobject.SubmissionDataDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.rm.dal.daointerface.SubmissionDataDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/submission_data.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisSubmissionDataDAO extends SqlMapClientDaoSupport implements SubmissionDataDAO {
	/**
	 *  Insert one <tt>SubmissionDataDO</tt> object to DB table <tt>submission_data</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into submission_data(submission_id,data1,data2,data3,data4,data5,data6,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param submissionData
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SubmissionDataDO submissionData) throws DataAccessException {
    	if (submissionData == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-SUBMISSION-DATA-INSERT", submissionData);

        return submissionData.getSubmissionDataId();
    }

	/**
	 *  Update DB table <tt>submission_data</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update submission_data set submission_id=?, data1=?, data2=?, data3=?, data4=?, data5=?, data6=?, sort_order=? where (submission_data_id = ?)</tt>
	 *
	 *	@param submissionData
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SubmissionDataDO submissionData) throws DataAccessException {
    	if (submissionData == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-SUBMISSION-DATA-UPDATE", submissionData);
    }

	/**
	 *  Query DB table <tt>submission_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from submission_data where (submission_data_id = ?)</tt>
	 *
	 *	@param submissionDataId
	 *	@return SubmissionDataDO
	 *	@throws DataAccessException
	 */	 
    public SubmissionDataDO findById(long submissionDataId) throws DataAccessException {
        Long param = new Long(submissionDataId);

        return (SubmissionDataDO) getSqlMapClientTemplate().queryForObject("MS-SUBMISSION-DATA-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>submission_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from submission_data where (submission_id = ?)</tt>
	 *
	 *	@param submissionId
	 *	@return List<SubmissionDataDO>
	 *	@throws DataAccessException
	 */	 
    public List<SubmissionDataDO> findBySubmissionId(long submissionId) throws DataAccessException {
        Long param = new Long(submissionId);

        return getSqlMapClientTemplate().queryForList("MS-SUBMISSION-DATA-FIND-BY-SUBMISSION-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>submission_data</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from submission_data where (submission_data_id = ?)</tt>
	 *
	 *	@param submissionDataId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long submissionDataId) throws DataAccessException {
        Long param = new Long(submissionDataId);

        return getSqlMapClientTemplate().delete("MS-SUBMISSION-DATA-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>submission_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from submission_data where (1 = 1)</tt>
	 *
	 *	@param submissionData
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SubmissionDataDO submissionData) throws DataAccessException {
    	if (submissionData == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-SUBMISSION-DATA-FIND-BY-CONDITION-COUNT", submissionData);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>submission_data</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from submission where (1 = 1)</tt>
	 *
	 *	@param submissionData
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<SubmissionDataDO>
	 *	@throws DataAccessException
	 */	 
    public List<SubmissionDataDO> findByCondition(SubmissionDataDO submissionData, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException {
    	if (submissionData == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("submissionData", submissionData);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);

        return getSqlMapClientTemplate().queryForList("MS-SUBMISSION-DATA-FIND-BY-CONDITION", param);

    }

}