/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryProjectGuaranteeDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>f_council_summary_project_guarantee</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_guarantee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface FCouncilSummaryProjectGuaranteeDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryProjectGuaranteeDO</tt> object to DB table <tt>f_council_summary_project_guarantee</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_project_guarantee(id,sp_id,capital_channel_id,capital_channel_name,capital_sub_channel_id,capital_sub_channel_name,interest_rate,interest_rate_float,guarantee_fee,guarantee_fee_type,total_cost,total_cost_type,other_fee,other_fee_type,deposit,deposit_type,deposit_account,process_flag,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectGuarantee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryProjectGuaranteeDO FCouncilSummaryProjectGuarantee) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_project_guarantee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project_guarantee set sp_id=?, capital_channel_id=?, capital_channel_name=?, capital_sub_channel_id=?, capital_sub_channel_name=?, interest_rate=?, interest_rate_float=?, guarantee_fee=?, guarantee_fee_type=?, total_cost=?, total_cost_type=?, other_fee=?, other_fee_type=?, deposit=?, deposit_type=?, deposit_account=?, process_flag=? where (id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProjectGuarantee
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryProjectGuaranteeDO FCouncilSummaryProjectGuarantee) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_guarantee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_guarantee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCouncilSummaryProjectGuaranteeDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectGuaranteeDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project_guarantee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project_guarantee where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return FCouncilSummaryProjectGuaranteeDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectGuaranteeDO findBySpId(long spId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_guarantee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_guarantee where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project_guarantee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project_guarantee where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySpId(long spId) throws DataAccessException;

}