/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.daointerface;

// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectRecoveryLitigationCertificateDO;
import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access database table <tt>project_recovery_litigation_certificate</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_certificate.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */

public interface ProjectRecoveryLitigationCertificateDAO {
	/**
	 *  Insert one <tt>ProjectRecoveryLitigationCertificateDO</tt> object to DB table <tt>project_recovery_litigation_certificate</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_recovery_litigation_certificate(project_recovery_id,notary_organ,agent_law_firm,agent_attorney,notarial,apply_time,pay_time,certificate,memo,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectRecoveryLitigationCertificate
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectRecoveryLitigationCertificateDO projectRecoveryLitigationCertificate) throws DataAccessException;

	/**
	 *  Update DB table <tt>project_recovery_litigation_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_recovery_litigation_certificate set project_recovery_id=?, notary_organ=?, agent_law_firm=?, agent_attorney=?, notarial=?, apply_time=?, pay_time=?, certificate=?, memo=? where (id = ?)</tt>
	 *
	 *	@param projectRecoveryLitigationCertificate
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectRecoveryLitigationCertificateDO projectRecoveryLitigationCertificate) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_recovery_litigation_certificate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_certificate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectRecoveryLitigationCertificateDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationCertificateDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>project_recovery_litigation_certificate</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_recovery_litigation_certificate where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return ProjectRecoveryLitigationCertificateDO
	 *	@throws DataAccessException
	 */	 
    public ProjectRecoveryLitigationCertificateDO findByRecoveryId(long projectRecoveryId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_certificate where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>project_recovery_litigation_certificate</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_recovery_litigation_certificate where (project_recovery_id = ?)</tt>
	 *
	 *	@param projectRecoveryId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRecoveryId(long projectRecoveryId) throws DataAccessException;

}