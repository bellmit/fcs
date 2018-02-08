/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FLoanUseApplyDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FLoanUseApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FLoanUseApplyDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_loan_use_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFLoanUseApplyDAO extends SqlMapClientDaoSupport implements FLoanUseApplyDAO {
	/**
	 *  Insert one <tt>FLoanUseApplyDO</tt> object to DB table <tt>f_loan_use_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_loan_use_apply(apply_id,form_id,project_code,notification_id,apply_type,amount,original_amount,loaned_amount,used_amount,released_amount,applying_loan_amount,applying_use_amount,is_maximum_amount,expect_loan_date,remark,cash_deposit_amount,cash_deposit_bank,cash_deposit_time_limit,cash_deposit_time_unit,cash_deposit_ratio,cash_deposit_end_time,busi_manager_statement,receipt_name,receipt_bank,receipt_account,interest_settlement_cycle,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FLoanUseApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FLoanUseApplyDO FLoanUseApply) throws DataAccessException {
    	if (FLoanUseApply == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-LOAN-USE-APPLY-INSERT", FLoanUseApply);

        return FLoanUseApply.getApplyId();
    }

	/**
	 *  Update DB table <tt>f_loan_use_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_loan_use_apply set form_id=?, project_code=?, notification_id=?, apply_type=?, amount=?, original_amount=?, loaned_amount=?, used_amount=?, released_amount=?, applying_loan_amount=?, applying_use_amount=?, is_maximum_amount=?, expect_loan_date=?, remark=?, cash_deposit_amount=?, cash_deposit_bank=?, cash_deposit_time_limit=?, cash_deposit_time_unit=?, cash_deposit_ratio=?, cash_deposit_end_time=?, busi_manager_statement=?, receipt_name=?, receipt_bank=?, receipt_account=?, interest_settlement_cycle=? where (apply_id = ?)</tt>
	 *
	 *	@param FLoanUseApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FLoanUseApplyDO FLoanUseApply) throws DataAccessException {
    	if (FLoanUseApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-LOAN-USE-APPLY-UPDATE", FLoanUseApply);
    }

	/**
	 *  Update DB table <tt>f_loan_use_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_loan_use_apply set project_code=?, notification_id=?, apply_type=?, amount=?, original_amount=?, loaned_amount=?, used_amount=?, released_amount=?, applying_loan_amount=?, applying_use_amount=?, is_maximum_amount=?, expect_loan_date=?, remark=?, cash_deposit_amount=?, cash_deposit_bank=?, cash_deposit_time_limit=?, cash_deposit_time_unit=?, cash_deposit_ratio=?, cash_deposit_end_time=?, busi_manager_statement=?, receipt_name=?, receipt_bank=?, receipt_account=?, interest_settlement_cycle=? where (form_id = ?)</tt>
	 *
	 *	@param FLoanUseApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FLoanUseApplyDO FLoanUseApply) throws DataAccessException {
    	if (FLoanUseApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-LOAN-USE-APPLY-UPDATE-BY-FORM-ID", FLoanUseApply);
    }

	/**
	 *  Query DB table <tt>f_loan_use_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FLoanUseApplyDO
	 *	@throws DataAccessException
	 */	 
    public FLoanUseApplyDO findById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (FLoanUseApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-LOAN-USE-APPLY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_loan_use_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FLoanUseApplyDO
	 *	@throws DataAccessException
	 */	 
    public FLoanUseApplyDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FLoanUseApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-LOAN-USE-APPLY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_loan_use_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FLoanUseApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FLoanUseApplyDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-LOAN-USE-APPLY-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Query DB table <tt>f_loan_use_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_loan_use_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FLoanUseApplyDO
	 *	@throws DataAccessException
	 */	 
    public FLoanUseApplyDO findLatest(String projectCode) throws DataAccessException {

        return (FLoanUseApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-LOAN-USE-APPLY-FIND-LATEST", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_loan_use_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_loan_use_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return getSqlMapClientTemplate().delete("MS-F-LOAN-USE-APPLY-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_loan_use_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_loan_use_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-LOAN-USE-APPLY-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_loan_use_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_loan_use_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-LOAN-USE-APPLY-DELETE-BY-PROJECT-CODE", projectCode);
    }

}