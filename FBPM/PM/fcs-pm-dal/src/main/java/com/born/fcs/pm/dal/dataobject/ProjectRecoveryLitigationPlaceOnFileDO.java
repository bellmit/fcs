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
 * A data object class directly models database table <tt>project_recovery_litigation_place_on_file</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_place_on_file.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectRecoveryLitigationPlaceOnFileDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long projectRecoveryId;

	private String acceptingCourt;

	private String agentLawFirm;

	private String agentAttorney;

	private String agentJudge;

	private Date placeOnFileTime;

	private Date payTime;

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

	public String getAcceptingCourt() {
		return acceptingCourt;
	}
	
	public void setAcceptingCourt(String acceptingCourt) {
		this.acceptingCourt = acceptingCourt;
	}

	public String getAgentLawFirm() {
		return agentLawFirm;
	}
	
	public void setAgentLawFirm(String agentLawFirm) {
		this.agentLawFirm = agentLawFirm;
	}

	public String getAgentAttorney() {
		return agentAttorney;
	}
	
	public void setAgentAttorney(String agentAttorney) {
		this.agentAttorney = agentAttorney;
	}

	public String getAgentJudge() {
		return agentJudge;
	}
	
	public void setAgentJudge(String agentJudge) {
		this.agentJudge = agentJudge;
	}

	public Date getPlaceOnFileTime() {
		return placeOnFileTime;
	}
	
	public void setPlaceOnFileTime(Date placeOnFileTime) {
		this.placeOnFileTime = placeOnFileTime;
	}

	public Date getPayTime() {
		return payTime;
	}
	
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
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