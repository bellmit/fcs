/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>f_stamp_basic_data_apply</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_stamp_basic_data_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FStampBasicDataApplyDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long applyId;

	private String applyCode;

	private long formId;

	private String receiver;

	private String orgNames;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getApplyId() {
		return applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	public String getApplyCode() {
		return applyCode;
	}
	
	public void setApplyCode(String applyCode) {
		this.applyCode = applyCode;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getOrgNames() {
		return orgNames;
	}
	
	public void setOrgNames(String orgNames) {
		this.orgNames = orgNames;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
