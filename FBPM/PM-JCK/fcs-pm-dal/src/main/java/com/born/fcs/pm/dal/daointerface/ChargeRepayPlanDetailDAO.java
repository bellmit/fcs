/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ChargeRepayPlanDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>charge_repay_plan_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/charge_repay_plan_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ChargeRepayPlanDetailDAO {
	/**
	 *  Insert one <tt>ChargeRepayPlanDetailDO</tt> object to DB table <tt>charge_repay_plan_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into charge_repay_plan_detail(plan_detail_id,plan_id,project_code,plan_type,start_time,end_time,amount,is_notify,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param chargeRepayPlanDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ChargeRepayPlanDetailDO chargeRepayPlanDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>charge_repay_plan_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update charge_repay_plan_detail set plan_id=?, project_code=?, plan_type=?, start_time=?, end_time=?, amount=?, is_notify=?, remark=? where (plan_detail_id = ?)</tt>
	 *
	 *	@param chargeRepayPlanDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ChargeRepayPlanDetailDO chargeRepayPlanDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan_detail where (plan_detail_id = ?)</tt>
	 *
	 *	@param planDetailId
	 *	@return ChargeRepayPlanDetailDO
	 *	@throws DataAccessException
	 */	 
    public ChargeRepayPlanDetailDO findById(long planDetailId) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan_detail where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<ChargeRepayPlanDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChargeRepayPlanDetailDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan_detail where (plan_id = ?)</tt>
	 *
	 *	@param planId
	 *	@return List<ChargeRepayPlanDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChargeRepayPlanDetailDO> findByPlanId(long planId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>charge_repay_plan_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from charge_repay_plan_detail where (plan_detail_id = ?)</tt>
	 *
	 *	@param planDetailId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long planDetailId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>charge_repay_plan_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from charge_repay_plan_detail where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>charge_repay_plan_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from charge_repay_plan_detail where (plan_id = ?)</tt>
	 *
	 *	@param planId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByPlanId(long planId) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from charge_repay_plan_detail where (1 = 1)</tt>
	 *
	 *	@param chargeRepayPlanDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ChargeRepayPlanDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<ChargeRepayPlanDetailDO> findByCondition(ChargeRepayPlanDetailDO chargeRepayPlanDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>charge_repay_plan_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from charge_repay_plan_detail where (1 = 1)</tt>
	 *
	 *	@param chargeRepayPlanDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ChargeRepayPlanDetailDO chargeRepayPlanDetail) throws DataAccessException;

}