/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRefundApplicationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_refund_application</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_refund_application.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FRefundApplicationDAO {
	/**
	 *  Insert one <tt>FRefundApplicationDO</tt> object to DB table <tt>f_refund_application</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_refund_application(form_id,project_code,project_name,attach,remark,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FRefundApplication
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FRefundApplicationDO FRefundApplication) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_refund_application</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_refund_application set form_id=?, project_code=?, project_name=?, attach=?, remark=? where (refund_id = ?)</tt>
	 *
	 *	@param FRefundApplication
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FRefundApplicationDO FRefundApplication) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_refund_application</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_refund_application set project_code=?, project_name=?, attach=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param FRefundApplication
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FRefundApplicationDO FRefundApplication) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_refund_application</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application where (refund_id = ?)</tt>
	 *
	 *	@param refundId
	 *	@return FRefundApplicationDO
	 *	@throws DataAccessException
	 */	 
    public FRefundApplicationDO findById(long refundId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_refund_application</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FRefundApplicationDO
	 *	@throws DataAccessException
	 */	 
    public FRefundApplicationDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_refund_application</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FRefundApplicationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRefundApplicationDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_refund_application</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_refund_application where (refund_id = ?)</tt>
	 *
	 *	@param refundId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long refundId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_refund_application</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_refund_application where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_refund_application</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_refund_application where (1 = 1)</tt>
	 *
	 *	@param FRefundApplication
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FRefundApplicationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FRefundApplicationDO> findByCondition(FRefundApplicationDO FRefundApplication, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_refund_application</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_refund_application where (1 = 1)</tt>
	 *
	 *	@param FRefundApplication
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FRefundApplicationDO FRefundApplication) throws DataAccessException;

}