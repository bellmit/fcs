/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FFileListDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_file_list</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_file_list.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FFileListDAO {
	/**
	 *  Insert one <tt>FFileListDO</tt> object to DB table <tt>f_file_list</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_file_list(file_id,file_type,file_name,archive_file_name,file_page,file_path,remark,input_remark,receive_time,type,is_archive,parent_id,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FFileList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FFileListDO FFileList) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_file_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_file_list set file_id=?, file_type=?, file_name=?, archive_file_name=?, file_page=?, file_path=?, remark=?, input_remark=?, receive_time=?, type=?, is_archive=?, parent_id=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FFileList
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FFileListDO FFileList) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FFileListDO
	 *	@throws DataAccessException
	 */	 
    public FFileListDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where ((file_id = ?) AND (type = ?))</tt>
	 *
	 *	@param fileId
	 *	@param type
	 *	@return List<FFileListDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListDO> findByFileId(long fileId, String type) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where (type = ?) order by file_type ASC, file_type ASC, raw_add_time ASC</tt>
	 *
	 *	@param type
	 *	@return List<FFileListDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListDO> findByType(String type) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where ((type = ?) AND ((is_archive IS NULL) OR (is_archive = ''))) order by file_type ASC, file_name ASC</tt>
	 *
	 *	@param type
	 *	@return List<FFileListDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListDO> findByTypeAndNotArchive(String type) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where (parent_id = ?) order by file_type ASC</tt>
	 *
	 *	@param parentId
	 *	@return List<FFileListDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListDO> findByParentId(long parentId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_file_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_list where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_file_list</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_list where (file_id = ?)</tt>
	 *
	 *	@param fileId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFileId(long fileId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_list where (1 = 1)</tt>
	 *
	 *	@param FFileList
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FFileListDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileListDO> findByCondition(FFileListDO FFileList, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_file_list</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_file_list where (1 = 1)</tt>
	 *
	 *	@param FFileList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FFileListDO FFileList) throws DataAccessException;

}