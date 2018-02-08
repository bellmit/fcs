/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryProjectChargeWayDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_council_summary_project_charge_way</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_charge_way.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCouncilSummaryProjectChargeWayDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryProjectChargeWayDO</tt> object to DB table <tt>f_council_summary_project_charge_way</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_project_charge_way(id,sp_id,charge_order,phase,before_day,amount,amount_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectChargeWay
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryProjectChargeWayDO FCouncilSummaryProjectChargeWay) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_project_charge_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project_charge_way set sp_id=?, charge_order=?, phase=?, before_day=?, amount=?, amount_type=? where (id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectChargeWay
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryProjectChargeWayDO FCouncilSummaryProjectChargeWay) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_charge_way</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_charge_way where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilSummaryProjectChargeWayDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectChargeWayDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_charge_way</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_charge_way where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return List<FCouncilSummaryProjectChargeWayDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectChargeWayDO> findBySpId(long spId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_charge_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_charge_way where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_charge_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_charge_way where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySpId(long spId) throws DataAccessException;

}