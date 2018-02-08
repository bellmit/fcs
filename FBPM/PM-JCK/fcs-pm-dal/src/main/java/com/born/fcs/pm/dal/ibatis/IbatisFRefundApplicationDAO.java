/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.born.fcs.pm.dal.daointerface.FRefundApplicationDAO;
// auto generated imports
import com.born.fcs.pm.dal.dataobject.FRefundApplicationDO;

/**
 * An ibatis based implementation of dao interface
 * <tt>com.born.fcs.pm.dal.daointerface.FRefundApplicationDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/f_refund_application.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 *
 * @author peigen
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class IbatisFRefundApplicationDAO extends SqlMapClientDaoSupport implements
																		FRefundApplicationDAO {
	/**
	 * Insert one <tt>FRefundApplicationDO</tt> object to DB table
	 * <tt>f_refund_application</tt>, return primary key
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>insert into f_refund_application(form_id,project_code,project_name,attach,remark,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 * @param FRefundApplication
	 * @return long
	 * @throws DataAccessException
	 */
	public long insert(FRefundApplicationDO FRefundApplication) throws DataAccessException {
		if (FRefundApplication == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		
		getSqlMapClientTemplate().insert("MS-F-REFUND-APPLICATION-INSERT", FRefundApplication);
		
		return FRefundApplication.getRefundId();
	}
	
	/**
	 * Update DB table <tt>f_refund_application</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>update f_refund_application set form_id=?, project_code=?, project_name=?, attach=?, remark=? where (refund_id = ?)</tt>
	 *
	 * @param FRefundApplication
	 * @return int
	 * @throws DataAccessException
	 */
	public int update(FRefundApplicationDO FRefundApplication) throws DataAccessException {
		if (FRefundApplication == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		
		return getSqlMapClientTemplate().update("MS-F-REFUND-APPLICATION-UPDATE",
			FRefundApplication);
	}
	
	/**
	 * Update DB table <tt>f_refund_application</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>update f_refund_application set project_code=?, project_name=?, attach=?, remark=? where (form_id = ?)</tt>
	 *
	 * @param FRefundApplication
	 * @return int
	 * @throws DataAccessException
	 */
	public int updateByFormId(FRefundApplicationDO FRefundApplication) throws DataAccessException {
		if (FRefundApplication == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		
		return getSqlMapClientTemplate().update("MS-F-REFUND-APPLICATION-UPDATE-BY-FORM-ID",
			FRefundApplication);
	}
	
	/**
	 * Query DB table <tt>f_refund_application</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from f_refund_application where (refund_id = ?)</tt>
	 *
	 * @param refundId
	 * @return FRefundApplicationDO
	 * @throws DataAccessException
	 */
	public FRefundApplicationDO findById(long refundId) throws DataAccessException {
		Long param = new Long(refundId);
		
		return (FRefundApplicationDO) getSqlMapClientTemplate().queryForObject(
			"MS-F-REFUND-APPLICATION-FIND-BY-ID", param);
		
	}
	
	/**
	 * Query DB table <tt>f_refund_application</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from f_refund_application where (form_id = ?)</tt>
	 *
	 * @param formId
	 * @return FRefundApplicationDO
	 * @throws DataAccessException
	 */
	public FRefundApplicationDO findByFormId(long formId) throws DataAccessException {
		Long param = new Long(formId);
		
		return (FRefundApplicationDO) getSqlMapClientTemplate().queryForObject(
			"MS-F-REFUND-APPLICATION-FIND-BY-FORM-ID", param);
		
	}
	
	/**
	 * Query DB table <tt>f_refund_application</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from f_refund_application where (project_code = ?)</tt>
	 *
	 * @param projectCode
	 * @return List<FRefundApplicationDO>
	 * @throws DataAccessException
	 */
	public List<FRefundApplicationDO> findByProjectCode(String projectCode)
																			throws DataAccessException {
		
		return getSqlMapClientTemplate().queryForList(
			"MS-F-REFUND-APPLICATION-FIND-BY-PROJECT-CODE", projectCode);
		
	}
	
	/**
	 * Delete records from DB table <tt>f_refund_application</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>delete from f_refund_application where (refund_id = ?)</tt>
	 *
	 * @param refundId
	 * @return int
	 * @throws DataAccessException
	 */
	public int deleteById(long refundId) throws DataAccessException {
		Long param = new Long(refundId);
		
		return getSqlMapClientTemplate().delete("MS-F-REFUND-APPLICATION-DELETE-BY-ID", param);
	}
	
	/**
	 * Delete records from DB table <tt>f_refund_application</tt>.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>delete from f_refund_application where (form_id = ?)</tt>
	 *
	 * @param formId
	 * @return int
	 * @throws DataAccessException
	 */
	public int deleteByFormId(long formId) throws DataAccessException {
		Long param = new Long(formId);
		
		return getSqlMapClientTemplate().delete("MS-F-REFUND-APPLICATION-DELETE-BY-FORM-ID", param);
	}
	
	/**
	 * Query DB table <tt>f_refund_application</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select * from f_refund_application where (1 = 1)</tt>
	 *
	 * @param FRefundApplication
	 * @param limitStart
	 * @param pageSize
	 * @return List<FRefundApplicationDO>
	 * @throws DataAccessException
	 */
	public List<FRefundApplicationDO> findByCondition(FRefundApplicationDO FRefundApplication,
														long limitStart, long pageSize)
																						throws DataAccessException {
		if (FRefundApplication == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		
		Map param = new HashMap();
		
		param.put("FRefundApplication", FRefundApplication);
		param.put("limitStart", new Long(limitStart));
		param.put("pageSize", new Long(pageSize));
		
		return getSqlMapClientTemplate().queryForList("MS-F-REFUND-APPLICATION-FIND-BY-CONDITION",
			param);
		
	}
	
	/**
	 * Query DB table <tt>f_refund_application</tt> for records.
	 *
	 * <p>
	 * The sql statement for this operation is <br>
	 * <tt>select COUNT(*) from f_refund_application where (1 = 1)</tt>
	 *
	 * @param FRefundApplication
	 * @return long
	 * @throws DataAccessException
	 */
	public long findByConditionCount(FRefundApplicationDO FRefundApplication)
																				throws DataAccessException {
		if (FRefundApplication == null) {
			throw new IllegalArgumentException("Can't select by a null data object.");
		}
		Map param = new HashMap();
		
		param.put("FRefundApplication", FRefundApplication);
		
		Long retObj = (Long) getSqlMapClientTemplate().queryForObject(
			"MS-F-REFUND-APPLICATION-FIND-BY-CONDITION-COUNT", param);
		
		if (retObj == null) {
			return 0;
		} else {
			return retObj.longValue();
		}
		
	}
	
}