/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>project_base</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_base.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectBaseDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long projectBaseId;

	private long reportId;

	private int reportYear;

	private int reportMonth;

	private String projectCode;

	private String projectName;

	private String customerId;

	private String customerName;

	private String customerType;

	private long deptId;

	private String deptCode;

	private String deptName;

	private String deptPath;

	private String deptPathName;

	private Date riskReviewTime;

	private long projectChannelId;

	private String projectChannelName;

	private long projectSubChannelId;

	private String projectSubChannelName;

	private long capitalChannelId;

	private String capitalChannelName;

	private long capitalSubChannelId;

	private String capitalSubChannelName;

	private String busiType;

	private String busiTypeName;

	private Money amount = new Money(0, 0);

	private int timeLimit;

	private String timeUnit;

	private Date startTime;

	private Date endTime;

	private String newAdd;

	private String releasable;

	private String busiManagerName;

	private String riskManagerName;

	private String legalManagerName;

	private double contractRate;

	private String contractType;

	private String progress;

	private Date setupApprovalTime;

	private Date investigationSubmitTime;

	private Date investigationApprovalTime;

	private Date councilStartTime;

	private Date councilApprovalTime;

	private double guaranteeFee;

	private String guaranteeType;

	private String storage;

	private String riskLevel;

	private String busiSubType;

	private String busiSubTypeName;

	private String industryCode;

	private String industryName;

	private String phases;

	private String phasesStatus;

	private String status;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getProjectBaseId() {
		return projectBaseId;
	}
	
	public void setProjectBaseId(long projectBaseId) {
		this.projectBaseId = projectBaseId;
	}

	public long getReportId() {
		return reportId;
	}
	
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public int getReportYear() {
		return reportYear;
	}
	
	public void setReportYear(int reportYear) {
		this.reportYear = reportYear;
	}

	public int getReportMonth() {
		return reportMonth;
	}
	
	public void setReportMonth(int reportMonth) {
		this.reportMonth = reportMonth;
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

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public long getDeptId() {
		return deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptCode() {
		return deptCode;
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptPath() {
		return deptPath;
	}
	
	public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
	}

	public String getDeptPathName() {
		return deptPathName;
	}
	
	public void setDeptPathName(String deptPathName) {
		this.deptPathName = deptPathName;
	}

	public Date getRiskReviewTime() {
		return riskReviewTime;
	}
	
	public void setRiskReviewTime(Date riskReviewTime) {
		this.riskReviewTime = riskReviewTime;
	}

	public long getProjectChannelId() {
		return projectChannelId;
	}
	
	public void setProjectChannelId(long projectChannelId) {
		this.projectChannelId = projectChannelId;
	}

	public String getProjectChannelName() {
		return projectChannelName;
	}
	
	public void setProjectChannelName(String projectChannelName) {
		this.projectChannelName = projectChannelName;
	}

	public long getProjectSubChannelId() {
		return projectSubChannelId;
	}
	
	public void setProjectSubChannelId(long projectSubChannelId) {
		this.projectSubChannelId = projectSubChannelId;
	}

	public String getProjectSubChannelName() {
		return projectSubChannelName;
	}
	
	public void setProjectSubChannelName(String projectSubChannelName) {
		this.projectSubChannelName = projectSubChannelName;
	}

	public long getCapitalChannelId() {
		return capitalChannelId;
	}
	
	public void setCapitalChannelId(long capitalChannelId) {
		this.capitalChannelId = capitalChannelId;
	}

	public String getCapitalChannelName() {
		return capitalChannelName;
	}
	
	public void setCapitalChannelName(String capitalChannelName) {
		this.capitalChannelName = capitalChannelName;
	}

	public long getCapitalSubChannelId() {
		return capitalSubChannelId;
	}
	
	public void setCapitalSubChannelId(long capitalSubChannelId) {
		this.capitalSubChannelId = capitalSubChannelId;
	}

	public String getCapitalSubChannelName() {
		return capitalSubChannelName;
	}
	
	public void setCapitalSubChannelName(String capitalSubChannelName) {
		this.capitalSubChannelName = capitalSubChannelName;
	}

	public String getBusiType() {
		return busiType;
	}
	
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getBusiTypeName() {
		return busiTypeName;
	}
	
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}

	public Money getAmount() {
		return amount;
	}
	
	public void setAmount(Money amount) {
		if (amount == null) {
			this.amount = new Money(0, 0);
		} else {
			this.amount = amount;
		}
	}

	public int getTimeLimit() {
		return timeLimit;
	}
	
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getTimeUnit() {
		return timeUnit;
	}
	
	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getNewAdd() {
		return newAdd;
	}
	
	public void setNewAdd(String newAdd) {
		this.newAdd = newAdd;
	}

	public String getReleasable() {
		return releasable;
	}
	
	public void setReleasable(String releasable) {
		this.releasable = releasable;
	}

	public String getBusiManagerName() {
		return busiManagerName;
	}
	
	public void setBusiManagerName(String busiManagerName) {
		this.busiManagerName = busiManagerName;
	}

	public String getRiskManagerName() {
		return riskManagerName;
	}
	
	public void setRiskManagerName(String riskManagerName) {
		this.riskManagerName = riskManagerName;
	}

	public String getLegalManagerName() {
		return legalManagerName;
	}
	
	public void setLegalManagerName(String legalManagerName) {
		this.legalManagerName = legalManagerName;
	}

	public double getContractRate() {
		return contractRate;
	}
	
	public void setContractRate(double contractRate) {
		this.contractRate = contractRate;
	}

	public String getContractType() {
		return contractType;
	}
	
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getProgress() {
		return progress;
	}
	
	public void setProgress(String progress) {
		this.progress = progress;
	}

	public Date getSetupApprovalTime() {
		return setupApprovalTime;
	}
	
	public void setSetupApprovalTime(Date setupApprovalTime) {
		this.setupApprovalTime = setupApprovalTime;
	}

	public Date getInvestigationSubmitTime() {
		return investigationSubmitTime;
	}
	
	public void setInvestigationSubmitTime(Date investigationSubmitTime) {
		this.investigationSubmitTime = investigationSubmitTime;
	}

	public Date getInvestigationApprovalTime() {
		return investigationApprovalTime;
	}
	
	public void setInvestigationApprovalTime(Date investigationApprovalTime) {
		this.investigationApprovalTime = investigationApprovalTime;
	}

	public Date getCouncilStartTime() {
		return councilStartTime;
	}
	
	public void setCouncilStartTime(Date councilStartTime) {
		this.councilStartTime = councilStartTime;
	}

	public Date getCouncilApprovalTime() {
		return councilApprovalTime;
	}
	
	public void setCouncilApprovalTime(Date councilApprovalTime) {
		this.councilApprovalTime = councilApprovalTime;
	}

	public double getGuaranteeFee() {
		return guaranteeFee;
	}
	
	public void setGuaranteeFee(double guaranteeFee) {
		this.guaranteeFee = guaranteeFee;
	}

	public String getGuaranteeType() {
		return guaranteeType;
	}
	
	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public String getStorage() {
		return storage;
	}
	
	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getRiskLevel() {
		return riskLevel;
	}
	
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getBusiSubType() {
		return busiSubType;
	}
	
	public void setBusiSubType(String busiSubType) {
		this.busiSubType = busiSubType;
	}

	public String getBusiSubTypeName() {
		return busiSubTypeName;
	}
	
	public void setBusiSubTypeName(String busiSubTypeName) {
		this.busiSubTypeName = busiSubTypeName;
	}

	public String getIndustryCode() {
		return industryCode;
	}
	
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return industryName;
	}
	
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getPhases() {
		return phases;
	}
	
	public void setPhases(String phases) {
		this.phases = phases;
	}

	public String getPhasesStatus() {
		return phasesStatus;
	}
	
	public void setPhasesStatus(String phasesStatus) {
		this.phasesStatus = phasesStatus;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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