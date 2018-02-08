/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemeGuarantorDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.FInvestigationCreditSchemeGuarantorDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FInvestigationCreditSchemeGuarantorDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_investigation_credit_scheme_guarantor.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings("unchecked")

public class IbatisFInvestigationCreditSchemeGuarantorDAO extends SqlMapClientDaoSupport implements FInvestigationCreditSchemeGuarantorDAO {
	/**
	 *  Insert one <tt>FInvestigationCreditSchemeGuarantorDO</tt> object to DB table <tt>f_investigation_credit_scheme_guarantor</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into f_investigation_credit_scheme_guarantor(scheme_id,guarantor_type,guarantor,guarantee_amount,guarantee_way,sort_order,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemeGuarantor
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FInvestigationCreditSchemeGuarantorDO FInvestigationCreditSchemeGuarantor) throws DataAccessException {
    	if (FInvestigationCreditSchemeGuarantor == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-INSERT", FInvestigationCreditSchemeGuarantor);

        return FInvestigationCreditSchemeGuarantor.getId();
    }

	/**
	 *  Update DB table <tt>f_investigation_credit_scheme_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update f_investigation_credit_scheme_guarantor set scheme_id=?, guarantor_type=?, guarantor=?, guarantee_amount=?, guarantee_way=?, sort_order=? where (id = ?)</tt>
	 *
	 *	@param FInvestigationCreditSchemeGuarantor
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FInvestigationCreditSchemeGuarantorDO FInvestigationCreditSchemeGuarantor) throws DataAccessException {
    	if (FInvestigationCreditSchemeGuarantor == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-UPDATE", FInvestigationCreditSchemeGuarantor);
    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_guarantor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_guarantor where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FInvestigationCreditSchemeGuarantorDO
	 *	@throws DataAccessException
	 */	 
    public FInvestigationCreditSchemeGuarantorDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FInvestigationCreditSchemeGuarantorDO) getSqlMapClientTemplate().queryForObject("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>f_investigation_credit_scheme_guarantor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from f_investigation_credit_scheme_guarantor where (scheme_id = ?) order by sort_order ASC</tt>
	 *
	 *	@param schemeId
	 *	@return List<FInvestigationCreditSchemeGuarantorDO>
	 *	@throws DataAccessException
	 */	 
    public List<FInvestigationCreditSchemeGuarantorDO> findBySchemeId(long schemeId) throws DataAccessException {
        Long param = new Long(schemeId);

        return getSqlMapClientTemplate().queryForList("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-FIND-BY-SCHEME-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_guarantor where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>f_investigation_credit_scheme_guarantor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from f_investigation_credit_scheme_guarantor where (scheme_id = ?)</tt>
	 *
	 *	@param schemeId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteBySchemeId(long schemeId) throws DataAccessException {
        Long param = new Long(schemeId);

        return getSqlMapClientTemplate().delete("MS-F-INVESTIGATION-CREDIT-SCHEME-GUARANTOR-DELETE-BY-SCHEME-ID", param);
    }

}