/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FRefundApplicationFeeDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRefundApplicationFeeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FRefundApplicationFeeDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_refund_application_fee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFRefundApplicationFeeDAO extends SqlMapClientDaoSupport implements FRefundApplicationFeeDAO {
	/**
	 *  Insert one <tt>FRefundApplicationFeeDO</tt> object to DB table <tt>f_refund_application_fee</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_refund_application_fee(refund_id,refund_reason,refund_amount,remark,basis_of_decision,basis_of_decision_type,form_change,risk_council_summary,project_approval,contract,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FRefundApplicationFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FRefundApplicationFeeDO FRefundApplicationFee) throws DataAccessException {
    	if (FRefundApplicationFee == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-REFUND-APPLICATION-FEE-INSERT", FRefundApplicationFee);

        return FRefundApplicationFee.getId();
    }

	/**
	 *  Update DB table <tt>f_refund_application_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_refund_application_fee set refund_id=?, refund_reason=?, refund_amount=?, remark=?, basis_of_decision=?, basis_of_decision_type=?, form_change=?, risk_council_summary=?, project_approval=?, contract=? where (id = ?)</tt>
	 *
	 *	@param FRefundApplicationFee
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FRefundApplicationFeeDO FRefundApplicationFee) throws DataAccessException {
    	if (FRefundApplicationFee == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-REFUND-APPLICATION-FEE-UPDATE", FRefundApplicationFee);
    }

	/**
	 *  Query DB table <tt>f_refund_application_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application_fee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FRefundApplicationFeeDO
	 *	@throws DataAccessException
	 */	 
    public FRefundApplicationFeeDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FRefundApplicationFeeDO) getSqlMapClientTemplate().queryForObject("MS-F-REFUND-APPLICATION-FEE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_refund_application_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application_fee where (refund_id = ?)</tt>
	 *
	 *	@param refundId
	 *	@return List<FRefundApplicationFeeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRefundApplicationFeeDO> findByRefundId(long refundId) throws DataAccessException {
        Long param = new Long(refundId);

        return getSqlMapClientTemplate().queryForList("MS-F-REFUND-APPLICATION-FEE-FIND-BY-REFUND-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_refund_application_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_refund_application_fee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-REFUND-APPLICATION-FEE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_refund_application_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_refund_application_fee where (refund_id = ?)</tt>
	 *
	 *	@param refundId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRefundId(long refundId) throws DataAccessException {
        Long param = new Long(refundId);

        return getSqlMapClientTemplate().delete("MS-F-REFUND-APPLICATION-FEE-DELETE-BY-REFUND-ID", param);
    }

	/**
	 *  Query DB table <tt>f_refund_application_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application_fee where (1 = 1)</tt>
	 *
	 *	@param FRefundApplicationFee
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FRefundApplicationFeeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRefundApplicationFeeDO> findByCondition(FRefundApplicationFeeDO FRefundApplicationFee, long limitStart, long pageSize) throws DataAccessException {
    	if (FRefundApplicationFee == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FRefundApplicationFee", FRefundApplicationFee);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-REFUND-APPLICATION-FEE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_refund_application_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_refund_application_fee where (1 = 1)</tt>
	 *
	 *	@param FRefundApplicationFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FRefundApplicationFeeDO FRefundApplicationFee) throws DataAccessException {
    	if (FRefundApplicationFee == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-REFUND-APPLICATION-FEE-FIND-BY-CONDITION-COUNT", FRefundApplicationFee);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}