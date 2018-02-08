/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationMainlyReviewCertificateDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>f_investigation_mainly_review_certificate</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_mainly_review_certificate.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FInvestigationMainlyReviewCertificateDAO {
	/**
	 *  Insert one <tt>FInvestigationMainlyReviewCertificateDO</tt> object to DB table <tt>f_investigation_mainly_review_certificate</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_mainly_review_certificate(m_review_id,owner,certificate_name,certificate_code,valid_date,certificate_url,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationMainlyReviewCertificate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationMainlyReviewCertificateDO FInvestigationMainlyReviewCertificate) throws DataAccessException;

	/**
	 *  Update DB table <tt>f_investigation_mainly_review_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_mainly_review_certificate set m_review_id=?, owner=?, certificate_name=?, certificate_code=?, valid_date=?, certificate_url=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationMainlyReviewCertificate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationMainlyReviewCertificateDO FInvestigationMainlyReviewCertificate) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_mainly_review_certificate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review_certificate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationMainlyReviewCertificateDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationMainlyReviewCertificateDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>f_investigation_mainly_review_certificate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_mainly_review_certificate where ((owner = ?) AND (m_review_id = ?)) order by sort_order ASC</tt>
	 *
	 *	@param owner
	 *	@param MReviewId
	 *	@return List<FInvestigationMainlyReviewCertificateDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationMainlyReviewCertificateDO> findByOwnerAndReviewId(String owner, long MReviewId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review_certificate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>f_investigation_mainly_review_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_mainly_review_certificate where ((owner = ?) AND (m_review_id = ?))</tt>
	 *
	 *	@param owner
	 *	@param MReviewId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByOwnerAndReviewId(String owner, long MReviewId) throws DataAccessException;

}