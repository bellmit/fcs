/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>project</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long projectId;

	private String projectCode;

	private String projectName;

	private long customerId;

	private String customerName;

	private String customerType;

	private String busiType;

	private String busiTypeName;

	private String busiSubType;

	private String busiSubTypeName;

	private String industryCode;

	private String industryName;

	private String loanPurpose;

	private int timeLimit;

	private String timeUnit;

	private Date startTime;

	private Date endTime;

	private Money amount = new Money(0, 0);

	private Money accumulatedIssueAmount = new Money(0, 0);

	private Money loanedAmount = new Money(0, 0);

	private Money usedAmount = new Money(0, 0);

	private Money repayedAmount = new Money(0, 0);

	private Money chargedAmount = new Money(0, 0);

	private Money refundAmount = new Money(0, 0);

	private String isMaximumAmount;

	private Money releasedAmount = new Money(0, 0);

	private Money releasableAmount = new Money(0, 0);

	private Money releasingAmount = new Money(0, 0);

	private Money customerDepositAmount = new Money(0, 0);

	private Money selfDepositAmount = new Money(0, 0);

	private Money compPrincipalAmount = new Money(0, 0);

	private Money compInterestAmount = new Money(0, 0);

	private String contractNo;

	private Date contractTime;

	private long spId;

	private String spCode;

	private String isApproval;

	private String isApprovalDel;

	private Date approvalTime;

	private long busiManagerId;

	private String busiManagerAccount;

	private String busiManagerName;

	private long busiManagerbId;

	private String busiManagerbAccount;

	private String busiManagerbName;

	private long deptId;

	private String deptCode;

	private String deptName;

	private String deptPath;

	private String deptPathName;

	private String phases;

	private String phasesStatus;

	private String status;

	private String isContinue;

	private String isRecouncil;

	private Date lastRecouncilTime;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getProjectId() {
		return projectId;
	}
	
	public void setProjectId(long projectId) {
		this.projectId = projectId;
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

	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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

	public String getLoanPurpose() {
		return loanPurpose;
	}
	
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
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

	public Money getAccumulatedIssueAmount() {
		return accumulatedIssueAmount;
	}
	
	public void setAccumulatedIssueAmount(Money accumulatedIssueAmount) {
		if (accumulatedIssueAmount == null) {
			this.accumulatedIssueAmount = new Money(0, 0);
		} else {
			this.accumulatedIssueAmount = accumulatedIssueAmount;
		}
	}

	public Money getLoanedAmount() {
		return loanedAmount;
	}
	
	public void setLoanedAmount(Money loanedAmount) {
		if (loanedAmount == null) {
			this.loanedAmount = new Money(0, 0);
		} else {
			this.loanedAmount = loanedAmount;
		}
	}

	public Money getUsedAmount() {
		return usedAmount;
	}
	
	public void setUsedAmount(Money usedAmount) {
		if (usedAmount == null) {
			this.usedAmount = new Money(0, 0);
		} else {
			this.usedAmount = usedAmount;
		}
	}

	public Money getRepayedAmount() {
		return repayedAmount;
	}
	
	public void setRepayedAmount(Money repayedAmount) {
		if (repayedAmount == null) {
			this.repayedAmount = new Money(0, 0);
		} else {
			this.repayedAmount = repayedAmount;
		}
	}

	public Money getChargedAmount() {
		return chargedAmount;
	}
	
	public void setChargedAmount(Money chargedAmount) {
		if (chargedAmount == null) {
			this.chargedAmount = new Money(0, 0);
		} else {
			this.chargedAmount = chargedAmount;
		}
	}

	public Money getRefundAmount() {
		return refundAmount;
	}
	
	public void setRefundAmount(Money refundAmount) {
		if (refundAmount == null) {
			this.refundAmount = new Money(0, 0);
		} else {
			this.refundAmount = refundAmount;
		}
	}

	public String getIsMaximumAmount() {
		return isMaximumAmount;
	}
	
	public void setIsMaximumAmount(String isMaximumAmount) {
		this.isMaximumAmount = isMaximumAmount;
	}

	public Money getReleasedAmount() {
		return releasedAmount;
	}
	
	public void setReleasedAmount(Money releasedAmount) {
		if (releasedAmount == null) {
			this.releasedAmount = new Money(0, 0);
		} else {
			this.releasedAmount = releasedAmount;
		}
	}

	public Money getReleasableAmount() {
		return releasableAmount;
	}
	
	public void setReleasableAmount(Money releasableAmount) {
		if (releasableAmount == null) {
			this.releasableAmount = new Money(0, 0);
		} else {
			this.releasableAmount = releasableAmount;
		}
	}

	public Money getReleasingAmount() {
		return releasingAmount;
	}
	
	public void setReleasingAmount(Money releasingAmount) {
		if (releasingAmount == null) {
			this.releasingAmount = new Money(0, 0);
		} else {
			this.releasingAmount = releasingAmount;
		}
	}

	public Money getCustomerDepositAmount() {
		return customerDepositAmount;
	}
	
	public void setCustomerDepositAmount(Money customerDepositAmount) {
		if (customerDepositAmount == null) {
			this.customerDepositAmount = new Money(0, 0);
		} else {
			this.customerDepositAmount = customerDepositAmount;
		}
	}

	public Money getSelfDepositAmount() {
		return selfDepositAmount;
	}
	
	public void setSelfDepositAmount(Money selfDepositAmount) {
		if (selfDepositAmount == null) {
			this.selfDepositAmount = new Money(0, 0);
		} else {
			this.selfDepositAmount = selfDepositAmount;
		}
	}

	public Money getCompPrincipalAmount() {
		return compPrincipalAmount;
	}
	
	public void setCompPrincipalAmount(Money compPrincipalAmount) {
		if (compPrincipalAmount == null) {
			this.compPrincipalAmount = new Money(0, 0);
		} else {
			this.compPrincipalAmount = compPrincipalAmount;
		}
	}

	public Money getCompInterestAmount() {
		return compInterestAmount;
	}
	
	public void setCompInterestAmount(Money compInterestAmount) {
		if (compInterestAmount == null) {
			this.compInterestAmount = new Money(0, 0);
		} else {
			this.compInterestAmount = compInterestAmount;
		}
	}

	public String getContractNo() {
		return contractNo;
	}
	
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Date getContractTime() {
		return contractTime;
	}
	
	public void setContractTime(Date contractTime) {
		this.contractTime = contractTime;
	}

	public long getSpId() {
		return spId;
	}
	
	public void setSpId(long spId) {
		this.spId = spId;
	}

	public String getSpCode() {
		return spCode;
	}
	
	public void setSpCode(String spCode) {
		this.spCode = spCode;
	}

	public String getIsApproval() {
		return isApproval;
	}
	
	public void setIsApproval(String isApproval) {
		this.isApproval = isApproval;
	}

	public String getIsApprovalDel() {
		return isApprovalDel;
	}
	
	public void setIsApprovalDel(String isApprovalDel) {
		this.isApprovalDel = isApprovalDel;
	}

	public Date getApprovalTime() {
		return approvalTime;
	}
	
	public void setApprovalTime(Date approvalTime) {
		this.approvalTime = approvalTime;
	}

	public long getBusiManagerId() {
		return busiManagerId;
	}
	
	public void setBusiManagerId(long busiManagerId) {
		this.busiManagerId = busiManagerId;
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

	public long getBusiManagerbId() {
		return busiManagerbId;
	}
	
	public void setBusiManagerbId(long busiManagerbId) {
		this.busiManagerbId = busiManagerbId;
	}

	public String getBusiManagerbAccount() {
		return busiManagerbAccount;
	}
	
	public void setBusiManagerbAccount(String busiManagerbAccount) {
		this.busiManagerbAccount = busiManagerbAccount;
	}

	public String getBusiManagerbName() {
		return busiManagerbName;
	}
	
	public void setBusiManagerbName(String busiManagerbName) {
		this.busiManagerbName = busiManagerbName;
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

	public String getIsContinue() {
		return isContinue;
	}
	
	public void setIsContinue(String isContinue) {
		this.isContinue = isContinue;
	}

	public String getIsRecouncil() {
		return isRecouncil;
	}
	
	public void setIsRecouncil(String isRecouncil) {
		this.isRecouncil = isRecouncil;
	}

	public Date getLastRecouncilTime() {
		return lastRecouncilTime;
	}
	
	public void setLastRecouncilTime(Date lastRecouncilTime) {
		this.lastRecouncilTime = lastRecouncilTime;
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
