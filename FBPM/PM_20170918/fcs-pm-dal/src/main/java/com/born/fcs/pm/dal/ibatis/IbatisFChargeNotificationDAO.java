/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FChargeNotificationDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FChargeNotificationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FChargeNotificationDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_charge_notification.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFChargeNotificationDAO extends SqlMapClientDaoSupport implements FChargeNotificationDAO {
	/**
	 *  Insert one <tt>FChargeNotificationDO</tt> object to DB table <tt>f_charge_notification</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_charge_notification(form_id,project_code,project_name,customer_id,customer_name,is_agent_pay,pay_amount,pay_name,pay_account,pay_bank,pay_time,submit_man_id,submit_man_name,charge_no,charge_time,status,contract_code,contract_name,remark,charge_basis,apply_code,apply_title,payer,self_pay,pay_for_another,another_pay_amount,another_pay_name,another_pay_account,another_pay_bank,another_pay_time,attachment,institution_id,institution_name,charge_name,charge_fee,charge_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FChargeNotification
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FChargeNotificationDO FChargeNotification) throws DataAccessException {
    	if (FChargeNotification == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-CHARGE-NOTIFICATION-INSERT", FChargeNotification);

        return FChargeNotification.getNotificationId();
    }

	/**
	 *  Update DB table <tt>f_charge_notification</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_charge_notification set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, is_agent_pay=?, pay_amount=?, pay_name=?, pay_account=?, pay_bank=?, pay_time=?, submit_man_id=?, submit_man_name=?, charge_no=?, charge_time=?, status=?, contract_code=?, contract_name=?, remark=?, charge_basis=?, apply_code=?, apply_title=?, payer=?, self_pay=?, pay_for_another=?, another_pay_amount=?, another_pay_name=?, another_pay_account=?, another_pay_bank=?, another_pay_time=?, attachment=?, institution_id=?, institution_name=?, charge_name=?, charge_fee=?, charge_type=? where (notification_id = ?)</tt>
	 *
	 *	@param FChargeNotification
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FChargeNotificationDO FChargeNotification) throws DataAccessException {
    	if (FChargeNotification == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CHARGE-NOTIFICATION-UPDATE", FChargeNotification);
    }

	/**
	 *  Update DB table <tt>f_charge_notification</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_charge_notification set project_code=?, project_name=?, customer_id=?, customer_name=?, is_agent_pay=?, pay_amount=?, pay_name=?, pay_account=?, pay_bank=?, pay_time=?, submit_man_id=?, submit_man_name=?, charge_no=?, charge_time=?, status=?, contract_code=?, contract_name=?, remark=?, charge_basis=?, apply_code=?, apply_title=?, payer=?, self_pay=?, pay_for_another=?, another_pay_amount=?, another_pay_name=?, another_pay_account=?, another_pay_bank=?, another_pay_time=?, attachment=?, institution_id=?, institution_name=?, charge_name=?, charge_fee=?, charge_type=? where (form_id = ?)</tt>
	 *
	 *	@param FChargeNotification
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FChargeNotificationDO FChargeNotification) throws DataAccessException {
    	if (FChargeNotification == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CHARGE-NOTIFICATION-UPDATE-BY-FORM-ID", FChargeNotification);
    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where (notification_id = ?)</tt>
	 *
	 *	@param notificationId
	 *	@return FChargeNotificationDO
	 *	@throws DataAccessException
	 */	 
    public FChargeNotificationDO findById(long notificationId) throws DataAccessException {
        Long param = new Long(notificationId);

        return (FChargeNotificationDO) getSqlMapClientTemplate().queryForObject("MS-F-CHARGE-NOTIFICATION-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FChargeNotificationDO
	 *	@throws DataAccessException
	 */	 
    public FChargeNotificationDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FChargeNotificationDO) getSqlMapClientTemplate().queryForObject("MS-F-CHARGE-NOTIFICATION-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where ((project_code = ?) AND (status = "APPROVAL")) order by raw_add_time ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FChargeNotificationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FChargeNotificationDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-CHARGE-NOTIFICATION-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where ((project_code = ?) AND ((status = "SUBMIT") OR (status = "AUDITING"))) order by raw_add_time ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FChargeNotificationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FChargeNotificationDO> findAuditingByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-CHARGE-NOTIFICATION-FIND-AUDITING-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_charge_notification</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_charge_notification where (notification_id = ?)</tt>
	 *
	 *	@param notificationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long notificationId) throws DataAccessException {
        Long param = new Long(notificationId);

        return getSqlMapClientTemplate().delete("MS-F-CHARGE-NOTIFICATION-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_charge_notification</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_charge_notification where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-CHARGE-NOTIFICATION-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_charge_notification</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_charge_notification where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-CHARGE-NOTIFICATION-DELETE-BY-PROJECT-CODE", projectCode);
    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where (notification_id = ?)</tt>
	 *
	 *	@param FChargeNotification
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FChargeNotificationDO>
	 *	@throws DataAccessException
	 */	 
    public List<FChargeNotificationDO> findByCondition(FChargeNotificationDO FChargeNotification, long limitStart, long pageSize) throws DataAccessException {
    	if (FChargeNotification == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FChargeNotification", FChargeNotification);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-CHARGE-NOTIFICATION-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_charge_notification</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_charge_notification where (notification_id = ?)</tt>
	 *
	 *	@param FChargeNotification
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FChargeNotificationDO FChargeNotification) throws DataAccessException {
    	if (FChargeNotification == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-CHARGE-NOTIFICATION-FIND-BY-CONDITION-COUNT", FChargeNotification);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}