/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.fm.dal.daointerface.IncomeConfirmDetailDAO;


// auto generated imports
import com.born.fcs.fm.dal.dataobject.IncomeConfirmDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.fm.dal.daointerface.IncomeConfirmDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/income_confirm_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisIncomeConfirmDetailDAO extends SqlMapClientDaoSupport implements IncomeConfirmDetailDAO {
	/**
	 *  Insert one <tt>IncomeConfirmDetailDO</tt> object to DB table <tt>income_confirm_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into income_confirm_detail(income_id,income_period,confirm_status,system_estimated_amount,income_confirmed_amount,is_confirmed,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param incomeConfirmDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(IncomeConfirmDetailDO incomeConfirmDetail) throws DataAccessException {
    	if (incomeConfirmDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-INCOME-CONFIRM-DETAIL-INSERT", incomeConfirmDetail);

        return incomeConfirmDetail.getId();
    }

	/**
	 *  Update DB table <tt>income_confirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update income_confirm_detail set income_id=?, income_period=?, confirm_status=?, system_estimated_amount=?, income_confirmed_amount=?, is_confirmed=? where (id = ?)</tt>
	 *
	 *	@param incomeConfirmDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(IncomeConfirmDetailDO incomeConfirmDetail) throws DataAccessException {
    	if (incomeConfirmDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-INCOME-CONFIRM-DETAIL-UPDATE", incomeConfirmDetail);
    }

	/**
	 *  Query DB table <tt>income_confirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from income_confirm_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return IncomeConfirmDetailDO
	 *	@throws DataAccessException
	 */	 
    public IncomeConfirmDetailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (IncomeConfirmDetailDO) getSqlMapClientTemplate().queryForObject("MS-INCOME-CONFIRM-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>income_confirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from income_confirm_detail where (income_id = ?)</tt>
	 *
	 *	@param incomeId
	 *	@return List<IncomeConfirmDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<IncomeConfirmDetailDO> findByIncomeId(long incomeId) throws DataAccessException {
        Long param = new Long(incomeId);

        return getSqlMapClientTemplate().queryForList("MS-INCOME-CONFIRM-DETAIL-FIND-BY-INCOME-ID", param);

    }

	/**
	 *  Query DB table <tt>income_confirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from income_confirm_detail where ((income_id = ?) AND (income_period = ?))</tt>
	 *
	 *	@param incomeId
	 *	@param incomePeriod
	 *	@return IncomeConfirmDetailDO
	 *	@throws DataAccessException
	 */	 
    public IncomeConfirmDetailDO findByIncomeIdAndIncomePeriod(long incomeId, String incomePeriod) throws DataAccessException {
        Map param = new HashMap();

        param.put("incomeId", new Long(incomeId));
        param.put("incomePeriod", incomePeriod);

        return (IncomeConfirmDetailDO) getSqlMapClientTemplate().queryForObject("MS-INCOME-CONFIRM-DETAIL-FIND-BY-INCOME-ID-AND-INCOME-PERIOD", param);

    }

	/**
	 *  Delete records from DB table <tt>income_confirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from income_confirm_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-INCOME-CONFIRM-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>income_confirm_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from income_confirm_detail where (income_id = ?)</tt>
	 *
	 *	@param incomeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByIncomeId(long incomeId) throws DataAccessException {
        Long param = new Long(incomeId);

        return getSqlMapClientTemplate().delete("MS-INCOME-CONFIRM-DETAIL-DELETE-BY-INCOME-ID", param);
    }

	/**
	 *  Query DB table <tt>income_confirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from income_confirm_detail where (1 = 1)</tt>
	 *
	 *	@param incomeConfirmDetail
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<IncomeConfirmDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<IncomeConfirmDetailDO> findByCondition(IncomeConfirmDetailDO incomeConfirmDetail, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException {
    	if (incomeConfirmDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("incomeConfirmDetail", incomeConfirmDetail);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);

        return getSqlMapClientTemplate().queryForList("MS-INCOME-CONFIRM-DETAIL-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>income_confirm_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from income_confirm_detail where (1 = 1)</tt>
	 *
	 *	@param incomeConfirmDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(IncomeConfirmDetailDO incomeConfirmDetail) throws DataAccessException {
    	if (incomeConfirmDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-INCOME-CONFIRM-DETAIL-FIND-BY-CONDITION-COUNT", incomeConfirmDetail);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}