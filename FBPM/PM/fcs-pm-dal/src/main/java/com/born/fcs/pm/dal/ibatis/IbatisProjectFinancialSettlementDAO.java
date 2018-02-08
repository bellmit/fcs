/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectFinancialSettlementDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectFinancialSettlementDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import com.yjf.common.lang.util.money.Money;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectFinancialSettlementDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_financial_settlement.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectFinancialSettlementDAO extends SqlMapClientDaoSupport implements ProjectFinancialSettlementDAO {
	/**
	 *  Insert one <tt>ProjectFinancialSettlementDO</tt> object to DB table <tt>project_financial_settlement</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_financial_settlement(settlement_id,project_code,original_code,product_id,product_name,settlement_amount,settlement_time,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectFinancialSettlement
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectFinancialSettlementDO projectFinancialSettlement) throws DataAccessException {
    	if (projectFinancialSettlement == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-FINANCIAL-SETTLEMENT-INSERT", projectFinancialSettlement);

        return projectFinancialSettlement.getSettlementId();
    }

	/**
	 *  Update DB table <tt>project_financial_settlement</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_financial_settlement set project_code=?, original_code=?, product_id=?, product_name=?, settlement_amount=?, settlement_time=? where (settlement_id = ?)</tt>
	 *
	 *	@param projectFinancialSettlement
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectFinancialSettlementDO projectFinancialSettlement) throws DataAccessException {
    	if (projectFinancialSettlement == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-FINANCIAL-SETTLEMENT-UPDATE", projectFinancialSettlement);
    }

	/**
	 *  Query DB table <tt>project_financial_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_settlement where (1 = 1)</tt>
	 *
	 *	@param projectFinancialSettlement
	 *	@param settlementTimeStart
	 *	@param settlementTimeEnd
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectFinancialSettlementDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectFinancialSettlementDO> findByCondition(ProjectFinancialSettlementDO projectFinancialSettlement, Date settlementTimeStart, Date settlementTimeEnd, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (projectFinancialSettlement == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectFinancialSettlement", projectFinancialSettlement);
        param.put("settlementTimeStart", settlementTimeStart);
        param.put("settlementTimeEnd", settlementTimeEnd);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-FINANCIAL-SETTLEMENT-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>project_financial_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_financial_settlement where (1 = 1)</tt>
	 *
	 *	@param projectFinancialSettlement
	 *	@param settlementTimeStart
	 *	@param settlementTimeEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectFinancialSettlementDO projectFinancialSettlement, Date settlementTimeStart, Date settlementTimeEnd) throws DataAccessException {
    	if (projectFinancialSettlement == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectFinancialSettlement", projectFinancialSettlement);
        param.put("settlementTimeStart", settlementTimeStart);
        param.put("settlementTimeEnd", settlementTimeEnd);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FINANCIAL-SETTLEMENT-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>project_financial_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select sum(settlement_amount) from project_financial_settlement where (1 = 1)</tt>
	 *
	 *	@param projectFinancialSettlement
	 *	@param settlementTimeStart
	 *	@param settlementTimeEnd
	 *	@return Money
	 *	@throws DataAccessException
	 */	 
    public Money findByConditionStatistics(ProjectFinancialSettlementDO projectFinancialSettlement, Date settlementTimeStart, Date settlementTimeEnd) throws DataAccessException {
    	if (projectFinancialSettlement == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectFinancialSettlement", projectFinancialSettlement);
        param.put("settlementTimeStart", settlementTimeStart);
        param.put("settlementTimeEnd", settlementTimeEnd);

        return (Money) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FINANCIAL-SETTLEMENT-FIND-BY-CONDITION-STATISTICS", param);

    }

}