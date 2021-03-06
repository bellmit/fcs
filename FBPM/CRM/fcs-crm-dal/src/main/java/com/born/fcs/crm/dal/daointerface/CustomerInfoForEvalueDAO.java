/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.daointerface;

// auto generated imports
import com.born.fcs.crm.dal.dataobject.CustomerInfoForEvalueDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>customer_info_for_evalue</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_info_for_evalue.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface CustomerInfoForEvalueDAO {
	/**
	 *  Insert one <tt>CustomerInfoForEvalueDO</tt> object to DB table <tt>customer_info_for_evalue</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_info_for_evalue(formId,customer_id,customer_name,loan_card_no,actual_capital,subordinate_relationship,sales_proceeds_last_year,account_no,is_group,is_listed_company,change_person,change_person_id,year,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerInfoForEvalue
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerInfoForEvalueDO customerInfoForEvalue) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_info_for_evalue</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select formId, customer_id, customer_name, loan_card_no, actual_capital, subordinate_relationship, sales_proceeds_last_year, account_no, is_group, is_listed_company, change_person, change_person_id, year, raw_add_time, raw_update_time from customer_info_for_evalue where (formId = ?)</tt>
	 *
	 *	@param formId
	 *	@return CustomerInfoForEvalueDO
	 *	@throws DataAccessException
	 */	 
    public CustomerInfoForEvalueDO findById(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_info_for_evalue</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_info_for_evalue where (formId = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_info_for_evalue</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_info_for_evalue where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCustomerId(String customerId) throws DataAccessException;

	/**
	 *  Update DB table <tt>customer_info_for_evalue</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_info_for_evalue set customer_id=?, customer_name=?, loan_card_no=?, actual_capital=?, subordinate_relationship=?, sales_proceeds_last_year=?, account_no=?, is_group=?, is_listed_company=?, change_person=?, change_person_id=?, year=? where (formId = ?)</tt>
	 *
	 *	@param customerInfoForEvalue
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerInfoForEvalueDO customerInfoForEvalue) throws DataAccessException;

}