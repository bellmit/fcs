/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FFileOutputDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FFileOutputDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FFileOutputDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_file_output.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFFileOutputDAO extends SqlMapClientDaoSupport implements FFileOutputDAO {
	/**
	 *  Insert one <tt>FFileOutputDO</tt> object to DB table <tt>f_file_output</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_file_output(file_id,form_id,file_code,project_code,project_name,customer_id,customer_name,apply_man_id,apply_man,apply_time,apply_dept_code,apply_dept,output_reason,output_detail_ids,output_detail,hand_over_man_id,hand_over_man,hand_over_time,receive_dept,receive_man_id,receive_man,hand_over_dept,receive_time,file_form_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FFileOutput
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FFileOutputDO FFileOutput) throws DataAccessException {
    	if (FFileOutput == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-FILE-OUTPUT-INSERT", FFileOutput);

        return FFileOutput.getId();
    }

	/**
	 *  Update DB table <tt>f_file_output</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_file_output set file_id=?, file_code=?, project_code=?, project_name=?, customer_id=?, customer_name=?, apply_man_id=?, apply_man=?, apply_time=?, apply_dept_code=?, apply_dept=?, output_reason=?, output_detail_ids=?, output_detail=?, hand_over_man_id=?, hand_over_man=?, hand_over_time=?, receive_dept=?, receive_man_id=?, receive_man=?, hand_over_dept=?, receive_time=? where (id = ?)</tt>
	 *
	 *	@param FFileOutput
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FFileOutputDO FFileOutput) throws DataAccessException {
    	if (FFileOutput == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-FILE-OUTPUT-UPDATE", FFileOutput);
    }

	/**
	 *  Update DB table <tt>f_file_output</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_file_output set file_id=?, file_code=?, project_code=?, project_name=?, customer_id=?, customer_name=?, apply_man_id=?, apply_man=?, apply_time=?, apply_dept_code=?, apply_dept=?, output_reason=?, output_detail_ids=?, output_detail=?, hand_over_man_id=?, hand_over_man=?, hand_over_time=?, receive_dept=?, receive_man_id=?, receive_man=?, hand_over_dept=?, receive_time=? where (form_id = ?)</tt>
	 *
	 *	@param FFileOutput
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FFileOutputDO FFileOutput) throws DataAccessException {
    	if (FFileOutput == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-FILE-OUTPUT-UPDATE-BY-FORM-ID", FFileOutput);
    }

	/**
	 *  Query DB table <tt>f_file_output</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_output where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FFileOutputDO
	 *	@throws DataAccessException
	 */	 
    public FFileOutputDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FFileOutputDO) getSqlMapClientTemplate().queryForObject("MS-F-FILE-OUTPUT-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_file_output</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_output where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FFileOutputDO
	 *	@throws DataAccessException
	 */	 
    public FFileOutputDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FFileOutputDO) getSqlMapClientTemplate().queryForObject("MS-F-FILE-OUTPUT-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_file_output</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_output where (file_id = ?)</tt>
	 *
	 *	@param fileId
	 *	@return FFileOutputDO
	 *	@throws DataAccessException
	 */	 
    public FFileOutputDO findByFileId(long fileId) throws DataAccessException {
        Long param = new Long(fileId);

        return (FFileOutputDO) getSqlMapClientTemplate().queryForObject("MS-F-FILE-OUTPUT-FIND-BY-FILE-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_file_output</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_output where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-FILE-OUTPUT-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_file_output</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_output where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-FILE-OUTPUT-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_file_output</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_file_output where (file_id = ?)</tt>
	 *
	 *	@param fileId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFileId(long fileId) throws DataAccessException {
        Long param = new Long(fileId);

        return getSqlMapClientTemplate().delete("MS-F-FILE-OUTPUT-DELETE-BY-FILE-ID", param);
    }

	/**
	 *  Query DB table <tt>f_file_output</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_file_output where (1 = 1)</tt>
	 *
	 *	@param FFileOutput
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FFileOutputDO>
	 *	@throws DataAccessException
	 */	 
    public List<FFileOutputDO> findByCondition(FFileOutputDO FFileOutput, long limitStart, long pageSize) throws DataAccessException {
    	if (FFileOutput == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FFileOutput", FFileOutput);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-FILE-OUTPUT-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_file_output</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_file_output where (1 = 1)</tt>
	 *
	 *	@param FFileOutput
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FFileOutputDO FFileOutput) throws DataAccessException {
    	if (FFileOutput == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-FILE-OUTPUT-FIND-BY-CONDITION-COUNT", FFileOutput);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}