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
 * A data object class directly models database table <tt>f_investigation_mainly_review</tt>.
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
public class FInvestigationMainlyReviewDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long MReviewId;

	private String owner;

	private long formId;

	private String projectCode;

	private String projectName;

	private long customerId;

	private String customerName;

	private Date establishedTime;

	private String operatingTerm;

	private String legalPersion;

	private String orgCode;

	private String livingAddress;

	private String actualControlPerson;

	private String enterpriseType;

	private String workAddress;

	private String isOneCert;

	private String busiLicenseNo;

	private String taxCertificateNo;

	private String localTaxNo;

	private String loanCardNo;

	private String lastCheckYear;

	private String busiScope;

	private String customerDevEvolution;

	private String subsidiaryRemark;

	private String participationRemark;

	private String correlationRemark;

	private String relatedTrade;

	private String relatedGuarantee;

	private String relatedCapitalTieup;

	private String busiQualification;

	private String busiPlace;

	private Date queryTime;

	private String loanRepaySituationCustomer;

	private String loanRepaySituationPersional;

	private String other;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getMReviewId() {
		return MReviewId;
	}
	
	public void setMReviewId(long MReviewId) {
		this.MReviewId = MReviewId;
	}

	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
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

	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getEstablishedTime() {
		return establishedTime;
	}
	
	public void setEstablishedTime(Date establishedTime) {
		this.establishedTime = establishedTime;
	}

	public String getOperatingTerm() {
		return operatingTerm;
	}
	
	public void setOperatingTerm(String operatingTerm) {
		this.operatingTerm = operatingTerm;
	}

	public String getLegalPersion() {
		return legalPersion;
	}
	
	public void setLegalPersion(String legalPersion) {
		this.legalPersion = legalPersion;
	}

	public String getOrgCode() {
		return orgCode;
	}
	
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getLivingAddress() {
		return livingAddress;
	}
	
	public void setLivingAddress(String livingAddress) {
		this.livingAddress = livingAddress;
	}

	public String getActualControlPerson() {
		return actualControlPerson;
	}
	
	public void setActualControlPerson(String actualControlPerson) {
		this.actualControlPerson = actualControlPerson;
	}

	public String getEnterpriseType() {
		return enterpriseType;
	}
	
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public String getWorkAddress() {
		return workAddress;
	}
	
	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getIsOneCert() {
		return isOneCert;
	}
	
	public void setIsOneCert(String isOneCert) {
		this.isOneCert = isOneCert;
	}

	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
	}

	public String getTaxCertificateNo() {
		return taxCertificateNo;
	}
	
	public void setTaxCertificateNo(String taxCertificateNo) {
		this.taxCertificateNo = taxCertificateNo;
	}

	public String getLocalTaxNo() {
		return localTaxNo;
	}
	
	public void setLocalTaxNo(String localTaxNo) {
		this.localTaxNo = localTaxNo;
	}

	public String getLoanCardNo() {
		return loanCardNo;
	}
	
	public void setLoanCardNo(String loanCardNo) {
		this.loanCardNo = loanCardNo;
	}

	public String getLastCheckYear() {
		return lastCheckYear;
	}
	
	public void setLastCheckYear(String lastCheckYear) {
		this.lastCheckYear = lastCheckYear;
	}

	public String getBusiScope() {
		return busiScope;
	}
	
	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}

	public String getCustomerDevEvolution() {
		return customerDevEvolution;
	}
	
	public void setCustomerDevEvolution(String customerDevEvolution) {
		this.customerDevEvolution = customerDevEvolution;
	}

	public String getSubsidiaryRemark() {
		return subsidiaryRemark;
	}
	
	public void setSubsidiaryRemark(String subsidiaryRemark) {
		this.subsidiaryRemark = subsidiaryRemark;
	}

	public String getParticipationRemark() {
		return participationRemark;
	}
	
	public void setParticipationRemark(String participationRemark) {
		this.participationRemark = participationRemark;
	}

	public String getCorrelationRemark() {
		return correlationRemark;
	}
	
	public void setCorrelationRemark(String correlationRemark) {
		this.correlationRemark = correlationRemark;
	}

	public String getRelatedTrade() {
		return relatedTrade;
	}
	
	public void setRelatedTrade(String relatedTrade) {
		this.relatedTrade = relatedTrade;
	}

	public String getRelatedGuarantee() {
		return relatedGuarantee;
	}
	
	public void setRelatedGuarantee(String relatedGuarantee) {
		this.relatedGuarantee = relatedGuarantee;
	}

	public String getRelatedCapitalTieup() {
		return relatedCapitalTieup;
	}
	
	public void setRelatedCapitalTieup(String relatedCapitalTieup) {
		this.relatedCapitalTieup = relatedCapitalTieup;
	}

	public String getBusiQualification() {
		return busiQualification;
	}
	
	public void setBusiQualification(String busiQualification) {
		this.busiQualification = busiQualification;
	}

	public String getBusiPlace() {
		return busiPlace;
	}
	
	public void setBusiPlace(String busiPlace) {
		this.busiPlace = busiPlace;
	}

	public Date getQueryTime() {
		return queryTime;
	}
	
	public void setQueryTime(Date queryTime) {
		this.queryTime = queryTime;
	}

	public String getLoanRepaySituationCustomer() {
		return loanRepaySituationCustomer;
	}
	
	public void setLoanRepaySituationCustomer(String loanRepaySituationCustomer) {
		this.loanRepaySituationCustomer = loanRepaySituationCustomer;
	}

	public String getLoanRepaySituationPersional() {
		return loanRepaySituationPersional;
	}
	
	public void setLoanRepaySituationPersional(String loanRepaySituationPersional) {
		this.loanRepaySituationPersional = loanRepaySituationPersional;
	}

	public String getOther() {
		return other;
	}
	
	public void setOther(String other) {
		this.other = other;
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
