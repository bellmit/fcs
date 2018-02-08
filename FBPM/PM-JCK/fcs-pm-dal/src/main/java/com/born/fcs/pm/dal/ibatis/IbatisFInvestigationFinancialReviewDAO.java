/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationFinancialReviewDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationFinancialReviewDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationFinancialReviewDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_financial_review.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFInvestigationFinancialReviewDAO extends SqlMapClientDaoSupport implements FInvestigationFinancialReviewDAO {
	/**
	 *  Insert one <tt>FInvestigationFinancialReviewDO</tt> object to DB table <tt>f_investigation_financial_review</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_financial_review(form_id,project_code,project_name,customer_id,customer_name,import_excel,amount_unit1,amount_unit2,amount_unit3,is_audited,audit_unit,audit_suggest,audit_suggest_explain,debt_paying_ability,operating_ability,profit_ability,cash_flow_explain,asset_quality_review,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationFinancialReview
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationFinancialReviewDO FInvestigationFinancialReview) throws DataAccessException {
    	if (FInvestigationFinancialReview == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-FINANCIAL-REVIEW-INSERT", FInvestigationFinancialReview);

        return FInvestigationFinancialReview.getFReviewId();
    }

	/**
	 *  Update DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_financial_review set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, import_excel=?, amount_unit1=?, amount_unit2=?, amount_unit3=?, is_audited=?, audit_unit=?, audit_suggest=?, audit_suggest_explain=?, debt_paying_ability=?, operating_ability=?, profit_ability=?, cash_flow_explain=?, asset_quality_review=? where (f_review_id = ?)</tt>
	 *
	 *	@param FInvestigationFinancialReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationFinancialReviewDO FInvestigationFinancialReview) throws DataAccessException {
    	if (FInvestigationFinancialReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-FINANCIAL-REVIEW-UPDATE", FInvestigationFinancialReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_financial_review set project_code=?, project_name=?, customer_id=?, customer_name=?, import_excel=?, amount_unit1=?, amount_unit2=?, amount_unit3=?, is_audited=?, audit_unit=?, audit_suggest=?, audit_suggest_explain=?, debt_paying_ability=?, operating_ability=?, profit_ability=?, cash_flow_explain=?, asset_quality_review=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationFinancialReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationFinancialReviewDO FInvestigationFinancialReview) throws DataAccessException {
    	if (FInvestigationFinancialReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-FINANCIAL-REVIEW-UPDATE-BY-FORM-ID", FInvestigationFinancialReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_financial_review set form_id=?, project_name=?, customer_id=?, customer_name=?, import_excel=?, amount_unit1=?, amount_unit2=?, amount_unit3=?, is_audited=?, audit_unit=?, audit_suggest=?, audit_suggest_explain=?, debt_paying_ability=?, operating_ability=?, profit_ability=?, cash_flow_explain=?, asset_quality_review=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationFinancialReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationFinancialReviewDO FInvestigationFinancialReview) throws DataAccessException {
    	if (FInvestigationFinancialReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-FINANCIAL-REVIEW-UPDATE-BY-PROJECT-CODE", FInvestigationFinancialReview);
    }

	/**
	 *  Query DB table <tt>f_investigation_financial_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_financial_review where (f_review_id = ?)</tt>
	 *
	 *	@param FReviewId
	 *	@return FInvestigationFinancialReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationFinancialReviewDO findById(long FReviewId) throws DataAccessException {
        Long param = new Long(FReviewId);

        return (FInvestigationFinancialReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-FINANCIAL-REVIEW-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_financial_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_financial_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationFinancialReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationFinancialReviewDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FInvestigationFinancialReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-FINANCIAL-REVIEW-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_financial_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_financial_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationFinancialReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationFinancialReviewDO findByProjectCode(String projectCode) throws DataAccessException {

        return (FInvestigationFinancialReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-FINANCIAL-REVIEW-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_financial_review where (f_review_id = ?)</tt>
	 *
	 *	@param FReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long FReviewId) throws DataAccessException {
        Long param = new Long(FReviewId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-FINANCIAL-REVIEW-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_financial_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-FINANCIAL-REVIEW-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_financial_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_financial_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-FINANCIAL-REVIEW-DELETE-BY-PROJECT-CODE", projectCode);
    }

}