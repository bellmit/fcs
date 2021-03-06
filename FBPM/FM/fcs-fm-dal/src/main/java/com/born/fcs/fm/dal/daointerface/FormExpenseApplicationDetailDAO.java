/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.daointerface;

// auto generated imports
import com.born.fcs.fm.dal.dataobject.FormExpenseApplicationDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>form_expense_application_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_expense_application_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FormExpenseApplicationDetailDAO {
	/**
	 *  Insert one <tt>FormExpenseApplicationDetailDO</tt> object to DB table <tt>form_expense_application_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_expense_application_detail(detail_id,expense_application_id,expense_type,amount,reverse,tax_amount,fp_amount,xj_amount,dept_id,dept_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formExpenseApplicationDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormExpenseApplicationDetailDO formExpenseApplicationDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_expense_application_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_expense_application_detail set expense_application_id=?, expense_type=?, amount=?, reverse=?, tax_amount=?, fp_amount=?, xj_amount=?, dept_id=?, dept_name=? where (detail_id = ?)</tt>
	 *
	 *	@param formExpenseApplicationDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormExpenseApplicationDetailDO formExpenseApplicationDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_expense_application_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return FormExpenseApplicationDetailDO
	 *	@throws DataAccessException
	 */	 
    public FormExpenseApplicationDetailDO findById(long detailId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>form_expense_application_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_expense_application_detail where (detail_id = ?)</tt>
	 *
	 *	@param detailId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long detailId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_expense_application_detail where (expense_application_id = ?)</tt>
	 *
	 *	@param expenseApplicationId
	 *	@return List<FormExpenseApplicationDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormExpenseApplicationDetailDO> findByExpenseApplicationId(long expenseApplicationId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_expense_application_detail where (expense_type = ?)</tt>
	 *
	 *	@param expenseType
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findCountByExpenseType(String expenseType) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_expense_application_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select d.* from form_expense_application e, form_expense_application_detail d, form f where ((d.expense_application_id = e.expense_application_id) AND (e.form_id = f.form_id) AND (f.status IN ('APPROVAL', 'SUBMIT', 'AUDITING')))</tt>
	 *
	 *	@param deptId
	 *	@param categoryId
	 *	@param applyTimeStart
	 *	@param applyTimeEnd
	 *	@return List<FormExpenseApplicationDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormExpenseApplicationDetailDO> findSublInfoByDeptCategory(long deptId, long categoryId, String applyTimeStart, String applyTimeEnd) throws DataAccessException;

}