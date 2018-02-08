/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCreditRefrerenceApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_credit_refrerence_apply</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_credit_refrerence_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FCreditRefrerenceApplyDAO {
	/**
	 *  Insert one <tt>FCreditRefrerenceApplyDO</tt> object to DB table <tt>f_credit_refrerence_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_credit_refrerence_apply(form_id,project_code,project_name,company_name,address,busi_license_no,legal_persion,established_time,register_capital,busi_scope,busi_license_url,auth_url,afmg_approval_url,legal_persion_cert_front,legal_persion_cert_back,loan_card_front,loan_card_back,apply_man_id,apply_man_name,status,apply_status,is_three_in_one,org_code,local_tax_cert_no,tax_reg_certificate_no,social_unity_credit_code,loan_card_no,is_need_attach,attachment,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_refrerence_apply set project_code=?, project_name=?, company_name=?, address=?, busi_license_no=?, legal_persion=?, established_time=?, register_capital=?, busi_scope=?, busi_license_url=?, auth_url=?, afmg_approval_url=?, legal_persion_cert_front=?, legal_persion_cert_back=?, loan_card_front=?, loan_card_back=?, apply_man_id=?, apply_man_name=?, status=?, credit_report=?, apply_status=?, is_three_in_one=?, org_code=?, local_tax_cert_no=?, tax_reg_certificate_no=?, social_unity_credit_code=?, loan_card_no=?, is_need_attach=?, attachment=? where (id = ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_refrerence_apply set project_code=?, project_name=?, company_name=?, address=?, busi_license_no=?, legal_persion=?, established_time=?, register_capital=?, busi_scope=?, busi_license_url=?, auth_url=?, afmg_approval_url=?, legal_persion_cert_front=?, legal_persion_cert_back=?, loan_card_front=?, loan_card_back=?, apply_man_id=?, apply_man_name=?, status=?, credit_report=?, apply_status=?, is_three_in_one=?, org_code=?, local_tax_cert_no=?, tax_reg_certificate_no=?, social_unity_credit_code=?, loan_card_no=?, is_need_attach=?, attachment=? where (form_id = ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_refrerence_apply set status=? where (id = ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatusById(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_refrerence_apply set credit_report=? where (id = ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateCreditreportById(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_credit_refrerence_apply set apply_status=? where (id = ?)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateApplystatusById(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_refrerence_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_refrerence_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FCreditRefrerenceApplyDO
	 *	@throws DataAccessException
	 */	 
    public FCreditRefrerenceApplyDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_refrerence_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_refrerence_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCreditRefrerenceApplyDO
	 *	@throws DataAccessException
	 */	 
    public FCreditRefrerenceApplyDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_refrerence_apply where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_credit_refrerence_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_credit_refrerence_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_refrerence_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_credit_refrerence_apply where (1 = 1)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FCreditRefrerenceApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCreditRefrerenceApplyDO> findByCondition(FCreditRefrerenceApplyDO FCreditRefrerenceApply, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_credit_refrerence_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_credit_refrerence_apply where (1 = 1)</tt>
	 *
	 *	@param FCreditRefrerenceApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCreditRefrerenceApplyDO FCreditRefrerenceApply) throws DataAccessException;

}