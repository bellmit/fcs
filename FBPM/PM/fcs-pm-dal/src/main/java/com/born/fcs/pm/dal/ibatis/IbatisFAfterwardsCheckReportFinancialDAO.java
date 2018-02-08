/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FAfterwardsCheckReportFinancialDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FAfterwardsCheckReportFinancialDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FAfterwardsCheckReportFinancialDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_report_financial.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFAfterwardsCheckReportFinancialDAO extends SqlMapClientDaoSupport implements FAfterwardsCheckReportFinancialDAO {
	/**
	 *  Insert one <tt>FAfterwardsCheckReportFinancialDO</tt> object to DB table <tt>f_afterwards_check_report_financial</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_afterwards_check_report_financial(form_id,financial_type,financial_item,financial_name,origial_amount,item_balance,origial_count,origial_age,bad_debt_amount,construction_contract,refund_certificate,remark,del_able,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FAfterwardsCheckReportFinancial
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FAfterwardsCheckReportFinancialDO FAfterwardsCheckReportFinancial) throws DataAccessException {
    	if (FAfterwardsCheckReportFinancial == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-INSERT", FAfterwardsCheckReportFinancial);

        return FAfterwardsCheckReportFinancial.getFinancialId();
    }

	/**
	 *  Update DB table <tt>f_afterwards_check_report_financial</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_afterwards_check_report_financial set form_id=?, financial_type=?, financial_item=?, financial_name=?, origial_amount=?, item_balance=?, origial_count=?, origial_age=?, bad_debt_amount=?, construction_contract=?, refund_certificate=?, remark=?, del_able=?, sort_order=? where (financial_id = ?)</tt>
	 *
	 *	@param FAfterwardsCheckReportFinancial
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FAfterwardsCheckReportFinancialDO FAfterwardsCheckReportFinancial) throws DataAccessException {
    	if (FAfterwardsCheckReportFinancial == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-UPDATE", FAfterwardsCheckReportFinancial);
    }

	/**
	 *  Query DB table <tt>f_afterwards_check_report_financial</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_report_financial where (financial_id = ?)</tt>
	 *
	 *	@param financialId
	 *	@return FAfterwardsCheckReportFinancialDO
	 *	@throws DataAccessException
	 */	 
    public FAfterwardsCheckReportFinancialDO findById(long financialId) throws DataAccessException {
        Long param = new Long(financialId);

        return (FAfterwardsCheckReportFinancialDO) getSqlMapClientTemplate().queryForObject("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check_report_financial</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_report_financial where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FAfterwardsCheckReportFinancialDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckReportFinancialDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_afterwards_check_report_financial</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_afterwards_check_report_financial where ((form_id = ?) AND (financial_type = ?)) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@param financialType
	 *	@return List<FAfterwardsCheckReportFinancialDO>
	 *	@throws DataAccessException
	 */	 
    public List<FAfterwardsCheckReportFinancialDO> findByFormIdAndFinancilType(long formId, String financialType) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("financialType", financialType);

        return getSqlMapClientTemplate().queryForList("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-FIND-BY-FORM-ID-AND-FINANCIL-TYPE", param);

    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_report_financial</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_report_financial where (financial_id = ?)</tt>
	 *
	 *	@param financialId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long financialId) throws DataAccessException {
        Long param = new Long(financialId);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_report_financial</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_report_financial where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_afterwards_check_report_financial</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_afterwards_check_report_financial where ((form_id = ?) AND (financial_type = ?))</tt>
	 *
	 *	@param formId
	 *	@param financialType
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormIdAndFinancilType(long formId, String financialType) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("financialType", financialType);

        return getSqlMapClientTemplate().delete("MS-F-AFTERWARDS-CHECK-REPORT-FINANCIAL-DELETE-BY-FORM-ID-AND-FINANCIL-TYPE", param);
    }

}