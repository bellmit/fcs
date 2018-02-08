/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.ChangeListDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.ChangeListDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.ChangeListDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/change_list.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisChangeListDAO extends SqlMapClientDaoSupport implements ChangeListDAO {
	/**
	 *  Insert one <tt>ChangeListDO</tt> object to DB table <tt>change_list</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into change_list(change_id,customer_user_id,oper_name,oper_id,form_id,change_type,data_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param changeList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ChangeListDO changeList) throws DataAccessException {
    	if (changeList == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CHANGE-LIST-INSERT", changeList);

        return changeList.getChangeId();
    }

	/**
	 *  Query DB table <tt>change_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select change_id, customer_user_id, oper_name, oper_id, form_id, change_type, data_type, raw_add_time, raw_update_time from change_list where (change_id = ?)</tt>
	 *
	 *	@param changeId
	 *	@return ChangeListDO
	 *	@throws DataAccessException
	 */	 
    public ChangeListDO findById(long changeId) throws DataAccessException {
        Long param = new Long(changeId);

        return (ChangeListDO) getSqlMapClientTemplate().queryForObject("MS-CHANGE-LIST-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>change_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from change_list where (change_id = ?)</tt>
	 *
	 *	@param changeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long changeId) throws DataAccessException {
        Long param = new Long(changeId);

        return getSqlMapClientTemplate().delete("MS-CHANGE-LIST-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>change_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select change_id, customer_user_id, oper_name, oper_id, form_id, change_type, data_type, raw_add_time, raw_update_time from change_list</tt>
	 *
	 *	@param changeList
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ChangeListDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChangeListDO> findWithCondition(ChangeListDO changeList, long limitStart, long pageSize) throws DataAccessException {
    	if (changeList == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("changeList", changeList);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-CHANGE-LIST-FIND-WITH-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>change_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from change_list</tt>
	 *
	 *	@param changeList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long countWithCondition(ChangeListDO changeList) throws DataAccessException {
    	if (changeList == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-CHANGE-LIST-COUNT-WITH-CONDITION", changeList);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}