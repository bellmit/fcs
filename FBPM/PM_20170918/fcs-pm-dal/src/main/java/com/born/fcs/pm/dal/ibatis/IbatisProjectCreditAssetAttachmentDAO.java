/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.fcs.pm.dal.daointerface.ProjectCreditAssetAttachmentDAO;


// auto generated imports
import com.born.fcs.pm.dal.dataobject.ProjectCreditAssetAttachmentDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.ProjectCreditAssetAttachmentDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_credit_asset_attachment.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisProjectCreditAssetAttachmentDAO extends SqlMapClientDaoSupport implements ProjectCreditAssetAttachmentDAO {
	/**
	 *  Insert one <tt>ProjectCreditAssetAttachmentDO</tt> object to DB table <tt>project_credit_asset_attachment</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into project_credit_asset_attachment(asset_id,credit_id,image_key,image_text_value,image_value,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param projectCreditAssetAttachment
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ProjectCreditAssetAttachmentDO projectCreditAssetAttachment) throws DataAccessException {
    	if (projectCreditAssetAttachment == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-INSERT", projectCreditAssetAttachment);

        return projectCreditAssetAttachment.getId();
    }

	/**
	 *  Update DB table <tt>project_credit_asset_attachment</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update project_credit_asset_attachment set asset_id=?, credit_id=?, image_key=?, image_text_value=?, image_value=? where (id = ?)</tt>
	 *
	 *	@param projectCreditAssetAttachment
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ProjectCreditAssetAttachmentDO projectCreditAssetAttachment) throws DataAccessException {
    	if (projectCreditAssetAttachment == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-UPDATE", projectCreditAssetAttachment);
    }

	/**
	 *  Query DB table <tt>project_credit_asset_attachment</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_asset_attachment where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return ProjectCreditAssetAttachmentDO
	 *	@throws DataAccessException
	 */	 
    public ProjectCreditAssetAttachmentDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (ProjectCreditAssetAttachmentDO) getSqlMapClientTemplate().queryForObject("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>project_credit_asset_attachment</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_asset_attachment where (credit_id = ?)</tt>
	 *
	 *	@param creditId
	 *	@return List<ProjectCreditAssetAttachmentDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectCreditAssetAttachmentDO> findByCreditId(long creditId) throws DataAccessException {
        Long param = new Long(creditId);

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-FIND-BY-CREDIT-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>project_credit_asset_attachment</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_credit_asset_attachment where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>project_credit_asset_attachment</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from project_credit_asset_attachment where (credit_id = ?)</tt>
	 *
	 *	@param creditId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCreditId(long creditId) throws DataAccessException {
        Long param = new Long(creditId);

        return getSqlMapClientTemplate().delete("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-DELETE-BY-CREDIT-ID", param);
    }

	/**
	 *  Query DB table <tt>project_credit_asset_attachment</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from project_credit_asset_attachment where (1 = 1)</tt>
	 *
	 *	@param projectCreditAssetAttachment
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ProjectCreditAssetAttachmentDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProjectCreditAssetAttachmentDO> findByCondition(ProjectCreditAssetAttachmentDO projectCreditAssetAttachment, long limitStart, long pageSize) throws DataAccessException {
    	if (projectCreditAssetAttachment == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("projectCreditAssetAttachment", projectCreditAssetAttachment);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>project_credit_asset_attachment</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from project_credit_asset_attachment where (1 = 1)</tt>
	 *
	 *	@param projectCreditAssetAttachment
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ProjectCreditAssetAttachmentDO projectCreditAssetAttachment) throws DataAccessException {
    	if (projectCreditAssetAttachment == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PROJECT-CREDIT-ASSET-ATTACHMENT-FIND-BY-CONDITION-COUNT", projectCreditAssetAttachment);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}