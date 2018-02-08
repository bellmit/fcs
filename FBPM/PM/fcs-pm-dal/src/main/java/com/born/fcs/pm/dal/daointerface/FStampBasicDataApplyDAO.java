/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FStampBasicDataApplyDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_stamp_basic_data_apply</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_stamp_basic_data_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FStampBasicDataApplyDAO {
	/**
	 *  Insert one <tt>FStampBasicDataApplyDO</tt> object to DB table <tt>f_stamp_basic_data_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_stamp_basic_data_apply(apply_code,form_id,receiver,org_names,raw_add_time) values (?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FStampBasicDataApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FStampBasicDataApplyDO FStampBasicDataApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_stamp_basic_data_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_stamp_basic_data_apply set apply_code=?, form_id=?, receiver=?, org_names=? where (apply_id = ?)</tt>
	 *
	 *	@param FStampBasicDataApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FStampBasicDataApplyDO FStampBasicDataApply) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_stamp_basic_data_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_stamp_basic_data_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FStampBasicDataApplyDO
	 *	@throws DataAccessException
	 */	 
    public FStampBasicDataApplyDO findById(long applyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_stamp_basic_data_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_stamp_basic_data_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FStampBasicDataApplyDO
	 *	@throws DataAccessException
	 */	 
    public FStampBasicDataApplyDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_stamp_basic_data_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_stamp_basic_data_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long applyId) throws DataAccessException;

}