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
 * A data object class directly models database table <tt>special_paper_provide_project</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/special_paper_provide_project.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class SpecialPaperProvideProjectDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long receiveManId;

	private String receiveManName;

	private long provideManId;

	private String provideManName;

	private String projectCode;

	private String projectName;

	private String receiptPlace;

	private String receiptMan;

	private long pieces;

	private String profiles;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getReceiveManId() {
		return receiveManId;
	}
	
	public void setReceiveManId(long receiveManId) {
		this.receiveManId = receiveManId;
	}

	public String getReceiveManName() {
		return receiveManName;
	}
	
	public void setReceiveManName(String receiveManName) {
		this.receiveManName = receiveManName;
	}

	public long getProvideManId() {
		return provideManId;
	}
	
	public void setProvideManId(long provideManId) {
		this.provideManId = provideManId;
	}

	public String getProvideManName() {
		return provideManName;
	}
	
	public void setProvideManName(String provideManName) {
		this.provideManName = provideManName;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getReceiptPlace() {
		return receiptPlace;
	}
	
	public void setReceiptPlace(String receiptPlace) {
		this.receiptPlace = receiptPlace;
	}

	public String getReceiptMan() {
		return receiptMan;
	}
	
	public void setReceiptMan(String receiptMan) {
		this.receiptMan = receiptMan;
	}

	public long getPieces() {
		return pieces;
	}
	
	public void setPieces(long pieces) {
		this.pieces = pieces;
	}

	public String getProfiles() {
		return profiles;
	}
	
	public void setProfiles(String profiles) {
		this.profiles = profiles;
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
