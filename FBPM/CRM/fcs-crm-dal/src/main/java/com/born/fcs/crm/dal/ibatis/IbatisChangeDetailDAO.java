/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.ChangeDetailDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.ChangeDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.ChangeDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/change_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisChangeDetailDAO extends SqlMapClientDaoSupport implements ChangeDetailDAO {
	/**
	 *  Insert one <tt>ChangeDetailDO</tt> object to DB table <tt>change_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into change_detail(detail_id,change_id,lable_name,lable_key,old_value,new_value,detail_type) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param changeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ChangeDetailDO changeDetail) throws DataAccessException {
    	if (changeDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CHANGE-DETAIL-INSERT", changeDetail);

        return changeDetail.getDetailId();
    }

	/**
	 *  Query DB table <tt>change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select detail_id, change_id, lable_name, lable_key, old_value, new_value, detail_type from change_detail</tt>
	 *
	 *	@param changeDetail
	 *	@return List<ChangeDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChangeDetailDO> findWithCondition(ChangeDetailDO changeDetail) throws DataAccessException {
    	if (changeDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


        return getSqlMapClientTemplate().queryForList("MS-CHANGE-DETAIL-FIND-WITH-CONDITION", changeDetail);

    }

	/**
	 *  Query DB table <tt>change_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from channal_info</tt>
	 *
	 *	@param changeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long countWithCondition(ChangeDetailDO changeDetail) throws DataAccessException {
    	if (changeDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-CHANGE-DETAIL-COUNT-WITH-CONDITION", changeDetail);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}