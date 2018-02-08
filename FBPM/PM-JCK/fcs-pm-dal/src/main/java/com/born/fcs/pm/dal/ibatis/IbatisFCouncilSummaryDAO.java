/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCouncilSummaryDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCouncilSummaryDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFCouncilSummaryDAO extends SqlMapClientDaoSupport implements FCouncilSummaryDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryDO</tt> object to DB table <tt>f_council_summary</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary(summary_code,form_id,council_id,council_code,council_type,initiator_id,initiator_account,initiator_name,overview,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummary
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryDO FCouncilSummary) throws DataAccessException {
    	if (FCouncilSummary == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-COUNCIL-SUMMARY-INSERT", FCouncilSummary);

        return FCouncilSummary.getSummaryId();
    }

	/**
	 *  Update DB table <tt>f_council_summary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary set summary_code=?, form_id=?, council_id=?, council_code=?, council_type=?, initiator_id=?, initiator_account=?, initiator_name=?, overview=? where (summary_id = ?)</tt>
	 *
	 *	@param FCouncilSummary
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryDO FCouncilSummary) throws DataAccessException {
    	if (FCouncilSummary == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-SUMMARY-UPDATE", FCouncilSummary);
    }

	/**
	 *  Update DB table <tt>f_council_summary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary set summary_code=?, council_id=?, council_code=?, council_type=?, initiator_id=?, initiator_account=?, initiator_name=?, overview=? where (form_id = ?)</tt>
	 *
	 *	@param FCouncilSummary
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FCouncilSummaryDO FCouncilSummary) throws DataAccessException {
    	if (FCouncilSummary == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-COUNCIL-SUMMARY-UPDATE-BY-FORM-ID", FCouncilSummary);
    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return FCouncilSummaryDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryDO findById(long summaryId) throws DataAccessException {
        Long param = new Long(summaryId);

        return (FCouncilSummaryDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCouncilSummaryDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FCouncilSummaryDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary where (council_id = ?)</tt>
	 *
	 *	@param councilId
	 *	@return FCouncilSummaryDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryDO findByCouncilId(long councilId) throws DataAccessException {
        Long param = new Long(councilId);

        return (FCouncilSummaryDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-FIND-BY-COUNCIL-ID", param);

    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary where (council_code = ?)</tt>
	 *
	 *	@param councilCode
	 *	@return FCouncilSummaryDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryDO findByCouncilCode(String councilCode) throws DataAccessException {

        return (FCouncilSummaryDO) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-FIND-BY-COUNCIL-CODE", councilCode);

    }

	/**
	 *  Delete records from DB table <tt>f_council_summary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long summaryId) throws DataAccessException {
        Long param = new Long(summaryId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-SUMMARY-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_council_summary</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-COUNCIL-SUMMARY-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary where (1 = 1)</tt>
	 *
	 *	@param FCouncilSummary
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param startTime
	 *	@param endTime
	 *	@return List<FCouncilSummaryDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryDO> findByCondition(FCouncilSummaryDO FCouncilSummary, long limitStart, long pageSize, String sortCol, String sortOrder, Date startTime, Date endTime) throws DataAccessException {
    	if (FCouncilSummary == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FCouncilSummary", FCouncilSummary);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("startTime", startTime);
        param.put("endTime", endTime);

        return getSqlMapClientTemplate().queryForList("MS-F-COUNCIL-SUMMARY-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_council_summary</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_council_summary where (1 = 1)</tt>
	 *
	 *	@param FCouncilSummary
	 *	@param startTime
	 *	@param endTime
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCouncilSummaryDO FCouncilSummary, Date startTime, Date endTime) throws DataAccessException {
    	if (FCouncilSummary == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FCouncilSummary", FCouncilSummary);
        param.put("startTime", startTime);
        param.put("endTime", endTime);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-COUNCIL-SUMMARY-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}