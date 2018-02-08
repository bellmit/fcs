/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.ibatis;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.born.fcs.pm.daointerface.OperationJournalDAO;
import com.born.fcs.pm.dataobject.OperationJournalDO;
// auto generated imports
	
/**
 * An ibatis based implementation of dao interface <tt>com.yjf.yrd.dal.daointerface.OperationJournalDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/operation_journal.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisOperationJournalDAO extends SqlMapClientDaoSupport implements OperationJournalDAO {
	/**
	 *  Insert one <tt>OperationJournalDO</tt> object to DB table <tt>operation_journal</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into operation_journal(base_module_name,permission_name,operation_content,memo,operator_id,operator_name,operator_ip,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param operationJournal
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(OperationJournalDO operationJournal) throws DataAccessException {
    	if (operationJournal == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-OPERATION-JOURNAL-INSERT", operationJournal);

        return operationJournal.getIdentity();
    }

	/**
	 *  Update DB table <tt>operation_journal</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update operation_journal set base_module_name=?, permission_name=?, operator_id=?, operator_name=?, operator_ip=?, memo=?, operation_content=? where (identity = ?)</tt>
	 *
	 *	@param operationJournal
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(OperationJournalDO operationJournal) throws DataAccessException {
    	if (operationJournal == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-OPERATION-JOURNAL-UPDATE", operationJournal);
    }

	/**
	 *  Query DB table <tt>operation_journal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select identity, base_module_name, permission_name, operation_content, memo, operator_id, operator_name, operator_ip, raw_add_time, raw_update_time from operation_journal where (identity = ?)</tt>
	 *
	 *	@param identity
	 *	@return OperationJournalDO
	 *	@throws DataAccessException
	 */	 
    public OperationJournalDO findByIdentity (long identity) throws DataAccessException {
        Long param = new Long(identity);

        return (OperationJournalDO) getSqlMapClientTemplate().queryForObject("MS-OPERATION-JOURNAL-FIND-BY-IDENTITY", param);

    }

	/**
	 *  Query DB table <tt>operation_journal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from operation_journal</tt>
	 *
	 *	@param operationJournal
	 *	@param operatorTimeStart
	 *	@param operatorTimeEnd
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<OperationJournalDO>
	 *	@throws DataAccessException
	 */	 
    public List<OperationJournalDO> queryOperationJournalPageList(OperationJournalDO operationJournal, Date operatorTimeStart, Date operatorTimeEnd, long limitStart, long pageSize) throws DataAccessException {
    	if (operationJournal == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("operationJournal", operationJournal);
        param.put("operatorTimeStart", operatorTimeStart);
        param.put("operatorTimeEnd", operatorTimeEnd);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-OPERATION-JOURNAL-QUERY-OPERATION-JOURNAL-PAGE-LIST", param);

    }

	/**
	 *  Query DB table <tt>operation_journal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select count(identity) from operation_journal</tt>
	 *
	 *	@param operationJournal
	 *	@param operatorTimeStart
	 *	@param operatorTimeEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long queryOperationJournalPageListCount(OperationJournalDO operationJournal, Date operatorTimeStart, Date operatorTimeEnd) throws DataAccessException {
    	if (operationJournal == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("operationJournal", operationJournal);
        param.put("operatorTimeStart", operatorTimeStart);
        param.put("operatorTimeEnd", operatorTimeEnd);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-OPERATION-JOURNAL-QUERY-OPERATION-JOURNAL-PAGE-LIST-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}