/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FProjectEquityStructureDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_project_equity_structure</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_equity_structure.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FProjectEquityStructureDAO {
	/**
	 *  Insert one <tt>FProjectEquityStructureDO</tt> object to DB table <tt>f_project_equity_structure</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_project_equity_structure(form_id,project_code,project_name,customer_id,customer_name,stockholder,capital_contributions,amount_type,contribution_way,equity_ratio,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_equity_structure set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, stockholder=?, capital_contributions=?, amount_type=?, contribution_way=?, equity_ratio=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_project_equity_structure set project_code=?, project_name=?, customer_id=?, customer_name=? where (form_id = ?)</tt>
	 *
	 *	@param FProjectEquityStructure
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateProjectAndCustomerInfoByFormId(FProjectEquityStructureDO FProjectEquityStructure) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FProjectEquityStructureDO
	 *	@throws DataAccessException
	 */	 
    public FProjectEquityStructureDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (form_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param formId
	 *	@return List<FProjectEquityStructureDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectEquityStructureDO> findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_project_equity_structure</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_project_equity_structure where (project_code = ?) order by sort_order ASC</tt>
	 *
	 *	@param projectCode
	 *	@return List<FProjectEquityStructureDO>
	 *	@throws DataAccessException
	 */	 
    public List<FProjectEquityStructureDO> findByProjectCode(String projectCode) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_project_equity_structure</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_project_equity_structure where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException;

}