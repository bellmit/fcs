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
 * A data object class directly models database table <tt>regular_project_base_info_month</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_base_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class RegularProjectBaseInfoMonthDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String reportDate;

	private int reportYear;

	private int reportMonth;

	private long customerId;

	private String customerName;

	private String customerOuterLevel;

	private String projectCode;

	private String projectName;

	private long deptId;

	private String deptCode;

	private String deptName;

	private String comeFrom;

	private String fromProjectCode;

	private String fromProjectName;

	private String projectChannel;

	private String projectChannelCode;

	private String projectChannelType;

	private String capitalChannel;

	private String capitalChannelCode;

	private String capitalChannelType;

	private String busiType;

	private String busiTypeName;

	private String busiTypeDetail;

	private Money amount = new Money(0, 0);

	private Money contractAmount = new Money(0, 0);

	private double feeRate;

	private String feeType;

	private String feeDescribe;

	private Date startTime;

	private Date endTime;

	private int timeLimit;

	private String timeUnit;

	private double monthNum;

	private String isNew;

	private String isInsurance;

	private String busiManagerAccount;

	private String busiManagerName;

	private String riskManagerAccount;

	private String riskManagerName;

	private String legalManagerAccount;

	private String legalManagerName;

	private String chargePlan;

	private String repayPlan;

	private long balance;

	private Date firstOccurDate;

	private Money occurAmount = new Money(0, 0);

	private Money releaseAmount = new Money(0, 0);

	private String isHisPtoject;

	private String isBelong2nc;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public String getReportDate() {
		return reportDate;
	}
	
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
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

	public String getCustomerOuterLevel() {
		return customerOuterLevel;
	}
	
	public void setCustomerOuterLevel(String customerOuterLevel) {
		this.customerOuterLevel = customerOuterLevel;
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

	public String getComeFrom() {
		return comeFrom;
	}
	
	public void setComeFrom(String comeFrom) {
		this.comeFrom = comeFrom;
	}

	public String getFromProjectCode() {
		return fromProjectCode;
	}
	
	public void setFromProjectCode(String fromProjectCode) {
		this.fromProjectCode = fromProjectCode;
	}

	public String getFromProjectName() {
		return fromProjectName;
	}
	
	public void setFromProjectName(String fromProjectName) {
		this.fromProjectName = fromProjectName;
	}

	public String getProjectChannel() {
		return projectChannel;
	}
	
	public void setProjectChannel(String projectChannel) {
		this.projectChannel = projectChannel;
	}

	public String getProjectChannelCode() {
		return projectChannelCode;
	}
	
	public void setProjectChannelCode(String projectChannelCode) {
		this.projectChannelCode = projectChannelCode;
	}

	public String getProjectChannelType() {
		return projectChannelType;
	}
	
	public void setProjectChannelType(String projectChannelType) {
		this.projectChannelType = projectChannelType;
	}

	public String getCapitalChannel() {
		return capitalChannel;
	}
	
	public void setCapitalChannel(String capitalChannel) {
		this.capitalChannel = capitalChannel;
	}

	public String getCapitalChannelCode() {
		return capitalChannelCode;
	}
	
	public void setCapitalChannelCode(String capitalChannelCode) {
		this.capitalChannelCode = capitalChannelCode;
	}

	public String getCapitalChannelType() {
		return capitalChannelType;
	}
	
	public void setCapitalChannelType(String capitalChannelType) {
		this.capitalChannelType = capitalChannelType;
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

	public String getBusiTypeDetail() {
		return busiTypeDetail;
	}
	
	public void setBusiTypeDetail(String busiTypeDetail) {
		this.busiTypeDetail = busiTypeDetail;
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

	public Money getContractAmount() {
		return contractAmount;
	}
	
	public void setContractAmount(Money contractAmount) {
		if (contractAmount == null) {
			this.contractAmount = new Money(0, 0);
		} else {
			this.contractAmount = contractAmount;
		}
	}

	public double getFeeRate() {
		return feeRate;
	}
	
	public void setFeeRate(double feeRate) {
		this.feeRate = feeRate;
	}

	public String getFeeType() {
		return feeType;
	}
	
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getFeeDescribe() {
		return feeDescribe;
	}
	
	public void setFeeDescribe(String feeDescribe) {
		this.feeDescribe = feeDescribe;
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

	public double getMonthNum() {
		return monthNum;
	}
	
	public void setMonthNum(double monthNum) {
		this.monthNum = monthNum;
	}

	public String getIsNew() {
		return isNew;
	}
	
	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getIsInsurance() {
		return isInsurance;
	}
	
	public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

	public String getBusiManagerAccount() {
		return busiManagerAccount;
	}
	
	public void setBusiManagerAccount(String busiManagerAccount) {
		this.busiManagerAccount = busiManagerAccount;
	}

	public String getBusiManagerName() {
		return busiManagerName;
	}
	
	public void setBusiManagerName(String busiManagerName) {
		this.busiManagerName = busiManagerName;
	}

	public String getRiskManagerAccount() {
		return riskManagerAccount;
	}
	
	public void setRiskManagerAccount(String riskManagerAccount) {
		this.riskManagerAccount = riskManagerAccount;
	}

	public String getRiskManagerName() {
		return riskManagerName;
	}
	
	public void setRiskManagerName(String riskManagerName) {
		this.riskManagerName = riskManagerName;
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

	public String getChargePlan() {
		return chargePlan;
	}
	
	public void setChargePlan(String chargePlan) {
		this.chargePlan = chargePlan;
	}

	public String getRepayPlan() {
		return repayPlan;
	}
	
	public void setRepayPlan(String repayPlan) {
		this.repayPlan = repayPlan;
	}

	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Date getFirstOccurDate() {
		return firstOccurDate;
	}
	
	public void setFirstOccurDate(Date firstOccurDate) {
		this.firstOccurDate = firstOccurDate;
	}

	public Money getOccurAmount() {
		return occurAmount;
	}
	
	public void setOccurAmount(Money occurAmount) {
		if (occurAmount == null) {
			this.occurAmount = new Money(0, 0);
		} else {
			this.occurAmount = occurAmount;
		}
	}

	public Money getReleaseAmount() {
		return releaseAmount;
	}
	
	public void setReleaseAmount(Money releaseAmount) {
		if (releaseAmount == null) {
			this.releaseAmount = new Money(0, 0);
		} else {
			this.releaseAmount = releaseAmount;
		}
	}

	public String getIsHisPtoject() {
		return isHisPtoject;
	}
	
	public void setIsHisPtoject(String isHisPtoject) {
		this.isHisPtoject = isHisPtoject;
	}

	public String getIsBelong2nc() {
		return isBelong2nc;
	}
	
	public void setIsBelong2nc(String isBelong2nc) {
		this.isBelong2nc = isBelong2nc;
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
