/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FFileListStatusDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_file_list_status</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_file_list_status.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FFileListStatusDAO {
	/**
	 *  Insert one <tt>FFileListStatusDO</tt> object to DB table <tt>f_file_list_status</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_file_list_status(type,check_status,raw_add_time) values (?, ?, ?)</tt>
	 *
	 *	@param FFileListStatus
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FFileListStatusDO FFileListStatus) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_file_list_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_file_list_status set type=?, check_status=? where (id = ?)</tt>
	 *
	 *	@param FFileListStatus
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FFileListStatusDO FFileListStatus) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list_status where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FFileListStatusDO
	 *	@throws DataAccessException
	 */	 
    public FFileListStatusDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list_status where (type = ?)</tt>
	 *
	 *	@param type
	 *	@return FFileListStatusDO
	 *	@throws DataAccessException
	 */	 
    public FFileListStatusDO findByType(String type) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_file_list_status</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_list_status where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list_status where (1 = 1)</tt>
	 *
	 *	@param FFileListStatus
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FFileListStatusDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListStatusDO> findByCondition(FFileListStatusDO FFileListStatus, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list_status</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_file_list_status where (1 = 1)</tt>
	 *
	 *	@param FFileListStatus
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FFileListStatusDO FFileListStatus) throws DataAccessException;

}