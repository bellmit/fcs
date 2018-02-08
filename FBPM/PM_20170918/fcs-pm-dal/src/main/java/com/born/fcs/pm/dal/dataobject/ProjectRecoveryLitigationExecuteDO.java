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
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>project_recovery_litigation_execute</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_execute.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectRecoveryLitigationExecuteDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long projectRecoveryId;

	private String executeApply;

	private String placeOnFile;

	private String acceptingCourt;

	private String compromise;

	private String conciliation;

	private String estimate;

	private Money recoveryTotalAmount = new Money(0, 0);

	private String memo;

	private int litigationIndex;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getProjectRecoveryId() {
		return projectRecoveryId;
	}
	
	public void setProjectRecoveryId(long projectRecoveryId) {
		this.projectRecoveryId = projectRecoveryId;
	}

	public String getExecuteApply() {
		return executeApply;
	}
	
	public void setExecuteApply(String executeApply) {
		this.executeApply = executeApply;
	}

	public String getPlaceOnFile() {
		return placeOnFile;
	}
	
	public void setPlaceOnFile(String placeOnFile) {
		this.placeOnFile = placeOnFile;
	}

	public String getAcceptingCourt() {
		return acceptingCourt;
	}
	
	public void setAcceptingCourt(String acceptingCourt) {
		this.acceptingCourt = acceptingCourt;
	}

	public String getCompromise() {
		return compromise;
	}
	
	public void setCompromise(String compromise) {
		this.compromise = compromise;
	}

	public String getConciliation() {
		return conciliation;
	}
	
	public void setConciliation(String conciliation) {
		this.conciliation = conciliation;
	}

	public String getEstimate() {
		return estimate;
	}
	
	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}

	public Money getRecoveryTotalAmount() {
		return recoveryTotalAmount;
	}
	
	public void setRecoveryTotalAmount(Money recoveryTotalAmount) {
		if (recoveryTotalAmount == null) {
			this.recoveryTotalAmount = new Money(0, 0);
		} else {
			this.recoveryTotalAmount = recoveryTotalAmount;
		}
	}

	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getLitigationIndex() {
		return litigationIndex;
	}
	
	public void setLitigationIndex(int litigationIndex) {
		this.litigationIndex = litigationIndex;
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
