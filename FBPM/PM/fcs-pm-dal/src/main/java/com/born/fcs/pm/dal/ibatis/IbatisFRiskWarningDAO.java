/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FRiskWarningDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRiskWarningDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FRiskWarningDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_risk_warning.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFRiskWarningDAO extends SqlMapClientDaoSupport implements FRiskWarningDAO {
	/**
	 *  Insert one <tt>FRiskWarningDO</tt> object to DB table <tt>f_risk_warning</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_risk_warning(form_id,warning_bill_type,customer_id,customer_name,signal_level,special_signal,special_signal_desc,nomal_signal,nomal_signal_desc,risk_signal_detail,risk_measure,lifting_reason,src_waning_id,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FRiskWarning
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FRiskWarningDO FRiskWarning) throws DataAccessException {
    	if (FRiskWarning == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-RISK-WARNING-INSERT", FRiskWarning);

        return FRiskWarning.getWarningId();
    }

	/**
	 *  Update DB table <tt>f_risk_warning</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_risk_warning set form_id=?, customer_id=?, customer_name=?, signal_level=?, special_signal=?, special_signal_desc=?, nomal_signal=?, nomal_signal_desc=?, risk_signal_detail=?, risk_measure=?, lifting_reason=? where (warning_id = ?)</tt>
	 *
	 *	@param FRiskWarning
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FRiskWarningDO FRiskWarning) throws DataAccessException {
    	if (FRiskWarning == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-RISK-WARNING-UPDATE", FRiskWarning);
    }

	/**
	 *  Update DB table <tt>f_risk_warning</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_risk_warning set customer_id=?, customer_name=?, signal_level=?, special_signal=?, special_signal_desc=?, nomal_signal=?, nomal_signal_desc=?, risk_signal_detail=?, risk_measure=?, lifting_reason=? where (form_id = ?)</tt>
	 *
	 *	@param FRiskWarning
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FRiskWarningDO FRiskWarning) throws DataAccessException {
    	if (FRiskWarning == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-RISK-WARNING-UPDATE-BY-FORM-ID", FRiskWarning);
    }

	/**
	 *  Query DB table <tt>f_risk_warning</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_warning where (warning_id = ?)</tt>
	 *
	 *	@param warningId
	 *	@return FRiskWarningDO
	 *	@throws DataAccessException
	 */	 
    public FRiskWarningDO findById(long warningId) throws DataAccessException {
        Long param = new Long(warningId);

        return (FRiskWarningDO) getSqlMapClientTemplate().queryForObject("MS-F-RISK-WARNING-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_risk_warning</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_risk_warning where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FRiskWarningDO
	 *	@throws DataAccessException
	 */	 
    public FRiskWarningDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FRiskWarningDO) getSqlMapClientTemplate().queryForObject("MS-F-RISK-WARNING-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_risk_warning</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_warning where (warning_id = ?)</tt>
	 *
	 *	@param warningId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long warningId) throws DataAccessException {
        Long param = new Long(warningId);

        return getSqlMapClientTemplate().delete("MS-F-RISK-WARNING-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_risk_warning</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_risk_warning where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-RISK-WARNING-DELETE-BY-FORM-ID", param);
    }

}