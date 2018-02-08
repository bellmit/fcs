/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ConsentIssueNoticeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>consent_issue_notice</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/consent_issue_notice.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ConsentIssueNoticeDAO {
	/**
	 *  Insert one <tt>ConsentIssueNoticeDO</tt> object to DB table <tt>consent_issue_notice</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into consent_issue_notice(notice_id,project_code,project_name,customer_id,customer_name,customer_type,busi_type,busi_type_name,busi_manager_id,busi_manager_account,busi_manager_name,is_upload_receipt,receipt_attachment,your_cooperation_company,your_cooperation_attachment,my_cooperation_company,my_cooperation_attachment,my_cooperation_contract_no,html,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param consentIssueNotice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ConsentIssueNoticeDO consentIssueNotice) throws DataAccessException;

	/**
	 *  Update DB table <tt>consent_issue_notice</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update consent_issue_notice set project_code=?, project_name=?, customer_id=?, customer_name=?, customer_type=?, busi_type=?, busi_type_name=?, busi_manager_id=?, busi_manager_account=?, busi_manager_name=?, is_upload_receipt=?, receipt_attachment=?, your_cooperation_company=?, your_cooperation_attachment=?, my_cooperation_company=?, my_cooperation_attachment=?, my_cooperation_contract_no=?, html=? where (notice_id = ?)</tt>
	 *
	 *	@param consentIssueNotice
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ConsentIssueNoticeDO consentIssueNotice) throws DataAccessException;

	/**
	 *  Query DB table <tt>consent_issue_notice</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from consent_issue_notice where (notice_id = ?)</tt>
	 *
	 *	@param noticeId
	 *	@return ConsentIssueNoticeDO
	 *	@throws DataAccessException
	 */	 
    public ConsentIssueNoticeDO findById(long noticeId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>consent_issue_notice</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from consent_issue_notice where (notice_id = ?)</tt>
	 *
	 *	@param noticeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long noticeId) throws DataAccessException;

	/**
	 *  Query DB table <tt>consent_issue_notice</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from consent_issue_notice where (notice_id = ?)</tt>
	 *
	 *	@param consentIssueNotice
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ConsentIssueNoticeDO>
	 *	@throws DataAccessException
	 */	 
    public List<ConsentIssueNoticeDO> findByCondition(ConsentIssueNoticeDO consentIssueNotice, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>consent_issue_notice</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from consent_issue_notice where (notice_id = ?)</tt>
	 *
	 *	@param consentIssueNotice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ConsentIssueNoticeDO consentIssueNotice) throws DataAccessException;

}