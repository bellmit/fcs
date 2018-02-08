/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationMabilityReviewDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationMabilityReviewDO;
import org.springframework.dao.DataAccessException;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationMabilityReviewDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_mability_review.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 

public class IbatisFInvestigationMabilityReviewDAO extends SqlMapClientDaoSupport implements FInvestigationMabilityReviewDAO {
	/**
	 *  Insert one <tt>FInvestigationMabilityReviewDO</tt> object to DB table <tt>f_investigation_mability_review</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_mability_review(form_id,project_code,project_name,customer_id,customer_name,leader_review,staff_review,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationMabilityReview
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationMabilityReviewDO FInvestigationMabilityReview) throws DataAccessException {
    	if (FInvestigationMabilityReview == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-MABILITY-REVIEW-INSERT", FInvestigationMabilityReview);

        return FInvestigationMabilityReview.getMaReviewId();
    }

	/**
	 *  Update DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mability_review set form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, leader_review=?, staff_review=? where (ma_review_id = ?)</tt>
	 *
	 *	@param FInvestigationMabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationMabilityReviewDO FInvestigationMabilityReview) throws DataAccessException {
    	if (FInvestigationMabilityReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MABILITY-REVIEW-UPDATE", FInvestigationMabilityReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mability_review set project_code=?, project_name=?, customer_id=?, customer_name=?, leader_review=?, staff_review=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationMabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationMabilityReviewDO FInvestigationMabilityReview) throws DataAccessException {
    	if (FInvestigationMabilityReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MABILITY-REVIEW-UPDATE-BY-FORM-ID", FInvestigationMabilityReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mability_review set form_id=?, project_name=?, customer_id=?, customer_name=?, leader_review=?, staff_review=? where (project_code = ?)</tt>
	 *
	 *	@param FInvestigationMabilityReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByProjectCode(FInvestigationMabilityReviewDO FInvestigationMabilityReview) throws DataAccessException {
    	if (FInvestigationMabilityReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MABILITY-REVIEW-UPDATE-BY-PROJECT-CODE", FInvestigationMabilityReview);
    }

	/**
	 *  Query DB table <tt>f_investigation_mability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mability_review where (ma_review_id = ?)</tt>
	 *
	 *	@param maReviewId
	 *	@return FInvestigationMabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMabilityReviewDO findById(long maReviewId) throws DataAccessException {
        Long param = new Long(maReviewId);

        return (FInvestigationMabilityReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MABILITY-REVIEW-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_mability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mability_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationMabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMabilityReviewDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FInvestigationMabilityReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MABILITY-REVIEW-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_mability_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mability_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return FInvestigationMabilityReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMabilityReviewDO findByProjectCode(String projectCode) throws DataAccessException {

        return (FInvestigationMabilityReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MABILITY-REVIEW-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mability_review where (ma_review_id = ?)</tt>
	 *
	 *	@param maReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long maReviewId) throws DataAccessException {
        Long param = new Long(maReviewId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MABILITY-REVIEW-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mability_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MABILITY-REVIEW-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mability_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mability_review where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MABILITY-REVIEW-DELETE-BY-PROJECT-CODE", projectCode);
    }

}