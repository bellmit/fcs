/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FormDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>form</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FormDAO {
	/**
	 *  Insert one <tt>FormDO</tt> object to DB table <tt>form</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form(form_code,form_name,form_url,act_inst_id,act_def_id,def_id,run_id,task_id,status,detail_status,user_id,user_account,user_name,user_mobile,user_email,dept_id,dept_code,dept_name,dept_path,dept_path_name,check_status,submit_time,finish_time,related_project_code,task_user_data,trace,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param form
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormDO form) throws DataAccessException;

	/**
	 *  Update DB table <tt>form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form set form_code=?, form_name=?, form_url=?, act_inst_id=?, act_def_id=?, def_id=?, run_id=?, task_id=?, status=?, detail_status=?, user_id=?, user_account=?, user_name=?, user_mobile=?, user_email=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, check_status=?, submit_time=?, finish_time=?, related_project_code=?, task_user_data=?, trace=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param form
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormDO form) throws DataAccessException;

	/**
	 *  Query DB table <tt>form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form t where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FormDO
	 *	@throws DataAccessException
	 */	 
    public FormDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>form</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form where (1 = 1)</tt>
	 *
	 *	@param form
	 *	@param statusList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormDO> findByCondition(FormDO form, List statusList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>form</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form where (1 = 1)</tt>
	 *
	 *	@param form
	 *	@param statusList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormDO form, List statusList) throws DataAccessException;

}