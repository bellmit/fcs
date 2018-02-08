/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.RecoverProjectTrackRecordDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>recover_project_track_record</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/recover_project_track_record.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface RecoverProjectTrackRecordDAO {
	/**
	 *  Insert one <tt>RecoverProjectTrackRecordDO</tt> object to DB table <tt>recover_project_track_record</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into recover_project_track_record(recover_id,record_type,record_type_name,propose_time,pay_time,judge_time,seal_up_date,seal_up_object,seal_up_start_time,seal_up_end_time,seal_up_remark,detain_date,detain_object,detain_start_time,detain_end_time,detain_remark,freeze_date,freeze_object,freeze_start_time,freeze_end_time,freeze_remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param recoverProjectTrackRecord
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(RecoverProjectTrackRecordDO recoverProjectTrackRecord) throws DataAccessException;

	/**
	 *  Update DB table <tt>recover_project_track_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update recover_project_track_record set recover_id=?, record_type=?, record_type_name=?, propose_time=?, pay_time=?, judge_time=?, seal_up_date=?, seal_up_object=?, seal_up_start_time=?, seal_up_end_time=?, seal_up_remark=?, detain_date=?, detain_object=?, detain_start_time=?, detain_end_time=?, detain_remark=?, freeze_date=?, freeze_object=?, freeze_start_time=?, freeze_end_time=?, freeze_remark=? where (id = ?)</tt>
	 *
	 *	@param recoverProjectTrackRecord
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(RecoverProjectTrackRecordDO recoverProjectTrackRecord) throws DataAccessException;

	/**
	 *  Query DB table <tt>recover_project_track_record</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from recover_project_track_record where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return RecoverProjectTrackRecordDO
	 *	@throws DataAccessException
	 */	 
    public RecoverProjectTrackRecordDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>recover_project_track_record</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from recover_project_track_record where (recover_id = ?)</tt>
	 *
	 *	@param recoverId
	 *	@return List<RecoverProjectTrackRecordDO>
	 *	@throws DataAccessException
	 */	 
    public List<RecoverProjectTrackRecordDO> findByRecoverId(long recoverId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>recover_project_track_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from recover_project_track_record where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>recover_project_track_record</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from recover_project_track_record where (recover_id = ?)</tt>
	 *
	 *	@param recoverId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoverId(long recoverId) throws DataAccessException;

}