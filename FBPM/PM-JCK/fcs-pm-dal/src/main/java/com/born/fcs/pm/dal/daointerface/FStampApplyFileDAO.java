/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FStampApplyFileDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_stamp_apply_file</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_stamp_apply_file.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FStampApplyFileDAO {
	/**
	 *  Insert one <tt>FStampApplyFileDO</tt> object to DB table <tt>f_stamp_apply_file</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_stamp_apply_file(apply_id,replace_apply_id,contract_code,file_name,file_conent,legal_chapter_num,cachet_num,is_replace_old,old_file_num,sort_order,remark,old_legal_chapter_num,old_cachet_num,old_file_name,old_file_content,source,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FStampApplyFile
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FStampApplyFileDO FStampApplyFile) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_stamp_apply_file</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_stamp_apply_file set apply_id=?, contract_code=?, replace_apply_id=?, file_name=?, file_conent=?, legal_chapter_num=?, cachet_num=?, is_replace_old=?, old_file_num=?, sort_order=?, remark=?, old_legal_chapter_num=?, old_cachet_num=?, old_file_name=?, old_file_content=?, source=? where (id = ?)</tt>
	 *
	 *	@param FStampApplyFile
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FStampApplyFileDO FStampApplyFile) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_stamp_apply_file</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_stamp_apply_file where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FStampApplyFileDO
	 *	@throws DataAccessException
	 */	 
    public FStampApplyFileDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_stamp_apply_file</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_stamp_apply_file where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return List<FStampApplyFileDO>
	 *	@throws DataAccessException
	 */	 
    public List<FStampApplyFileDO> findByApplyId(long applyId) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_stamp_apply_file</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_stamp_apply_file where (replace_apply_id = ?)</tt>
	 *
	 *	@param replaceApplyId
	 *	@return List<FStampApplyFileDO>
	 *	@throws DataAccessException
	 */	 
    public List<FStampApplyFileDO> findByReplaceApplyId(long replaceApplyId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_stamp_apply_file</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_stamp_apply_file where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_stamp_apply_file</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_stamp_apply_file where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByApplyId(long applyId) throws DataAccessException;

}