/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.fm.dal.daointerface.FormLabourCapitalDAO;


// auto generated imports
import com.born.fcs.fm.dal.dataobject.FormLabourCapitalDO;
import org.springframework.dao.DataAccessException;
import com.born.fcs.fm.dal.queryCondition.LabourCapitalQueryCondition;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.fm.dal.daointerface.FormLabourCapitalDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_labour_capital.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFormLabourCapitalDAO extends SqlMapClientDaoSupport implements FormLabourCapitalDAO {
	/**
	 *  Insert one <tt>FormLabourCapitalDO</tt> object to DB table <tt>form_labour_capital</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_labour_capital(labour_capital_id,form_id,bill_no,voucher_no,voucher_status,voucher_sync_send_time,voucher_sync_finish_time,voucher_sync_message,expense_dept_id,dept_name,dept_head,reimburse_reason,is_official_card,application_time,relation_form,agent_id,agent,direction,payee_id,payee,bank_id,bank,bank_account,amount,is_reverse,reamount,cxids,pay_bank,pay_bank_account,shlc,attachments_num,account_status,wait_pay_time,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formLabourCapital
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormLabourCapitalDO formLabourCapital) throws DataAccessException {
    	if (formLabourCapital == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-FORM-LABOUR-CAPITAL-INSERT", formLabourCapital);

        return formLabourCapital.getLabourCapitalId();
    }

	/**
	 *  Update DB table <tt>form_labour_capital</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_labour_capital set form_id=?, bill_no=?, voucher_no=?, voucher_status=?, voucher_sync_send_time=?, voucher_sync_finish_time=?, voucher_sync_message=?, expense_dept_id=?, dept_name=?, dept_head=?, reimburse_reason=?, is_official_card=?, application_time=?, relation_form=?, agent_id=?, agent=?, direction=?, payee_id=?, payee=?, bank_id=?, bank=?, bank_account=?, amount=?, is_reverse=?, reamount=?, cxids=?, pay_bank=?, pay_bank_account=?, shlc=?, attachments_num=?, account_status=?, wait_pay_time=? where (labour_capital_id = ?)</tt>
	 *
	 *	@param formLabourCapital
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormLabourCapitalDO formLabourCapital) throws DataAccessException {
    	if (formLabourCapital == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-FORM-LABOUR-CAPITAL-UPDATE", formLabourCapital);
    }

	/**
	 *  Query DB table <tt>form_labour_capital</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_labour_capital where (labour_capital_id = ?)</tt>
	 *
	 *	@param labourCapitalId
	 *	@return FormLabourCapitalDO
	 *	@throws DataAccessException
	 */	 
    public FormLabourCapitalDO findById(long labourCapitalId) throws DataAccessException {
        Long param = new Long(labourCapitalId);

        return (FormLabourCapitalDO) getSqlMapClientTemplate().queryForObject("MS-FORM-LABOUR-CAPITAL-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>form_labour_capital</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_labour_capital where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FormLabourCapitalDO
	 *	@throws DataAccessException
	 */	 
    public FormLabourCapitalDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FormLabourCapitalDO) getSqlMapClientTemplate().queryForObject("MS-FORM-LABOUR-CAPITAL-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>form_labour_capital</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_labour_capital where (bill_no = ?)</tt>
	 *
	 *	@param billNo
	 *	@return FormLabourCapitalDO
	 *	@throws DataAccessException
	 */	 
    public FormLabourCapitalDO findByBillNo(String billNo) throws DataAccessException {

        return (FormLabourCapitalDO) getSqlMapClientTemplate().queryForObject("MS-FORM-LABOUR-CAPITAL-FIND-BY-BILL-NO", billNo);

    }

	/**
	 *  Delete records from DB table <tt>form_labour_capital</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_labour_capital where (labour_capital_id = ?)</tt>
	 *
	 *	@param labourCapitalId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long labourCapitalId) throws DataAccessException {
        Long param = new Long(labourCapitalId);

        return getSqlMapClientTemplate().delete("MS-FORM-LABOUR-CAPITAL-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>form_labour_capital</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select e.* from form_labour_capital e, form f where (e.form_id = f.form_id)</tt>
	 *
	 *	@param condition
	 *	@return List<FormLabourCapitalDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormLabourCapitalDO> findByCondition(LabourCapitalQueryCondition condition) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-FORM-LABOUR-CAPITAL-FIND-BY-CONDITION", condition);

    }

	/**
	 *  Query DB table <tt>form_labour_capital</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_labour_capital e, form f where (e.form_id = f.form_id)</tt>
	 *
	 *	@param condition
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(LabourCapitalQueryCondition condition) throws DataAccessException {

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-FORM-LABOUR-CAPITAL-FIND-BY-CONDITION-COUNT", condition);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}