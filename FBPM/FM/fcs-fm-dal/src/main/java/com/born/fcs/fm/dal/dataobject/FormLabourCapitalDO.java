/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>form_labour_capital</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_labour_capital.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FormLabourCapitalDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long labourCapitalId;

	private long formId;

	private String billNo;

	private String voucherNo;

	private String voucherStatus;

	private Date voucherSyncSendTime;

	private Date voucherSyncFinishTime;

	private String voucherSyncMessage;

	private long expenseDeptId;

	private String deptName;

	private String deptHead;

	private String reimburseReason;

	private String isOfficialCard;

	private Date applicationTime;

	private String relationForm;

	private long agentId;

	private String agent;

	private String direction;

	private long payeeId;

	private String payee;

	private long bankId;

	private String bank;

	private String bankAccount;

	private Money amount = new Money(0, 0);

	private String isReverse;

	private Money reamount = new Money(0, 0);

	private String cxids;

	private String payBank;

	private String payBankAccount;

	private String shlc;

	private int attachmentsNum;

	private String accountStatus;

	private Date waitPayTime;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getLabourCapitalId() {
		return labourCapitalId;
	}
	
	public void setLabourCapitalId(long labourCapitalId) {
		this.labourCapitalId = labourCapitalId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getBillNo() {
		return billNo;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getVoucherNo() {
		return voucherNo;
	}
	
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getVoucherStatus() {
		return voucherStatus;
	}
	
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public Date getVoucherSyncSendTime() {
		return voucherSyncSendTime;
	}
	
	public void setVoucherSyncSendTime(Date voucherSyncSendTime) {
		this.voucherSyncSendTime = voucherSyncSendTime;
	}

	public Date getVoucherSyncFinishTime() {
		return voucherSyncFinishTime;
	}
	
	public void setVoucherSyncFinishTime(Date voucherSyncFinishTime) {
		this.voucherSyncFinishTime = voucherSyncFinishTime;
	}

	public String getVoucherSyncMessage() {
		return voucherSyncMessage;
	}
	
	public void setVoucherSyncMessage(String voucherSyncMessage) {
		this.voucherSyncMessage = voucherSyncMessage;
	}

	public long getExpenseDeptId() {
		return expenseDeptId;
	}
	
	public void setExpenseDeptId(long expenseDeptId) {
		this.expenseDeptId = expenseDeptId;
	}

	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHead() {
		return deptHead;
	}
	
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public String getReimburseReason() {
		return reimburseReason;
	}
	
	public void setReimburseReason(String reimburseReason) {
		this.reimburseReason = reimburseReason;
	}

	public String getIsOfficialCard() {
		return isOfficialCard;
	}
	
	public void setIsOfficialCard(String isOfficialCard) {
		this.isOfficialCard = isOfficialCard;
	}

	public Date getApplicationTime() {
		return applicationTime;
	}
	
	public void setApplicationTime(Date applicationTime) {
		this.applicationTime = applicationTime;
	}

	public String getRelationForm() {
		return relationForm;
	}
	
	public void setRelationForm(String relationForm) {
		this.relationForm = relationForm;
	}

	public long getAgentId() {
		return agentId;
	}
	
	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}

	public String getAgent() {
		return agent;
	}
	
	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public long getPayeeId() {
		return payeeId;
	}
	
	public void setPayeeId(long payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayee() {
		return payee;
	}
	
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public long getBankId() {
		return bankId;
	}
	
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
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

	public String getIsReverse() {
		return isReverse;
	}
	
	public void setIsReverse(String isReverse) {
		this.isReverse = isReverse;
	}

	public Money getReamount() {
		return reamount;
	}
	
	public void setReamount(Money reamount) {
		if (reamount == null) {
			this.reamount = new Money(0, 0);
		} else {
			this.reamount = reamount;
		}
	}

	public String getCxids() {
		return cxids;
	}
	
	public void setCxids(String cxids) {
		this.cxids = cxids;
	}

	public String getPayBank() {
		return payBank;
	}
	
	public void setPayBank(String payBank) {
		this.payBank = payBank;
	}

	public String getPayBankAccount() {
		return payBankAccount;
	}
	
	public void setPayBankAccount(String payBankAccount) {
		this.payBankAccount = payBankAccount;
	}

	public String getShlc() {
		return shlc;
	}
	
	public void setShlc(String shlc) {
		this.shlc = shlc;
	}

	public int getAttachmentsNum() {
		return attachmentsNum;
	}
	
	public void setAttachmentsNum(int attachmentsNum) {
		this.attachmentsNum = attachmentsNum;
	}

	public String getAccountStatus() {
		return accountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Date getWaitPayTime() {
		return waitPayTime;
	}
	
	public void setWaitPayTime(Date waitPayTime) {
		this.waitPayTime = waitPayTime;
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
