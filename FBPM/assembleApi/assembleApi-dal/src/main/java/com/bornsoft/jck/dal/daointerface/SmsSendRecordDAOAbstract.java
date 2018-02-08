/**
 * www.yiji.com Inc.
 * Copyright (c) 2013 All Rights Reserved.
 */
package com.bornsoft.jck.dal.daointerface;
// auto generated imports
import org.springframework.dao.DataAccessException;

import com.bornsoft.jck.dal.dataobject.SmsSendRecordDO;

/**
 * A dao interface provides methods to access database table <tt>yjh_av_ex_ea</tt>.
 *
 * This file is generated by <tt>yjh-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/yjh_av_ex_ea.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>yjh-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public abstract interface SmsSendRecordDAOAbstract {
	/**
	 *  Update DB table <tt>sms_send_record</tt>.
	 *
	 *	@param yjhAvExEa
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SmsSendRecordDO smsSendRecord) throws DataAccessException;

	/**
	 *  Insert one <tt>SmsSendRecordDO</tt> object to DB table <tt>sms_send_record</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *
	 *	@param smsSendRecord
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public java.lang.Long insert(SmsSendRecordDO smsSendRecord) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>yjh_av_ex_ea</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *
	 *	@param Rid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(String Rid) throws DataAccessException;
	
}