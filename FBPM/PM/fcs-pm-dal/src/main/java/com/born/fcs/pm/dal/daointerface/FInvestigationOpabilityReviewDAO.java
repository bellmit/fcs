/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationOpabilityReviewDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_opability_review</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_opability_review.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FInvestigationOpabilityReviewDAO {
	/**
	 *  Insert one <tt>FInvestigationOpabilityReviewDO</tt> object to DB table <tt>f_investigation_opability_review</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_opability_review(form_id,project_code,project_name,customer_id,customer_name,strategy_marketpos,industry_env,competitiveness_rival,up_desc,down_desc,explaination,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReview
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationOpabilityReviewDO FInvestigationOpabilityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_opability_review set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, strategy_marketpos=?, industry_env=?, competitiveness_rival=?, up_desc=?, down_desc=?, explaination=? where (op_review_id = ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationOpabilityReviewDO FInvestigationOpabilityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_opability_review set project_code=?, project_name=?, customer_id=?, customer_name=?, strategy_marketpos=?, industry_env=?, competitiveness_rival=?, up_desc=?, down_desc=?, explaination=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationOpabilityReviewDO FInvestigationOpabilityReview) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_opability_review set form_id=?, project_name=?, customer_id=?, customer_name=?, strategy_marketpos=?, industry_env=?, competitiveness_rival=?, up_desc=?, down_desc=?, explaination=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationOpabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationOpabilityReviewDO FInvestigationOpabilityReview) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_opability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_opability_review where (op_review_id = ?)</tt>
	 *
	 *	@param opReviewId
	 *	@return FInvestigationOpabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationOpabilityReviewDO findById(long opReviewId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_opability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_opability_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationOpabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationOpabilityReviewDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_opability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_opability_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationOpabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationOpabilityReviewDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_opability_review where (op_review_id = ?)</tt>
	 *
	 *	@param opReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long opReviewId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_opability_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_opability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_opability_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}