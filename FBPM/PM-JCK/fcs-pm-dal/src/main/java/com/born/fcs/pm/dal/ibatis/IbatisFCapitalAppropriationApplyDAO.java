/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FCapitalAppropriationApplyDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FCapitalAppropriationApplyDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FCapitalAppropriationApplyDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_capital_appropriation_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFCapitalAppropriationApplyDAO extends SqlMapClientDaoSupport implements FCapitalAppropriationApplyDAO {
	/**
	 *  Insert one <tt>FCapitalAppropriationApplyDO</tt> object to DB table <tt>f_capital_appropriation_apply</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_capital_appropriation_apply(form_id,out_biz_no,project_code,project_name,project_type,attach,is_receipt,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FCapitalAppropriationApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FCapitalAppropriationApplyDO FCapitalAppropriationApply) throws DataAccessException {
    	if (FCapitalAppropriationApply == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-CAPITAL-APPROPRIATION-APPLY-INSERT", FCapitalAppropriationApply);

        return FCapitalAppropriationApply.getApplyId();
    }

	/**
	 *  Update DB table <tt>f_capital_appropriation_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_capital_appropriation_apply set form_id=?, out_biz_no=?, project_code=?, project_name=?, project_type=?, attach=?, is_receipt=?, remark=? where (apply_id = ?)</tt>
	 *
	 *	@param FCapitalAppropriationApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FCapitalAppropriationApplyDO FCapitalAppropriationApply) throws DataAccessException {
    	if (FCapitalAppropriationApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CAPITAL-APPROPRIATION-APPLY-UPDATE", FCapitalAppropriationApply);
    }

	/**
	 *  Update DB table <tt>f_capital_appropriation_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_capital_appropriation_apply set out_biz_no=?, project_code=?, project_name=?, project_type=?, attach=?, is_receipt=?, remark=? where (form_id = ?)</tt>
	 *
	 *	@param FCapitalAppropriationApply
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FCapitalAppropriationApplyDO FCapitalAppropriationApply) throws DataAccessException {
    	if (FCapitalAppropriationApply == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-CAPITAL-APPROPRIATION-APPLY-UPDATE-BY-FORM-ID", FCapitalAppropriationApply);
    }

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return FCapitalAppropriationApplyDO
	 *	@throws DataAccessException
	 */	 
    public FCapitalAppropriationApplyDO findById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return (FCapitalAppropriationApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-CAPITAL-APPROPRIATION-APPLY-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FCapitalAppropriationApplyDO
	 *	@throws DataAccessException
	 */	 
    public FCapitalAppropriationApplyDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FCapitalAppropriationApplyDO) getSqlMapClientTemplate().queryForObject("MS-F-CAPITAL-APPROPRIATION-APPLY-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FCapitalAppropriationApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCapitalAppropriationApplyDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-F-CAPITAL-APPROPRIATION-APPLY-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_capital_appropriation_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_capital_appropriation_apply where (apply_id = ?)</tt>
	 *
	 *	@param applyId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long applyId) throws DataAccessException {
        Long param = new Long(applyId);

        return getSqlMapClientTemplate().delete("MS-F-CAPITAL-APPROPRIATION-APPLY-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_capital_appropriation_apply</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_capital_appropriation_apply where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-CAPITAL-APPROPRIATION-APPLY-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_capital_appropriation_apply where (1 = 1)</tt>
	 *
	 *	@param FCapitalAppropriationApply
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FCapitalAppropriationApplyDO>
	 *	@throws DataAccessException
	 */	 
    public List<FCapitalAppropriationApplyDO> findByCondition(FCapitalAppropriationApplyDO FCapitalAppropriationApply, long limitStart, long pageSize) throws DataAccessException {
    	if (FCapitalAppropriationApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("FCapitalAppropriationApply", FCapitalAppropriationApply);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-F-CAPITAL-APPROPRIATION-APPLY-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>f_capital_appropriation_apply</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from f_capital_appropriation_apply where (1 = 1)</tt>
	 *
	 *	@param FCapitalAppropriationApply
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FCapitalAppropriationApplyDO FCapitalAppropriationApply) throws DataAccessException {
    	if (FCapitalAppropriationApply == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-F-CAPITAL-APPROPRIATION-APPLY-FIND-BY-CONDITION-COUNT", FCapitalAppropriationApply);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}