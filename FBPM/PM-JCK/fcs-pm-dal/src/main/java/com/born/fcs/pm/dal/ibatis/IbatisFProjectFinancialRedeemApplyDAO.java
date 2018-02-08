/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FProjectFinancialRedeemApplyDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectFinancialRedeemApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FProjectFinancialRedeemApplyDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_financial_redeem_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFProjectFinancialRedeemApplyDAO extends SqlMapClientDaoSupport implements FProjectFinancialRedeemApplyDAO {
	/**
	 *  Insert one <tt>FProjectFinancialRedeemApplyDO</tt> object to DB table <tt>f_project_financial_redeem_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_financial_redeem_apply(apply_id,form_id,project_code,hold_num,transfering_num,redeeming_num,redeem_price,redeem_num,redeem_principal,redeem_interest,redeem_reason,attach,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectFinancialRedeemApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectFinancialRedeemApplyDO FProjectFinancialRedeemApply) throws DataAccessException {
    	if (FProjectFinancialRedeemApply == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-INSERT", FProjectFinancialRedeemApply);

        return FProjectFinancialRedeemApply.getApplyId();
    }

	/**
	 *  Update DB table <tt>f_project_financial_redeem_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_financial_redeem_apply set form_id=?, project_code=?, hold_num=?, transfering_num=?, redeeming_num=?, redeem_price=?, redeem_num=?, redeem_principal=?, redeem_interest=?, redeem_reason=?, attach=? where (apply_id = ?)</tt>
	 *
	 *	@param FProjectFinancialRedeemApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectFinancialRedeemApplyDO FProjectFinancialRedeemApply) throws DataAccessException {
    	if (FProjectFinancialRedeemApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-UPDATE", FProjectFinancialRedeemApply);
    }

	/**
	 *  Query DB table <tt>f_project_financial_redeem_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_financial_redeem_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FProjectFinancialRedeemApplyDO
	 *	@throws DataAccessException
	 */	 
    public FProjectFinancialRedeemApplyDO findById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (FProjectFinancialRedeemApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_financial_redeem_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_financial_redeem_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FProjectFinancialRedeemApplyDO
	 *	@throws DataAccessException
	 */	 
    public FProjectFinancialRedeemApplyDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FProjectFinancialRedeemApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_project_financial_redeem_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_financial_redeem_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FProjectFinancialRedeemApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectFinancialRedeemApplyDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_project_financial_redeem_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_financial_redeem_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return getSqlMapClientTemplate().delete("MS-F-PROJECT-FINANCIAL-REDEEM-APPLY-DELETE-BY-ID", param);
    }

}