/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.am.dal.daointerface.PledgeTypeAttributeDAO;


// auto generated imports
import com.born.fcs.am.dal.dataobject.PledgeTypeAttributeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.am.dal.daointerface.PledgeTypeAttributeDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/pledge_type_attribute.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPledgeTypeAttributeDAO extends SqlMapClientDaoSupport implements PledgeTypeAttributeDAO {
	/**
	 *  Insert one <tt>PledgeTypeAttributeDO</tt> object to DB table <tt>pledge_type_attribute</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into pledge_type_attribute(assets_id,type_id,attribute_key,attribute_value,custom_type,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param pledgeTypeAttribute
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PledgeTypeAttributeDO pledgeTypeAttribute) throws DataAccessException {
    	if (pledgeTypeAttribute == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PLEDGE-TYPE-ATTRIBUTE-INSERT", pledgeTypeAttribute);

        return pledgeTypeAttribute.getAttributeId();
    }

	/**
	 *  Update DB table <tt>pledge_type_attribute</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update pledge_type_attribute set assets_id=?, type_id=?, attribute_key=?, attribute_value=?, custom_type=? where (attribute_id = ?)</tt>
	 *
	 *	@param pledgeTypeAttribute
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PledgeTypeAttributeDO pledgeTypeAttribute) throws DataAccessException {
    	if (pledgeTypeAttribute == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PLEDGE-TYPE-ATTRIBUTE-UPDATE", pledgeTypeAttribute);
    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where (attribute_id = ?)</tt>
	 *
	 *	@param attributeId
	 *	@return PledgeTypeAttributeDO
	 *	@throws DataAccessException
	 */	 
    public PledgeTypeAttributeDO findById(long attributeId) throws DataAccessException {
        Long param = new Long(attributeId);

        return (PledgeTypeAttributeDO) getSqlMapClientTemplate().queryForObject("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where ((assets_id = ?) AND (attribute_key = ?) AND (custom_type = ?))</tt>
	 *
	 *	@param assetsId
	 *	@param attributeKey
	 *	@param customType
	 *	@return PledgeTypeAttributeDO
	 *	@throws DataAccessException
	 */	 
    public PledgeTypeAttributeDO findByassetsIdAndAttributeKeyAndCustomType(long assetsId, String attributeKey, String customType) throws DataAccessException {
        Map param = new HashMap();

        param.put("assetsId", new Long(assetsId));
        param.put("attributeKey", attributeKey);
        param.put("customType", customType);

        return (PledgeTypeAttributeDO) getSqlMapClientTemplate().queryForObject("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BYASSETS-ID-AND-ATTRIBUTE-KEY-AND-CUSTOM-TYPE", param);

    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where (type_id = ?)</tt>
	 *
	 *	@param typeId
	 *	@return List<PledgeTypeAttributeDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeTypeAttributeDO> findByTypeId(long typeId) throws DataAccessException {
        Long param = new Long(typeId);

        return getSqlMapClientTemplate().queryForList("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-TYPE-ID", param);

    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where ((type_id = ?) AND (custom_type = ?))</tt>
	 *
	 *	@param typeId
	 *	@param customType
	 *	@return List<PledgeTypeAttributeDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeTypeAttributeDO> findByTypeIdAndCustomType(long typeId, String customType) throws DataAccessException {
        Map param = new HashMap();

        param.put("typeId", new Long(typeId));
        param.put("customType", customType);

        return getSqlMapClientTemplate().queryForList("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-TYPE-ID-AND-CUSTOM-TYPE", param);

    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where ((type_id = ?) AND (custom_type = ?) AND (attribute_key = ?))</tt>
	 *
	 *	@param typeId
	 *	@param customType
	 *	@param attributeKey
	 *	@return List<PledgeTypeAttributeDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeTypeAttributeDO> findByTypeIdAndCustomTypeAndAttributeKey(long typeId, String customType, String attributeKey) throws DataAccessException {
        Map param = new HashMap();

        param.put("typeId", new Long(typeId));
        param.put("customType", customType);
        param.put("attributeKey", attributeKey);

        return getSqlMapClientTemplate().queryForList("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-TYPE-ID-AND-CUSTOM-TYPE-AND-ATTRIBUTE-KEY", param);

    }

	/**
	 *  Delete records from DB table <tt>pledge_type_attribute</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from pledge_type_attribute where (attribute_id = ?)</tt>
	 *
	 *	@param attributeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long attributeId) throws DataAccessException {
        Long param = new Long(attributeId);

        return getSqlMapClientTemplate().delete("MS-PLEDGE-TYPE-ATTRIBUTE-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from pledge_type_attribute where (1 = 1)</tt>
	 *
	 *	@param pledgeTypeAttribute
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PledgeTypeAttributeDO>
	 *	@throws DataAccessException
	 */	 
    public List<PledgeTypeAttributeDO> findByCondition(PledgeTypeAttributeDO pledgeTypeAttribute, long limitStart, long pageSize) throws DataAccessException {
    	if (pledgeTypeAttribute == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("pledgeTypeAttribute", pledgeTypeAttribute);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>pledge_type_attribute</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from pledge_type_attribute where (1 = 1)</tt>
	 *
	 *	@param pledgeTypeAttribute
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PledgeTypeAttributeDO pledgeTypeAttribute) throws DataAccessException {
    	if (pledgeTypeAttribute == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PLEDGE-TYPE-ATTRIBUTE-FIND-BY-CONDITION-COUNT", pledgeTypeAttribute);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}