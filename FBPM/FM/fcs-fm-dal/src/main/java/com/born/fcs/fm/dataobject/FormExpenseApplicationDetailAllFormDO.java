/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.fm.dataobject;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table
 * <tt>form_expense_application</tt>.
 * 
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/form_expense_application.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 * 
 * @author peigen
 */
public class FormExpenseApplicationDetailAllFormDO extends SimpleFormDO {
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -4282603875229233564L;
	
	//========== properties ==========
	
	private long expenseApplicationId;
	
	private String billNo;
	
	private String voucherNo;
	
	private String voucherStatus;
	
	private Date voucherSyncSendTime;
	
	private Date voucherSyncFinishTime;
	
	private String voucherSyncMessage;
	
	private long expenseDeptId;
	
	/** 主表部门名 */
	private String IndexDeptName;
	
	/** 主表部门负责人 */
	private String IndexDeptHead;
	
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
	
	/** 主表金额 */
	private Money indexAmount = new Money(0, 0);
	
	private String isReverse;
	
	private Money reamount = new Money(0, 0);
	
	private int attachmentsNum;
	
	private String payBank;
	
	private String payBankAccount;
	
	private String shlc;
	private String accountStatus;
	
	private Date branchWaitPayTime;
	
	private Date branchPayTime;
	
	private String branchPayStatus;
	
	//------------------------------------------
	private long detailId;
	
	private String expenseType;
	
	private Money amount = new Money(0, 0);
	
	private String reverse;
	
	private Money taxAmount = new Money(0, 0);
	
	private Money fpAmount = new Money(0, 0);
	
	private Money xjAmount = new Money(0, 0);
	
	private long deptId;
	
	private String deptName;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	private Money balanceAmount = new Money(0, 0);
	
	private Date waitPayTime;
	
	//========== getters and setters ==========
	
	public long getExpenseApplicationId() {
		return expenseApplicationId;
	}
	
	public String getAccountStatus() {
		return this.accountStatus;
	}
	
	public Date getWaitPayTime() {
		return this.waitPayTime;
	}
	
	public void setWaitPayTime(Date waitPayTime) {
		this.waitPayTime = waitPayTime;
	}
	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	public String getReverse() {
		return this.reverse;
	}
	
	public void setReverse(String reverse) {
		this.reverse = reverse;
	}
	
	public void setExpenseApplicationId(long expenseApplicationId) {
		this.expenseApplicationId = expenseApplicationId;
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
	
	public String getIndexDeptName() {
		return this.IndexDeptName;
	}
	
	public void setIndexDeptName(String indexDeptName) {
		IndexDeptName = indexDeptName;
	}
	
	public String getIndexDeptHead() {
		return this.IndexDeptHead;
	}
	
	public void setIndexDeptHead(String indexDeptHead) {
		IndexDeptHead = indexDeptHead;
	}
	
	public String getReimburseReason() {
		return this.reimburseReason;
	}
	
	public void setReimburseReason(String reimburseReason) {
		this.reimburseReason = reimburseReason;
	}
	
	public String getIsOfficialCard() {
		return this.isOfficialCard;
	}
	
	public void setIsOfficialCard(String isOfficialCard) {
		this.isOfficialCard = isOfficialCard;
	}
	
	public Money getIndexAmount() {
		return this.indexAmount;
	}
	
	public void setIndexAmount(Money indexAmount) {
		this.indexAmount = indexAmount;
	}
	
	public long getDetailId() {
		return this.detailId;
	}
	
	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}
	
	public String getExpenseType() {
		return this.expenseType;
	}
	
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}
	
	public Money getTaxAmount() {
		return this.taxAmount;
	}
	
	public void setTaxAmount(Money taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	public Money getFpAmount() {
		return this.fpAmount;
	}
	
	public void setFpAmount(Money fpAmount) {
		this.fpAmount = fpAmount;
	}
	
	public Money getXjAmount() {
		return this.xjAmount;
	}
	
	public void setXjAmount(Money xjAmount) {
		this.xjAmount = xjAmount;
	}
	
	public long getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	
	public Money getBalanceAmount() {
		return this.balanceAmount;
	}
	
	public void setBalanceAmount(Money balanceAmount) {
		this.balanceAmount = balanceAmount;
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
	
	public Date getBranchWaitPayTime() {
		return branchWaitPayTime;
	}
	
	public void setBranchWaitPayTime(Date branchWaitPayTime) {
		this.branchWaitPayTime = branchWaitPayTime;
	}
	
	public Date getBranchPayTime() {
		return branchPayTime;
	}
	
	public void setBranchPayTime(Date branchPayTime) {
		this.branchPayTime = branchPayTime;
	}
	
	public String getBranchPayStatus() {
		return branchPayStatus;
	}
	
	public void setBranchPayStatus(String branchPayStatus) {
		this.branchPayStatus = branchPayStatus;
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
