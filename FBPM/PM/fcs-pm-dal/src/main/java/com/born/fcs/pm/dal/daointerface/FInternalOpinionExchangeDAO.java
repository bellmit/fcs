/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInternalOpinionExchangeDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_internal_opinion_exchange</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_internal_opinion_exchange.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FInternalOpinionExchangeDAO {
	/**
	 *  Insert one <tt>FInternalOpinionExchangeDO</tt> object to DB table <tt>f_internal_opinion_exchange</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_internal_opinion_exchange(id,form_id,ex_code,ex_type,dept_ids,dept_names,users,need_feedback,feedback_time,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInternalOpinionExchange
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInternalOpinionExchangeDO FInternalOpinionExchange) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_internal_opinion_exchange</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_internal_opinion_exchange set form_id=?, ex_code=?, ex_type=?, dept_ids=?, dept_names=?, users=?, need_feedback=?, feedback_time=?, remark=? where (id = ?)</tt>
	 *
	 *	@param FInternalOpinionExchange
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInternalOpinionExchangeDO FInternalOpinionExchange) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_internal_opinion_exchange</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_internal_opinion_exchange set ex_code=?, ex_type=?, dept_ids=?, dept_names=?, users=?, need_feedback=?, feedback_time=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param FInternalOpinionExchange
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInternalOpinionExchangeDO FInternalOpinionExchange) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInternalOpinionExchangeDO
	 *	@throws DataAccessException
	 */	 
    public FInternalOpinionExchangeDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_internal_opinion_exchange</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_internal_opinion_exchange where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInternalOpinionExchangeDO
	 *	@throws DataAccessException
	 */	 
    public FInternalOpinionExchangeDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_internal_opinion_exchange</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_internal_opinion_exchange where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

}