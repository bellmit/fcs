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
 * A data object class directly models database table <tt>f_loan_use_apply</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_loan_use_apply.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FLoanUseApplyDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long applyId;

	private long formId;

	private String projectCode;

	private long notificationId;

	private String applyType;

	private Money amount = new Money(0, 0);

	private Money originalAmount = new Money(0, 0);

	private Money loanedAmount = new Money(0, 0);

	private Money usedAmount = new Money(0, 0);

	private Money issueAmount = new Money(0, 0);

	private Money releasedAmount = new Money(0, 0);

	private Money applyingLoanAmount = new Money(0, 0);

	private Money applyingUseAmount = new Money(0, 0);

	private String isMaximumAmount;

	private Date expectLoanDate;

	private String receiptName;

	private String receiptBank;

	private String receiptAccount;

	private String interestSettlementCycle;

	private String remark;

	private Money customerDepositCharge = new Money(0, 0);

	private Money customerDepositRefund = new Money(0, 0);

	private Money cashDepositAmount = new Money(0, 0);

	private String cashDepositBank;

	private int cashDepositTimeLimit;

	private String cashDepositTimeUnit;

	private double cashDepositRatio;

	private Date cashDepositEndTime;

	private String busiManagerStatement;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getApplyId() {
		return applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
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

	public long getNotificationId() {
		return notificationId;
	}
	
	public void setNotificationId(long notificationId) {
		this.notificationId = notificationId;
	}

	public String getApplyType() {
		return applyType;
	}
	
	public void setApplyType(String applyType) {
		this.applyType = applyType;
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

	public Money getOriginalAmount() {
		return originalAmount;
	}
	
	public void setOriginalAmount(Money originalAmount) {
		if (originalAmount == null) {
			this.originalAmount = new Money(0, 0);
		} else {
			this.originalAmount = originalAmount;
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

	public Money getIssueAmount() {
		return issueAmount;
	}
	
	public void setIssueAmount(Money issueAmount) {
		if (issueAmount == null) {
			this.issueAmount = new Money(0, 0);
		} else {
			this.issueAmount = issueAmount;
		}
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

	public Money getApplyingLoanAmount() {
		return applyingLoanAmount;
	}
	
	public void setApplyingLoanAmount(Money applyingLoanAmount) {
		if (applyingLoanAmount == null) {
			this.applyingLoanAmount = new Money(0, 0);
		} else {
			this.applyingLoanAmount = applyingLoanAmount;
		}
	}

	public Money getApplyingUseAmount() {
		return applyingUseAmount;
	}
	
	public void setApplyingUseAmount(Money applyingUseAmount) {
		if (applyingUseAmount == null) {
			this.applyingUseAmount = new Money(0, 0);
		} else {
			this.applyingUseAmount = applyingUseAmount;
		}
	}

	public String getIsMaximumAmount() {
		return isMaximumAmount;
	}
	
	public void setIsMaximumAmount(String isMaximumAmount) {
		this.isMaximumAmount = isMaximumAmount;
	}

	public Date getExpectLoanDate() {
		return expectLoanDate;
	}
	
	public void setExpectLoanDate(Date expectLoanDate) {
		this.expectLoanDate = expectLoanDate;
	}

	public String getReceiptName() {
		return receiptName;
	}
	
	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}

	public String getReceiptBank() {
		return receiptBank;
	}
	
	public void setReceiptBank(String receiptBank) {
		this.receiptBank = receiptBank;
	}

	public String getReceiptAccount() {
		return receiptAccount;
	}
	
	public void setReceiptAccount(String receiptAccount) {
		this.receiptAccount = receiptAccount;
	}

	public String getInterestSettlementCycle() {
		return interestSettlementCycle;
	}
	
	public void setInterestSettlementCycle(String interestSettlementCycle) {
		this.interestSettlementCycle = interestSettlementCycle;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Money getCustomerDepositCharge() {
		return customerDepositCharge;
	}
	
	public void setCustomerDepositCharge(Money customerDepositCharge) {
		if (customerDepositCharge == null) {
			this.customerDepositCharge = new Money(0, 0);
		} else {
			this.customerDepositCharge = customerDepositCharge;
		}
	}

	public Money getCustomerDepositRefund() {
		return customerDepositRefund;
	}
	
	public void setCustomerDepositRefund(Money customerDepositRefund) {
		if (customerDepositRefund == null) {
			this.customerDepositRefund = new Money(0, 0);
		} else {
			this.customerDepositRefund = customerDepositRefund;
		}
	}

	public Money getCashDepositAmount() {
		return cashDepositAmount;
	}
	
	public void setCashDepositAmount(Money cashDepositAmount) {
		if (cashDepositAmount == null) {
			this.cashDepositAmount = new Money(0, 0);
		} else {
			this.cashDepositAmount = cashDepositAmount;
		}
	}

	public String getCashDepositBank() {
		return cashDepositBank;
	}
	
	public void setCashDepositBank(String cashDepositBank) {
		this.cashDepositBank = cashDepositBank;
	}

	public int getCashDepositTimeLimit() {
		return cashDepositTimeLimit;
	}
	
	public void setCashDepositTimeLimit(int cashDepositTimeLimit) {
		this.cashDepositTimeLimit = cashDepositTimeLimit;
	}

	public String getCashDepositTimeUnit() {
		return cashDepositTimeUnit;
	}
	
	public void setCashDepositTimeUnit(String cashDepositTimeUnit) {
		this.cashDepositTimeUnit = cashDepositTimeUnit;
	}

	public double getCashDepositRatio() {
		return cashDepositRatio;
	}
	
	public void setCashDepositRatio(double cashDepositRatio) {
		this.cashDepositRatio = cashDepositRatio;
	}

	public Date getCashDepositEndTime() {
		return cashDepositEndTime;
	}
	
	public void setCashDepositEndTime(Date cashDepositEndTime) {
		this.cashDepositEndTime = cashDepositEndTime;
	}

	public String getBusiManagerStatement() {
		return busiManagerStatement;
	}
	
	public void setBusiManagerStatement(String busiManagerStatement) {
		this.busiManagerStatement = busiManagerStatement;
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
