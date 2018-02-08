/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCouncilSummaryProjectDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Date;

/**
 * A dao interface provides methods to access database table <tt>f_council_summary_project</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCouncilSummaryProjectDAO {
	/**
	 *  Insert one <tt>FCouncilSummaryProjectDO</tt> object to DB table <tt>f_council_summary_project</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_council_summary_project(sp_id,sp_code,summary_id,project_code,project_name,customer_id,customer_name,customer_type,busi_type,busi_type_name,loan_purpose,amount,time_limit,time_unit,time_remark,repay_way,is_repay_equal,charge_way,charge_remark,is_charge_every_beginning,charge_phase,vote_result,vote_result_desc,remark,is_maximum_amount,is_del,one_vote_down,one_vote_down_mark,one_vote_down_time,approval_time,other,belong_to_nc,overview,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCouncilSummaryProject
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCouncilSummaryProjectDO FCouncilSummaryProject) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_council_summary_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_council_summary_project set sp_code=?, summary_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, loan_purpose=?, amount=?, time_limit=?, time_unit=?, time_remark=?, repay_way=?, is_repay_equal=?, charge_way=?, charge_remark=?, is_charge_every_beginning=?, charge_phase=?, vote_result=?, vote_result_desc=?, remark=?, is_maximum_amount=?, is_del=?, one_vote_down=?, one_vote_down_mark=?, one_vote_down_time=?, approval_time=?, other=?, belong_to_nc=?, overview=? where (sp_id = ?)</tt>
	 *
	 *	@param FCouncilSummaryProject
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCouncilSummaryProjectDO FCouncilSummaryProject) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return FCouncilSummaryProjectDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectDO findById(long spId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project where ((project_code = ?) AND (vote_result = 'END_PASS')) order by sp_id DESC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCouncilSummaryProjectDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project where (sp_code = ?)</tt>
	 *
	 *	@param spCode
	 *	@return FCouncilSummaryProjectDO
	 *	@throws DataAccessException
	 */	 
    public FCouncilSummaryProjectDO findBySpCode(String spCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return List<FCouncilSummaryProjectDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectDO> findBySummaryId(long summaryId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project where (sp_id = ?)</tt>
	 *
	 *	@param spId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long spId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_council_summary_project</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_council_summary_project where (summary_id = ?)</tt>
	 *
	 *	@param summaryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySummaryId(long summaryId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_council_summary_project where (1 = 1)</tt>
	 *
	 *	@param FCouncilSummaryProject
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param isApproval
	 *	@param isApprovalList
	 *	@param startTime
	 *	@param endTime
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<FCouncilSummaryProjectDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCouncilSummaryProjectDO> findByCondition(FCouncilSummaryProjectDO FCouncilSummaryProject, long loginUserId, List deptIdList, String isApproval, String isApprovalList, Date startTime, Date endTime, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_council_summary_project</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_council_summary_project where (1 = 1)</tt>
	 *
	 *	@param FCouncilSummaryProject
	 *	@param loginUserId
	 *	@param deptIdList
	 *	@param isApproval
	 *	@param isApprovalList
	 *	@param startTime
	 *	@param endTime
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCouncilSummaryProjectDO FCouncilSummaryProject, long loginUserId, List deptIdList, String isApproval, String isApprovalList, Date startTime, Date endTime) throws DataAccessException;

}