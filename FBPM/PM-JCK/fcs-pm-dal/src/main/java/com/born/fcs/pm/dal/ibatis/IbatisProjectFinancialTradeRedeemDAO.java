/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectFinancialTradeRedeemDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectFinancialTradeRedeemDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectFinancialTradeRedeemDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_financial_trade_redeem.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectFinancialTradeRedeemDAO extends SqlMapClientDaoSupport implements ProjectFinancialTradeRedeemDAO {
	/**
	 *  Insert one <tt>ProjectFinancialTradeRedeemDO</tt> object to DB table <tt>project_financial_trade_redeem</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_financial_trade_redeem(trade_id,flow_no,project_code,apply_id,redeem_price,redeem_num,redeem_principal,redeem_interest,redeem_interest_rate,redeem_time,redeem_reason,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectFinancialTradeRedeem
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectFinancialTradeRedeemDO projectFinancialTradeRedeem) throws DataAccessException {
    	if (projectFinancialTradeRedeem == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-FINANCIAL-TRADE-REDEEM-INSERT", projectFinancialTradeRedeem);

        return projectFinancialTradeRedeem.getTradeId();
    }

	/**
	 *  Update DB table <tt>project_financial_trade_redeem</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_financial_trade_redeem set flow_no=?, project_code=?, apply_id=?, redeem_price=?, redeem_num=?, redeem_principal=?, redeem_interest=?, redeem_interest_rate=?, redeem_time=?, redeem_reason=?, attach=? where (trade_id = ?)</tt>
	 *
	 *	@param projectFinancialTradeRedeem
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectFinancialTradeRedeemDO projectFinancialTradeRedeem) throws DataAccessException {
    	if (projectFinancialTradeRedeem == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-FINANCIAL-TRADE-REDEEM-UPDATE", projectFinancialTradeRedeem);
    }

	/**
	 *  Query DB table <tt>project_financial_trade_redeem</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_redeem where (trade_id = ?)</tt>
	 *
	 *	@param tradeId
	 *	@return ProjectFinancialTradeRedeemDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialTradeRedeemDO findById(long tradeId) throws DataAccessException {
        Long param = new Long(tradeId);

        return (ProjectFinancialTradeRedeemDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FINANCIAL-TRADE-REDEEM-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_financial_trade_redeem</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_redeem where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return ProjectFinancialTradeRedeemDO
	 *	@throws DataAccessException
	 */	 
    public ProjectFinancialTradeRedeemDO findByApplyId(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (ProjectFinancialTradeRedeemDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FINANCIAL-TRADE-REDEEM-FIND-BY-APPLY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_financial_trade_redeem</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_financial_trade_redeem where (trade_id = ?)</tt>
	 *
	 *	@param tradeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long tradeId) throws DataAccessException {
        Long param = new Long(tradeId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-FINANCIAL-TRADE-REDEEM-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_financial_trade_redeem</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_financial_trade_redeem where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-PROJECT-FINANCIAL-TRADE-REDEEM-DELETE-BY-CODE", projectCode);
    }

	/**
	 *  Query DB table <tt>project_financial_trade_redeem</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_financial_trade_redeem where (1 = 1)</tt>
	 *
	 *	@param projectFinancialTradeRedeem
	 *	@param redeemTimeStart
	 *	@param redeemTimeEnd
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectFinancialTradeRedeemDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectFinancialTradeRedeemDO> findByCondition(ProjectFinancialTradeRedeemDO projectFinancialTradeRedeem, Date redeemTimeStart, Date redeemTimeEnd, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (projectFinancialTradeRedeem == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectFinancialTradeRedeem", projectFinancialTradeRedeem);
        param.put("redeemTimeStart", redeemTimeStart);
        param.put("redeemTimeEnd", redeemTimeEnd);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-FINANCIAL-TRADE-REDEEM-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>project_financial_trade_redeem</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_financial_trade_redeem where (1 = 1)</tt>
	 *
	 *	@param projectFinancialTradeRedeem
	 *	@param redeemTimeStart
	 *	@param redeemTimeEnd
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectFinancialTradeRedeemDO projectFinancialTradeRedeem, Date redeemTimeStart, Date redeemTimeEnd) throws DataAccessException {
    	if (projectFinancialTradeRedeem == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectFinancialTradeRedeem", projectFinancialTradeRedeem);
        param.put("redeemTimeStart", redeemTimeStart);
        param.put("redeemTimeEnd", redeemTimeEnd);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-FINANCIAL-TRADE-REDEEM-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}