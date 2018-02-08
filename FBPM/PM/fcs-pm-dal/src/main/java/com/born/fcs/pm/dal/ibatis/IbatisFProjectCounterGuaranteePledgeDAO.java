/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FProjectCounterGuaranteePledgeDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectCounterGuaranteePledgeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FProjectCounterGuaranteePledgeDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_counter_guarantee_pledge.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFProjectCounterGuaranteePledgeDAO extends SqlMapClientDaoSupport implements FProjectCounterGuaranteePledgeDAO {
	/**
	 *  Insert one <tt>FProjectCounterGuaranteePledgeDO</tt> object to DB table <tt>f_project_counter_guarantee_pledge</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_counter_guarantee_pledge(form_id,project_code,project_name,customer_id,customer_name,type,pledger,pledge_type,pledge_name,net_value,syn_position,postposition,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteePledge
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectCounterGuaranteePledgeDO FProjectCounterGuaranteePledge) throws DataAccessException {
    	if (FProjectCounterGuaranteePledge == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-INSERT", FProjectCounterGuaranteePledge);

        return FProjectCounterGuaranteePledge.getId();
    }

	/**
	 *  Update DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_counter_guarantee_pledge set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, type=?, pledger=?, pledge_type=?, pledge_name=?, net_value=?, syn_position=?, postposition=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteePledge
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectCounterGuaranteePledgeDO FProjectCounterGuaranteePledge) throws DataAccessException {
    	if (FProjectCounterGuaranteePledge == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-UPDATE", FProjectCounterGuaranteePledge);
    }

	/**
	 *  Update DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_counter_guarantee_pledge set project_code=?, project_name=?, customer_id=?, customer_name=? where (form_id = ?)</tt>
	 *
	 *	@param FProjectCounterGuaranteePledge
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateProjectAndCustomerInfoByFormId(FProjectCounterGuaranteePledgeDO FProjectCounterGuaranteePledge) throws DataAccessException {
    	if (FProjectCounterGuaranteePledge == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-UPDATE-PROJECT-AND-CUSTOMER-INFO-BY-FORM-ID", FProjectCounterGuaranteePledge);
    }

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_pledge</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_pledge where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectCounterGuaranteePledgeDO
	 *	@throws DataAccessException
	 */	 
    public FProjectCounterGuaranteePledgeDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FProjectCounterGuaranteePledgeDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_pledge</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_pledge where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FProjectCounterGuaranteePledgeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteePledgeDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_pledge</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_pledge where ((form_id = ?) AND (type = ?))</tt>
	 *
	 *	@param formId
	 *	@param type
	 *	@return List<FProjectCounterGuaranteePledgeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteePledgeDO> findByFormIdAndType(long formId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("type", type);

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-FIND-BY-FORM-ID-AND-TYPE", param);

    }

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_pledge</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_pledge where (project_code = ?) order by sort_order ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FProjectCounterGuaranteePledgeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteePledgeDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Query DB table <tt>f_project_counter_guarantee_pledge</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_counter_guarantee_pledge where ((project_code = ?) AND (type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param type
	 *	@return List<FProjectCounterGuaranteePledgeDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectCounterGuaranteePledgeDO> findByProjectCodeAndType(String projectCode, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("type", type);

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-FIND-BY-PROJECT-CODE-AND-TYPE", param);

    }

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_pledge where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_pledge where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_pledge where ((form_id = ?) AND (type = ?))</tt>
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

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-DELETE-BY-FORM-ID-AND-TYPE", param);
    }

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_pledge where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-DELETE-BY-PROJECT-CODE", projectCode);
    }

	/**
	 *  Delete records from DB table <tt>f_project_counter_guarantee_pledge</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_counter_guarantee_pledge where ((project_code = ?) AND (type = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param type
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCodeAndType(String projectCode, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("type", type);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-COUNTER-GUARANTEE-PLEDGE-DELETE-BY-PROJECT-CODE-AND-TYPE", param);
    }

}