/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCreditConditionConfirmDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCreditConditionConfirmDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCreditConditionConfirmDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_credit_condition_confirm.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFCreditConditionConfirmDAO extends SqlMapClientDaoSupport implements FCreditConditionConfirmDAO {
	/**
	 *  Insert one <tt>FCreditConditionConfirmDO</tt> object to DB table <tt>f_credit_condition_confirm</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_credit_condition_confirm(form_id,project_code,project_name,contract_no,customer_id,customer_name,customer_type,busi_type,busi_type_name,time_limit,time_unit,amount,institution_id,institution_name,is_margin,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCreditConditionConfirm
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCreditConditionConfirmDO FCreditConditionConfirm) throws DataAccessException {
    	if (FCreditConditionConfirm == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-CREDIT-CONDITION-CONFIRM-INSERT", FCreditConditionConfirm);

        return FCreditConditionConfirm.getConfirmId();
    }

	/**
	 *  Update DB table <tt>f_credit_condition_confirm</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_condition_confirm set form_id=?, project_code=?, project_name=?, contract_no=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, time_limit=?, time_unit=?, amount=?, institution_id=?, institution_name=?, is_margin=?, remark=? where (confirm_id = ?)</tt>
	 *
	 *	@param FCreditConditionConfirm
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCreditConditionConfirmDO FCreditConditionConfirm) throws DataAccessException {
    	if (FCreditConditionConfirm == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CREDIT-CONDITION-CONFIRM-UPDATE", FCreditConditionConfirm);
    }

	/**
	 *  Update DB table <tt>f_credit_condition_confirm</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_condition_confirm set project_code=?, project_name=?, contract_no=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, time_limit=?, time_unit=?, amount=?, institution_id=?, institution_name=?, is_margin=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param FCreditConditionConfirm
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FCreditConditionConfirmDO FCreditConditionConfirm) throws DataAccessException {
    	if (FCreditConditionConfirm == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CREDIT-CONDITION-CONFIRM-UPDATE-BY-FORM-ID", FCreditConditionConfirm);
    }

	/**
	 *  Query DB table <tt>f_credit_condition_confirm</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return FCreditConditionConfirmDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmDO findById(long confirmId) throws DataAccessException {
        Long param = new Long(confirmId);

        return (FCreditConditionConfirmDO) getSqlMapClientTemplate().queryForObject("MS-F-CREDIT-CONDITION-CONFIRM-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_credit_condition_confirm</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCreditConditionConfirmDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FCreditConditionConfirmDO) getSqlMapClientTemplate().queryForObject("MS-F-CREDIT-CONDITION-CONFIRM-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_credit_condition_confirm</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FCreditConditionConfirmDO
	 *	@throws DataAccessException
	 */	 
    public FCreditConditionConfirmDO findByProjectCode(String projectCode) throws DataAccessException {

        return (FCreditConditionConfirmDO) getSqlMapClientTemplate().queryForObject("MS-F-CREDIT-CONDITION-CONFIRM-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_credit_condition_confirm</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_condition_confirm where (confirm_id = ?)</tt>
	 *
	 *	@param confirmId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long confirmId) throws DataAccessException {
        Long param = new Long(confirmId);

        return getSqlMapClientTemplate().delete("MS-F-CREDIT-CONDITION-CONFIRM-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_credit_condition_confirm</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_condition_confirm where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-CREDIT-CONDITION-CONFIRM-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Query DB table <tt>f_credit_condition_confirm</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_condition_confirm where (1 = 1)</tt>
	 *
	 *	@param FCreditConditionConfirm
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FCreditConditionConfirmDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditConditionConfirmDO> findByCondition(FCreditConditionConfirmDO FCreditConditionConfirm, long limitStart, long pageSize) throws DataAccessException {
    	if (FCreditConditionConfirm == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FCreditConditionConfirm", FCreditConditionConfirm);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-CREDIT-CONDITION-CONFIRM-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_credit_condition_confirm</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_credit_condition_confirm where (1 = 1)</tt>
	 *
	 *	@param FCreditConditionConfirm
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCreditConditionConfirmDO FCreditConditionConfirm) throws DataAccessException {
    	if (FCreditConditionConfirm == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-CREDIT-CONDITION-CONFIRM-FIND-BY-CONDITION-COUNT", FCreditConditionConfirm);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}