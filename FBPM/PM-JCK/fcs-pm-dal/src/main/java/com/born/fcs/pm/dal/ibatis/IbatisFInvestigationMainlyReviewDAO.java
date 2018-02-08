/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationMainlyReviewDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationMainlyReviewDO;
import org.springframework.dao.DataAccessException;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationMainlyReviewDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_mainly_review.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("rawtypes") 
public class IbatisFInvestigationMainlyReviewDAO extends SqlMapClientDaoSupport implements FInvestigationMainlyReviewDAO {
	/**
	 *  Insert one <tt>FInvestigationMainlyReviewDO</tt> object to DB table <tt>f_investigation_mainly_review</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_mainly_review(owner,form_id,project_code,project_name,customer_id,customer_name,established_time,operating_term,legal_persion,org_code,living_address,actual_control_person,enterprise_type,work_address,is_one_cert,busi_license_no,tax_certificate_no,local_tax_no,loan_card_no,last_check_year,busi_scope,customer_dev_evolution,related_trade,related_guarantee,related_capital_tieup,busi_qualification,busi_place,query_time,loan_repay_situation_customer,loan_repay_situation_persional,other,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationMainlyReview
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationMainlyReviewDO FInvestigationMainlyReview) throws DataAccessException {
    	if (FInvestigationMainlyReview == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-MAINLY-REVIEW-INSERT", FInvestigationMainlyReview);

        return FInvestigationMainlyReview.getMReviewId();
    }

	/**
	 *  Update DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mainly_review set owner=?, form_id=?, project_code=?, project_name=?, customer_id=?, customer_name=?, established_time=?, operating_term=?, legal_persion=?, org_code=?, living_address=?, actual_control_person=?, enterprise_type=?, work_address=?, is_one_cert=?, busi_license_no=?, tax_certificate_no=?, local_tax_no=?, loan_card_no=?, last_check_year=?, busi_scope=?, customer_dev_evolution=?, related_trade=?, related_guarantee=?, related_capital_tieup=?, busi_qualification=?, busi_place=?, query_time=?, loan_repay_situation_customer=?, loan_repay_situation_persional=?, other=? where (m_review_id = ?)</tt>
	 *
	 *	@param FInvestigationMainlyReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationMainlyReviewDO FInvestigationMainlyReview) throws DataAccessException {
    	if (FInvestigationMainlyReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MAINLY-REVIEW-UPDATE", FInvestigationMainlyReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mainly_review set owner=?, project_code=?, project_name=?, customer_id=?, customer_name=?, established_time=?, operating_term=?, legal_persion=?, org_code=?, living_address=?, actual_control_person=?, enterprise_type=?, work_address=?, is_one_cert=?, busi_license_no=?, tax_certificate_no=?, local_tax_no=?, loan_card_no=?, last_check_year=?, busi_scope=?, customer_dev_evolution=?, related_trade=?, related_guarantee=?, related_capital_tieup=?, busi_qualification=?, busi_place=?, query_time=?, loan_repay_situation_customer=?, loan_repay_situation_persional=?, other=? where (form_id = ?)</tt>
	 *
	 *	@param FInvestigationMainlyReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormId(FInvestigationMainlyReviewDO FInvestigationMainlyReview) throws DataAccessException {
    	if (FInvestigationMainlyReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MAINLY-REVIEW-UPDATE-BY-FORM-ID", FInvestigationMainlyReview);
    }

	/**
	 *  Update DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mainly_review set project_code=?, project_name=?, customer_id=?, customer_name=?, established_time=?, operating_term=?, legal_persion=?, org_code=?, living_address=?, actual_control_person=?, enterprise_type=?, work_address=?, is_one_cert=?, busi_license_no=?, tax_certificate_no=?, local_tax_no=?, loan_card_no=?, last_check_year=?, busi_scope=?, customer_dev_evolution=?, related_trade=?, related_guarantee=?, related_capital_tieup=?, busi_qualification=?, busi_place=?, query_time=?, loan_repay_situation_customer=?, loan_repay_situation_persional=?, other=? where ((form_id = ?) AND (owner = ?))</tt>
	 *
	 *	@param FInvestigationMainlyReview
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateByFormIdAndOwner(FInvestigationMainlyReviewDO FInvestigationMainlyReview) throws DataAccessException {
    	if (FInvestigationMainlyReview == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-MAINLY-REVIEW-UPDATE-BY-FORM-ID-AND-OWNER", FInvestigationMainlyReview);
    }

	/**
	 *  Query DB table <tt>f_investigation_mainly_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review where (m_review_id = ?)</tt>
	 *
	 *	@param MReviewId
	 *	@return FInvestigationMainlyReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMainlyReviewDO findById(long MReviewId) throws DataAccessException {
        Long param = new Long(MReviewId);

        return (FInvestigationMainlyReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MAINLY-REVIEW-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_mainly_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return FInvestigationMainlyReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMainlyReviewDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (FInvestigationMainlyReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MAINLY-REVIEW-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_mainly_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review where ((form_id = ?) AND (owner = ?))</tt>
	 *
	 *	@param formId
	 *	@param owner
	 *	@return FInvestigationMainlyReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMainlyReviewDO findByFormIdAndOwner(long formId, String owner) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("owner", owner);

        return (FInvestigationMainlyReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MAINLY-REVIEW-FIND-BY-FORM-ID-AND-OWNER", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_mainly_review</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review where ((project_code = ?) AND (owner = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param owner
	 *	@return FInvestigationMainlyReviewDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMainlyReviewDO findByProjectCodeAndOwner(String projectCode, String owner) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("owner", owner);

        return (FInvestigationMainlyReviewDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-MAINLY-REVIEW-FIND-BY-PROJECT-CODE-AND-OWNER", param);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review where (m_review_id = ?)</tt>
	 *
	 *	@param MReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long MReviewId) throws DataAccessException {
        Long param = new Long(MReviewId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MAINLY-REVIEW-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MAINLY-REVIEW-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review where ((form_id = ?) AND (owner = ?))</tt>
	 *
	 *	@param formId
	 *	@param owner
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormIdAndOwner(long formId, String owner) throws DataAccessException {
        Map param = new HashMap();

        param.put("formId", new Long(formId));
        param.put("owner", owner);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MAINLY-REVIEW-DELETE-BY-FORM-ID-AND-OWNER", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review where ((project_code = ?) AND (owner = ?))</tt>
	 *
	 *	@param projectCode
	 *	@param owner
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCodeAndOwner(String projectCode, String owner) throws DataAccessException {
        Map param = new HashMap();

        param.put("projectCode", projectCode);
        param.put("owner", owner);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-MAINLY-REVIEW-DELETE-BY-PROJECT-CODE-AND-OWNER", param);
    }

}