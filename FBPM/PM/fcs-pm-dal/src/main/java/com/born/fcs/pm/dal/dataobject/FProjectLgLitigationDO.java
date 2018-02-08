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
 * A data object class directly models database table <tt>f_project_lg_litigation</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_project_lg_litigation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FProjectLgLitigationDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long projectId;

	private double guaranteeFee;

	private String guaranteeFeeType;

	private long coInstitutionId;

	private String coInstitutionName;

	private double coInstitutionCharge;

	private String coInstitutionChargeType;

	private String court;

	private double deposit;

	private String depositType;

	private String depositAccount;

	private String assureObject;

	private long legalManagerId;

	private String legalManagerAccount;

	private String legalManagerName;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getProjectId() {
		return projectId;
	}
	
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public double getGuaranteeFee() {
		return guaranteeFee;
	}
	
	public void setGuaranteeFee(double guaranteeFee) {
		this.guaranteeFee = guaranteeFee;
	}

	public String getGuaranteeFeeType() {
		return guaranteeFeeType;
	}
	
	public void setGuaranteeFeeType(String guaranteeFeeType) {
		this.guaranteeFeeType = guaranteeFeeType;
	}

	public long getCoInstitutionId() {
		return coInstitutionId;
	}
	
	public void setCoInstitutionId(long coInstitutionId) {
		this.coInstitutionId = coInstitutionId;
	}

	public String getCoInstitutionName() {
		return coInstitutionName;
	}
	
	public void setCoInstitutionName(String coInstitutionName) {
		this.coInstitutionName = coInstitutionName;
	}

	public double getCoInstitutionCharge() {
		return coInstitutionCharge;
	}
	
	public void setCoInstitutionCharge(double coInstitutionCharge) {
		this.coInstitutionCharge = coInstitutionCharge;
	}

	public String getCoInstitutionChargeType() {
		return coInstitutionChargeType;
	}
	
	public void setCoInstitutionChargeType(String coInstitutionChargeType) {
		this.coInstitutionChargeType = coInstitutionChargeType;
	}

	public String getCourt() {
		return court;
	}
	
	public void setCourt(String court) {
		this.court = court;
	}

	public double getDeposit() {
		return deposit;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public String getDepositType() {
		return depositType;
	}
	
	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public String getDepositAccount() {
		return depositAccount;
	}
	
	public void setDepositAccount(String depositAccount) {
		this.depositAccount = depositAccount;
	}

	public String getAssureObject() {
		return assureObject;
	}
	
	public void setAssureObject(String assureObject) {
		this.assureObject = assureObject;
	}

	public long getLegalManagerId() {
		return legalManagerId;
	}
	
	public void setLegalManagerId(long legalManagerId) {
		this.legalManagerId = legalManagerId;
	}

	public String getLegalManagerAccount() {
		return legalManagerAccount;
	}
	
	public void setLegalManagerAccount(String legalManagerAccount) {
		this.legalManagerAccount = legalManagerAccount;
	}

	public String getLegalManagerName() {
		return legalManagerName;
	}
	
	public void setLegalManagerName(String legalManagerName) {
		this.legalManagerName = legalManagerName;
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
