/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ViewProjectIndirectCustomerDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ViewProjectIndirectCustomerDO;
import java.util.List;
import org.springframework.dao.DataAccessException;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ViewProjectIndirectCustomerDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/view_project_indirect_customer.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisViewProjectIndirectCustomerDAO extends SqlMapClientDaoSupport implements ViewProjectIndirectCustomerDAO {
	/**
	 *  Query DB table <tt>view_project_indirect_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select project_code, indirect_customer_name, customer_role, phases from view_project_indirect_customer</tt>
	 *
	 *	@param viewProjectIndirectCustomer
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ViewProjectIndirectCustomerDO>
	 *	@throws DataAccessException
	 */	 
    public List<ViewProjectIndirectCustomerDO> findByCondition(ViewProjectIndirectCustomerDO viewProjectIndirectCustomer, long limitStart, long pageSize) throws DataAccessException {
    	if (viewProjectIndirectCustomer == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("viewProjectIndirectCustomer", viewProjectIndirectCustomer);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-VIEW-PROJECT-INDIRECT-CUSTOMER-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>view_project_indirect_customer</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from view_project_indirect_customer</tt>
	 *
	 *	@param viewProjectIndirectCustomer
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ViewProjectIndirectCustomerDO viewProjectIndirectCustomer) throws DataAccessException {
    	if (viewProjectIndirectCustomer == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-VIEW-PROJECT-INDIRECT-CUSTOMER-FIND-BY-CONDITION-COUNT", viewProjectIndirectCustomer);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}