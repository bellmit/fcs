/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_investigation</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FInvestigationDAO {
	/**
	 *  Insert one <tt>FInvestigationDO</tt> object to DB table <tt>f_investigation</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation(form_id,new_form_id,review,council_back,project_code,project_name,customer_id,customer_name,busi_type,busi_type_name,amount,declares,investigate_place,investigate_date,investigate_persion,investigate_persion_id,reception_persion,reception_duty,council_type,council_apply_id,council_status,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationDO FInvestigation) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation set form_id=?, new_form_id=?, review=?, council_back=?, project_code=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, amount=?, declares=?, investigate_place=?, investigate_date=?, investigate_persion=?, investigate_persion_id=?, reception_persion=?, reception_duty=?, council_type=?, council_apply_id=?, council_status=? where (investigate_id = ?)</tt>
	 *
	 *	@param FInvestigation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationDO FInvestigation) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation set new_form_id=?, review=?, council_back=?, project_code=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, amount=?, declares=?, investigate_place=?, investigate_date=?, investigate_persion=?, investigate_persion_id=?, reception_persion=?, reception_duty=?, council_type=?, council_apply_id=?, council_status=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationDO FInvestigation) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation set form_id=?, new_form_id=?, review=?, council_back=?, project_name=?, customer_id=?, customer_name=?, busi_type=?, busi_type_name=?, amount=?, declares=?, investigate_place=?, investigate_date=?, investigate_persion=?, investigate_persion_id=?, reception_persion=?, reception_duty=?, council_type=?, council_apply_id=?, council_status=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateProjectCode(FInvestigationDO FInvestigation) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation where (investigate_id = ?)</tt>
	 *
	 *	@param investigateId
	 *	@return FInvestigationDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationDO findById(long investigateId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation where ((project_code = ?) AND (council_apply_id = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param councilApplyId
	 *	@return FInvestigationDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationDO findByProjectCouncilApplyId(String projectCode, long councilApplyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationDO findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation where (investigate_id = ?)</tt>
	 *
	 *	@param investigateId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long investigateId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation where (p.council_status = 'COUNCIL_WAITING')</tt>
	 *
	 *	@param limit
	 *	@return List<FInvestigationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationDO> findCouncilWaitingApply(long limit) throws DataAccessException;

}