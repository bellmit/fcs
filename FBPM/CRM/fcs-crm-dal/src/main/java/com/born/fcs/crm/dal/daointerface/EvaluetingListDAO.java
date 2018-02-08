/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.crm.dal.daointerface;

// auto generated imports
import com.born.fcs.crm.dal.dataobject.EvaluetingListDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>evalueting_list</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/evalueting_list.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface EvaluetingListDAO {
	/**
	 *  Insert one <tt>EvaluetingListDO</tt> object to DB table <tt>evalueting_list</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into evalueting_list(form_id,project_code,customer_id,customer_name,busi_license_no,level,year,audit_time,operator,audit_status,evalueting_type,is_prosecute,evalueting_institutions,evalueting_time,audit_img,audit_opinion1,audit_opinion2,audit_opinion3,audit_opinion4,audit_opinion5,audit_opinion6,edit_status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param evaluetingList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(EvaluetingListDO evaluetingList) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>evalueting_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from evalueting_list where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>evalueting_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select form_id, project_code, customer_id, customer_name, busi_license_no, level, year, audit_time, operator, audit_status, evalueting_type, is_prosecute, evalueting_institutions, evalueting_time, audit_img, audit_opinion1, audit_opinion2, audit_opinion3, audit_opinion4, audit_opinion5, audit_opinion6, edit_status, raw_add_time, raw_update_time from evalueting_list where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return EvaluetingListDO
	 *	@throws DataAccessException
	 */	 
    public EvaluetingListDO findById(long formId) throws DataAccessException;

	/**
	 *  Update DB table <tt>evalueting_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update evalueting_list set project_code=?, customer_id=?, customer_name=?, busi_license_no=?, level=?, year=?, audit_time=?, operator=?, audit_status=?, evalueting_type=?, is_prosecute=?, evalueting_institutions=?, evalueting_time=?, audit_img=?, audit_opinion1=?, audit_opinion2=?, audit_opinion3=?, audit_opinion4=?, audit_opinion5=?, audit_opinion6=?, edit_status=? where (form_id = ?)</tt>
	 *
	 *	@param evaluetingList
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateById(EvaluetingListDO evaluetingList) throws DataAccessException;

	/**
	 *  Update DB table <tt>evalueting_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update evalueting_list set project_code="" where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int cleanProjCodeById(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>evalueting_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select form_id, project_code, customer_id, customer_name, busi_license_no, level, year, audit_time, operator, audit_status, evalueting_type, is_prosecute, evalueting_institutions, evalueting_time, audit_img, audit_opinion1, audit_opinion2, audit_opinion3, audit_opinion4, audit_opinion5, audit_opinion6, edit_status, raw_add_time, raw_update_time from evalueting_list</tt>
	 *
	 *	@param evaluetingList
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<EvaluetingListDO>
	 *	@throws DataAccessException
	 */	 
    public List<EvaluetingListDO> findWithCondition(EvaluetingListDO evaluetingList, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>evalueting_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from evalueting_list</tt>
	 *
	 *	@param evaluetingList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long countWithCondition(EvaluetingListDO evaluetingList) throws DataAccessException;

}