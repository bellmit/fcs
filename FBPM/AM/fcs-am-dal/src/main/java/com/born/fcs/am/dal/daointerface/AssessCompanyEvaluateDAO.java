/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.daointerface;

// auto generated imports
import com.born.fcs.am.dal.dataobject.AssessCompanyEvaluateDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>assess_company_evaluate</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/assess_company_evaluate.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface AssessCompanyEvaluateDAO {
	/**
	 *  Insert one <tt>AssessCompanyEvaluateDO</tt> object to DB table <tt>assess_company_evaluate</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into assess_company_evaluate(apply_id,company_id,company_name,evaluate_person,evaluate_person_account,evaluate_person_name,work_situation,attachment,technical_level,evaluation_efficiency,cooperation_situation,service_attitude,is_review,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param assessCompanyEvaluate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(AssessCompanyEvaluateDO assessCompanyEvaluate) throws DataAccessException;

	/**
	 *  Update DB table <tt>assess_company_evaluate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update assess_company_evaluate set apply_id=?, company_id=?, company_name=?, evaluate_person=?, evaluate_person_account=?, evaluate_person_name=?, work_situation=?, attachment=?, technical_level=?, evaluation_efficiency=?, cooperation_situation=?, service_attitude=?, is_review=?, remark=? where (id = ?)</tt>
	 *
	 *	@param assessCompanyEvaluate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(AssessCompanyEvaluateDO assessCompanyEvaluate) throws DataAccessException;

	/**
	 *  Query DB table <tt>assess_company_evaluate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from assess_company_evaluate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return AssessCompanyEvaluateDO
	 *	@throws DataAccessException
	 */	 
    public AssessCompanyEvaluateDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>assess_company_evaluate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from assess_company_evaluate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>assess_company_evaluate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from assess_company_evaluate where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return List<AssessCompanyEvaluateDO>
	 *	@throws DataAccessException
	 */	 
    public List<AssessCompanyEvaluateDO> findByApplyId(long applyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>assess_company_evaluate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from assess_company_evaluate where (company_id = ?)</tt>
	 *
	 *	@param companyId
	 *	@return List<AssessCompanyEvaluateDO>
	 *	@throws DataAccessException
	 */	 
    public List<AssessCompanyEvaluateDO> findByCompanyId(long companyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>assess_company_evaluate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from assess_company_evaluate where (1 = 1)</tt>
	 *
	 *	@param assessCompanyEvaluate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(AssessCompanyEvaluateDO assessCompanyEvaluate) throws DataAccessException;

	/**
	 *  Query DB table <tt>assess_company_evaluate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from assess_company_evaluate where (1 = 1)</tt>
	 *
	 *	@param assessCompanyEvaluate
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<AssessCompanyEvaluateDO>
	 *	@throws DataAccessException
	 */	 
    public List<AssessCompanyEvaluateDO> findByCondition(AssessCompanyEvaluateDO assessCompanyEvaluate, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException;

}