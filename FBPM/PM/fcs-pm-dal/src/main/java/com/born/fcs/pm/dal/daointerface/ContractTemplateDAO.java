/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ContractTemplateDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>contract_template</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/contract_template.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ContractTemplateDAO {
	/**
	 *  Insert one <tt>ContractTemplateDO</tt> object to DB table <tt>contract_template</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into contract_template(template_id,name,contract_type,busi_type,busi_type_name,is_main,credit_condition_type,pledge_type,stamp_phase,template_file,template_content,status,attachment,remark,template_type,letter_type,form_id,user_id,user_name,user_account,legal_manager_id,legal_manager_account,legal_manager_name,is_process,parent_id,revised,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param contractTemplate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ContractTemplateDO contractTemplate) throws DataAccessException;

	/**
	 *  Update DB table <tt>contract_template</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update contract_template set name=?, contract_type=?, busi_type=?, busi_type_name=?, is_main=?, credit_condition_type=?, pledge_type=?, stamp_phase=?, template_file=?, template_content=?, status=?, attachment=?, remark=?, template_type=?, letter_type=?, legal_manager_id=?, legal_manager_account=?, legal_manager_name=?, revised=? where (template_id = ?)</tt>
	 *
	 *	@param contractTemplate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ContractTemplateDO contractTemplate) throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from contract_template where ((busi_type = ?) AND (status = "IN_USE"))</tt>
	 *
	 *	@param busiType
	 *	@return List<ContractTemplateDO>
	 *	@throws DataAccessException
	 */	 
    public List<ContractTemplateDO> findTemplates(String busiType) throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from contract_template where (template_id = ?)</tt>
	 *
	 *	@param templateId
	 *	@return ContractTemplateDO
	 *	@throws DataAccessException
	 */	 
    public ContractTemplateDO findById(long templateId) throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from contract_template where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return ContractTemplateDO
	 *	@throws DataAccessException
	 */	 
    public ContractTemplateDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>contract_template</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from contract_template where (template_id = ?)</tt>
	 *
	 *	@param templateId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long templateId) throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from contract_template where (status != 'DELETED')</tt>
	 *
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findAllCount() throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from contract_template where (template_id = ?)</tt>
	 *
	 *	@param contractTemplate
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param needNullBusiType
	 *	@param needNullPledgeType
	 *	@param busiTypeList
	 *	@param statusList
	 *	@param conditionTypeList
	 *	@param isGetTemplates
	 *	@param notGuarantor
	 *	@param equalsName
	 *	@param nameList
	 *	@return List<ContractTemplateDO>
	 *	@throws DataAccessException
	 */	 
    public List<ContractTemplateDO> findByCondition(ContractTemplateDO contractTemplate, long limitStart, long pageSize, String sortCol, String sortOrder, String needNullBusiType, String needNullPledgeType, List busiTypeList, List statusList, List conditionTypeList, String isGetTemplates, String notGuarantor, String equalsName, List nameList) throws DataAccessException;

	/**
	 *  Query DB table <tt>contract_template</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from contract_template where (template_id = ?)</tt>
	 *
	 *	@param contractTemplate
	 *	@param needNullBusiType
	 *	@param needNullPledgeType
	 *	@param busiTypeList
	 *	@param statusList
	 *	@param conditionTypeList
	 *	@param isGetTemplates
	 *	@param notGuarantor
	 *	@param equalsName
	 *	@param nameList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ContractTemplateDO contractTemplate, String needNullBusiType, String needNullPledgeType, List busiTypeList, List statusList, List conditionTypeList, String isGetTemplates, String notGuarantor, String equalsName, List nameList) throws DataAccessException;

}