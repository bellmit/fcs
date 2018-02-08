/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.fm.dal.daointerface.SysForecastParamDAO;


// auto generated imports
import com.born.fcs.fm.dal.dataobject.SysForecastParamDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.fm.dal.daointerface.SysForecastParamDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/sys_forecast_param.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisSysForecastParamDAO extends SqlMapClientDaoSupport implements SysForecastParamDAO {
	/**
	 *  Insert one <tt>SysForecastParamDO</tt> object to DB table <tt>sys_forecast_param</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into sys_forecast_param(id,fund_direction,forecast_type,forecast_time,forecast_time_type,forecast_other_time,forecast_other_time_type,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param sysForecastParam
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SysForecastParamDO sysForecastParam) throws DataAccessException {
    	if (sysForecastParam == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-SYS-FORECAST-PARAM-INSERT", sysForecastParam);

        return sysForecastParam.getId();
    }

	/**
	 *  Update DB table <tt>sys_forecast_param</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update sys_forecast_param set fund_direction=?, forecast_type=?, forecast_time=?, forecast_time_type=?, forecast_other_time=?, forecast_other_time_type=? where (id = ?)</tt>
	 *
	 *	@param sysForecastParam
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SysForecastParamDO sysForecastParam) throws DataAccessException {
    	if (sysForecastParam == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-SYS-FORECAST-PARAM-UPDATE", sysForecastParam);
    }

	/**
	 *  Query DB table <tt>sys_forecast_param</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_forecast_param where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return SysForecastParamDO
	 *	@throws DataAccessException
	 */	 
    public SysForecastParamDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (SysForecastParamDO) getSqlMapClientTemplate().queryForObject("MS-SYS-FORECAST-PARAM-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>sys_forecast_param</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_forecast_param where ((fund_direction = ?) AND (forecast_type = ?))</tt>
	 *
	 *	@param fundDirection
	 *	@param forecastType
	 *	@return SysForecastParamDO
	 *	@throws DataAccessException
	 */	 
    public SysForecastParamDO findByFundDirectionAndForecastType(String fundDirection, String forecastType) throws DataAccessException {
        Map param = new HashMap();

        param.put("fundDirection", fundDirection);
        param.put("forecastType", forecastType);

        return (SysForecastParamDO) getSqlMapClientTemplate().queryForObject("MS-SYS-FORECAST-PARAM-FIND-BY-FUND-DIRECTION-AND-FORECAST-TYPE", param);

    }

	/**
	 *  Query DB table <tt>sys_forecast_param</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_forecast_param where (1 = 1)</tt>
	 *
	 *	@return List<SysForecastParamDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysForecastParamDO> findAll() throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-SYS-FORECAST-PARAM-FIND-ALL", null);

    }

	/**
	 *  Delete records from DB table <tt>sys_forecast_param</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sys_forecast_param where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-SYS-FORECAST-PARAM-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>sys_forecast_param</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_forecast_param where (1 = 1)</tt>
	 *
	 *	@param sysForecastParam
	 *	@param limitStart
	 *	@param pageSize
	 *	@param sortCol
	 *	@param sortOrder
	 *	@return List<SysForecastParamDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysForecastParamDO> findByCondition(SysForecastParamDO sysForecastParam, long limitStart, long pageSize, String sortCol, String sortOrder) throws DataAccessException {
    	if (sysForecastParam == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("sysForecastParam", sysForecastParam);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);

        return getSqlMapClientTemplate().queryForList("MS-SYS-FORECAST-PARAM-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>sys_forecast_param</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from sys_forecast_param where (1 = 1)</tt>
	 *
	 *	@param sysForecastParam
	 *	@param deptIdList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SysForecastParamDO sysForecastParam, List deptIdList) throws DataAccessException {
    	if (sysForecastParam == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("sysForecastParam", sysForecastParam);
        param.put("deptIdList", deptIdList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-SYS-FORECAST-PARAM-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}