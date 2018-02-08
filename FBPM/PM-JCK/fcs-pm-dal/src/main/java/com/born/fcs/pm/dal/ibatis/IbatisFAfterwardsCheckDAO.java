/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FAfterwardsCheckDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FAfterwardsCheckDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFAfterwardsCheckDAO extends SqlMapClientDaoSupport implements FAfterwardsCheckDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckDO</tt> object to DB table <tt>f_afterwards_check</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check(form_id,project_code,project_name,customer_id,customer_name,edition,check_date,check_address,round_year,round_time,is_lastest,amount,used_amount,repayed_amount,use_way,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-AFTERWARDS-CHECK-INSERT", FAfterwardsCheck);

        return FAfterwardsCheck.getId();
    }

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, edition=?, check_date=?, check_address=?, round_year=?, round_time=?, is_lastest=?, amount=?, used_amount=?, repayed_amount=?, use_way=? where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-AFTERWARDS-CHECK-UPDATE", FAfterwardsCheck);
    }

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set project_code=?, project_name=?, customer_id=?, customer_name=?, edition=?, check_date=?, check_address=?, round_year=?, round_time=?, is_lastest=?, amount=?, used_amount=?, repayed_amount=?, use_way=? where (form_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-AFTERWARDS-CHECK-UPDATE-BY-FORM-ID", FAfterwardsCheck);
    }

	/**
	 *  Update DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check set is_lastest='NO' where ((is_lastest = 'YES') AND (project_code = ?))</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateIsLasetByProjectCode(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-AFTERWARDS-CHECK-UPDATE-IS-LASET-BY-PROJECT-CODE", FAfterwardsCheck);
    }

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FAfterwardsCheckDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FAfterwardsCheckDO) getSqlMapClientTemplate().queryForObject("MS-F-AFTERWARDS-CHECK-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FAfterwardsCheckDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FAfterwardsCheckDO) getSqlMapClientTemplate().queryForObject("MS-F-AFTERWARDS-CHECK-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-DELETE-BY-PROJECT-CODE", projectCode);
    }

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FAfterwardsCheckDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckDO> findByCondition(FAfterwardsCheckDO FAfterwardsCheck, long limitStart, long pageSize) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FAfterwardsCheck", FAfterwardsCheck);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-AFTERWARDS-CHECK-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check where (id = ?)</tt>
	 *
	 *	@param FAfterwardsCheck
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FAfterwardsCheckDO FAfterwardsCheck) throws DataAccessException {
    	if (FAfterwardsCheck == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-AFTERWARDS-CHECK-FIND-BY-CONDITION-COUNT", FAfterwardsCheck);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}