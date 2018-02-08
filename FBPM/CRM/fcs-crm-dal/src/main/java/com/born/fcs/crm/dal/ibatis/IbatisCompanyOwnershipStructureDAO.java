/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.crm.dal.daointerface.CompanyOwnershipStructureDAO;


// auto generated imports
import com.born.fcs.crm.dal.dataobject.CompanyOwnershipStructureDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.crm.dal.daointerface.CompanyOwnershipStructureDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/company_ownership_structure.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisCompanyOwnershipStructureDAO extends SqlMapClientDaoSupport implements CompanyOwnershipStructureDAO {
	/**
	 *  Insert one <tt>CompanyOwnershipStructureDO</tt> object to DB table <tt>company_ownership_structure</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into company_ownership_structure(id,customer_id,perents,shareholders_name,amount,amount_type,methord,equity,memo,status,perent_id,child_id,is_temporary,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param companyOwnershipStructure
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CompanyOwnershipStructureDO companyOwnershipStructure) throws DataAccessException {
    	if (companyOwnershipStructure == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-COMPANY-OWNERSHIP-STRUCTURE-INSERT", companyOwnershipStructure);

        return companyOwnershipStructure.getId();
    }

	/**
	 *  Query DB table <tt>company_ownership_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_id, perents, shareholders_name, amount, amount_type, methord, equity, memo, status, perent_id, child_id, is_temporary, raw_add_time, raw_update_time from company_ownership_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CompanyOwnershipStructureDO
	 *	@throws DataAccessException
	 */	 
    public CompanyOwnershipStructureDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (CompanyOwnershipStructureDO) getSqlMapClientTemplate().queryForObject("MS-COMPANY-OWNERSHIP-STRUCTURE-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>company_ownership_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id from company_ownership_structure where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return List<Long>
	 *	@throws DataAccessException
	 */	 
    public List<Long> findByAllIds(String customerId) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-COMPANY-OWNERSHIP-STRUCTURE-FIND-BY-ALL-IDS", customerId);

    }

	/**
	 *  Delete records from DB table <tt>company_ownership_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from company_ownership_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-COMPANY-OWNERSHIP-STRUCTURE-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>company_ownership_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from company_ownership_structure where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCustomerId(String customerId) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-COMPANY-OWNERSHIP-STRUCTURE-DELETE-BY-CUSTOMER-ID", customerId);
    }

	/**
	 *  Update DB table <tt>company_ownership_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update company_ownership_structure set customer_id=?, perents=?, shareholders_name=?, amount=?, amount_type=?, methord=?, equity=?, memo=?, status=?, perent_id=?, child_id=?, is_temporary=? where (id = ?)</tt>
	 *
	 *	@param companyOwnershipStructure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CompanyOwnershipStructureDO companyOwnershipStructure) throws DataAccessException {
    	if (companyOwnershipStructure == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-COMPANY-OWNERSHIP-STRUCTURE-UPDATE", companyOwnershipStructure);
    }

	/**
	 *  Query DB table <tt>company_ownership_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_id, perents, shareholders_name, amount, amount_type, methord, equity, memo, status, perent_id, child_id, is_temporary, raw_add_time, raw_update_time from company_ownership_structure</tt>
	 *
	 *	@param companyOwnershipStructure
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CompanyOwnershipStructureDO>
	 *	@throws DataAccessException
	 */	 
    public List<CompanyOwnershipStructureDO> findWithCondition(CompanyOwnershipStructureDO companyOwnershipStructure, long limitStart, long pageSize) throws DataAccessException {
    	if (companyOwnershipStructure == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("companyOwnershipStructure", companyOwnershipStructure);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-COMPANY-OWNERSHIP-STRUCTURE-FIND-WITH-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>company_ownership_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from company_ownership_structure</tt>
	 *
	 *	@param companyOwnershipStructure
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long countWithCondition(CompanyOwnershipStructureDO companyOwnershipStructure) throws DataAccessException {
    	if (companyOwnershipStructure == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-COMPANY-OWNERSHIP-STRUCTURE-COUNT-WITH-CONDITION", companyOwnershipStructure);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}