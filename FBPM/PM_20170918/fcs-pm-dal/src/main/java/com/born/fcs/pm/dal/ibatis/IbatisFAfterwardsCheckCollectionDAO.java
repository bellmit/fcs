/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FAfterwardsCheckCollectionDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckCollectionDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FAfterwardsCheckCollectionDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_collection.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFAfterwardsCheckCollectionDAO extends SqlMapClientDaoSupport implements FAfterwardsCheckCollectionDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckCollectionDO</tt> object to DB table <tt>f_afterwards_check_collection</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check_collection(form_id,collect_type,collect_item,collect_code,collected,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheckCollection
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckCollectionDO FAfterwardsCheckCollection) throws DataAccessException {
    	if (FAfterwardsCheckCollection == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-AFTERWARDS-CHECK-COLLECTION-INSERT", FAfterwardsCheckCollection);

        return FAfterwardsCheckCollection.getCollectId();
    }

	/**
	 *  Update DB table <tt>f_afterwards_check_collection</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_collection set form_id=?, collect_type=?, collect_item=?, collect_code=?, collected=?, sort_order=? where (collect_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckCollection
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckCollectionDO FAfterwardsCheckCollection) throws DataAccessException {
    	if (FAfterwardsCheckCollection == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-AFTERWARDS-CHECK-COLLECTION-UPDATE", FAfterwardsCheckCollection);
    }

	/**
	 *  Query DB table <tt>f_afterwards_check_collection</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_collection where (collect_id = ?)</tt>
	 *
	 *	@param collectId
	 *	@return FAfterwardsCheckCollectionDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckCollectionDO findById(long collectId) throws DataAccessException {
        Long param = new Long(collectId);

        return (FAfterwardsCheckCollectionDO) getSqlMapClientTemplate().queryForObject("MS-F-AFTERWARDS-CHECK-COLLECTION-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check_collection</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_collection where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return List<FAfterwardsCheckCollectionDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckCollectionDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-AFTERWARDS-CHECK-COLLECTION-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check_collection</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_collection where ((form_id = ?) AND (collect_type = ?))</tt>
	 *
	 *	@param formId
	 *	@param collectType
	 *	@return List<FAfterwardsCheckCollectionDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckCollectionDO> findByFormIdAndType(long formId, String collectType) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("collectType", collectType);

        return getSqlMapClientTemplate().queryForList("MS-F-AFTERWARDS-CHECK-COLLECTION-FIND-BY-FORM-ID-AND-TYPE", param);

    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_collection</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_collection where (collect_id = ?)</tt>
	 *
	 *	@param collectId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long collectId) throws DataAccessException {
        Long param = new Long(collectId);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-COLLECTION-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_collection</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_collection where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-COLLECTION-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_collection</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_collection where ((form_id = ?) AND (collect_type = ?))</tt>
	 *
	 *	@param formId
	 *	@param collectType
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormIdAndType(long formId, String collectType) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("collectType", collectType);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-COLLECTION-DELETE-BY-FORM-ID-AND-TYPE", param);
    }

}