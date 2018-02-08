/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemeProcessControlDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationCreditSchemeProcessControlDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemeProcessControlDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_credit_scheme_process_control.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFInvestigationCreditSchemeProcessControlDAO extends SqlMapClientDaoSupport implements FInvestigationCreditSchemeProcessControlDAO {
	/**
	 *  Insert one <tt>FInvestigationCreditSchemeProcessControlDO</tt> object to DB table <tt>f_investigation_credit_scheme_process_control</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_credit_scheme_process_control(form_id,type,up_rate,up_bp,down_rate,down_bp,content,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemeProcessControl
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationCreditSchemeProcessControlDO FInvestigationCreditSchemeProcessControl) throws DataAccessException {
    	if (FInvestigationCreditSchemeProcessControl == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-INSERT", FInvestigationCreditSchemeProcessControl);

        return FInvestigationCreditSchemeProcessControl.getId();
    }

	/**
	 *  Update DB table <tt>f_investigation_credit_scheme_process_control</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_credit_scheme_process_control set form_id=?, type=?, up_rate=?, up_bp=?, down_rate=?, down_bp=?, content=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemeProcessControl
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationCreditSchemeProcessControlDO FInvestigationCreditSchemeProcessControl) throws DataAccessException {
    	if (FInvestigationCreditSchemeProcessControl == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-UPDATE", FInvestigationCreditSchemeProcessControl);
    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_process_control</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_process_control where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationCreditSchemeProcessControlDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCreditSchemeProcessControlDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FInvestigationCreditSchemeProcessControlDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_process_control</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_process_control where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return List<FInvestigationCreditSchemeProcessControlDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCreditSchemeProcessControlDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_process_control</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_process_control where ((form_id = ?) AND (type = ?))</tt>
	 *
	 *	@param formId
	 *	@param type
	 *	@return List<FInvestigationCreditSchemeProcessControlDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCreditSchemeProcessControlDO> findByFormIdAndType(long formId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("type", type);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-FIND-BY-FORM-ID-AND-TYPE", param);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_process_control</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_process_control where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_process_control</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_process_control where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_process_control</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_process_control where ((form_id = ?) AND (type = ?))</tt>
	 *
	 *	@param formId
	 *	@param type
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormIdAndType(long formId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("type", type);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-PROCESS-CONTROL-DELETE-BY-FORM-ID-AND-TYPE", param);
    }

}