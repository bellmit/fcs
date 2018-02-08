/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationCsRationalityReviewDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_cs_rationality_review</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_cs_rationality_review.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FInvestigationCsRationalityReviewDAO {
	/**
	 *  Insert one <tt>FInvestigationCsRationalityReviewDO</tt> object to DB table <tt>f_investigation_cs_rationality_review</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_cs_rationality_review(form_id,project_code,project_name,customer_id,customer_name,amount_limit_review,time_limit_review,loan_purpose_review,repay_source_review,guarantor_review,guarantee_company_info,guarantee_company_ability,counter_guarantee_info,guarantor_info,pledge_value,review_summary,other_repay_source,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationCsRationalityReview
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationCsRationalityReviewDO FInvestigationCsRationalityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_cs_rationality_review set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, amount_limit_review=?, time_limit_review=?, loan_purpose_review=?, repay_source_review=?, guarantor_review=?, guarantee_company_info=?, guarantee_company_ability=?, counter_guarantee_info=?, guarantor_info=?, pledge_value=?, review_summary=?, other_repay_source=? where (csr_review_id = ?)</tt>
	 *
	 *	@param FInvestigationCsRationalityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationCsRationalityReviewDO FInvestigationCsRationalityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_cs_rationality_review set project_code=?, project_name=?, customer_id=?, customer_name=?, amount_limit_review=?, time_limit_review=?, loan_purpose_review=?, repay_source_review=?, guarantor_review=?, guarantee_company_info=?, guarantee_company_ability=?, counter_guarantee_info=?, guarantor_info=?, pledge_value=?, review_summary=?, other_repay_source=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationCsRationalityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationCsRationalityReviewDO FInvestigationCsRationalityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_cs_rationality_review set form_id=?, project_name=?, customer_id=?, customer_name=?, amount_limit_review=?, time_limit_review=?, loan_purpose_review=?, repay_source_review=?, guarantor_review=?, guarantee_company_info=?, guarantee_company_ability=?, counter_guarantee_info=?, guarantor_info=?, pledge_value=?, review_summary=?, other_repay_source=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationCsRationalityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationCsRationalityReviewDO FInvestigationCsRationalityReview) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_cs_rationality_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_cs_rationality_review where (csr_review_id = ?)</tt>
	 *
	 *	@param csrReviewId
	 *	@return FInvestigationCsRationalityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCsRationalityReviewDO findById(long csrReviewId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_cs_rationality_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_cs_rationality_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationCsRationalityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCsRationalityReviewDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_cs_rationality_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_cs_rationality_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationCsRationalityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCsRationalityReviewDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_cs_rationality_review where (csr_review_id = ?)</tt>
	 *
	 *	@param csrReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long csrReviewId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_cs_rationality_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_cs_rationality_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_cs_rationality_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_cs_rationality_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_cs_rationality_review</tt>
	 *
	 *	@return List<FInvestigationCsRationalityReviewDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCsRationalityReviewDO> findAll() throws DataAccessException;

}