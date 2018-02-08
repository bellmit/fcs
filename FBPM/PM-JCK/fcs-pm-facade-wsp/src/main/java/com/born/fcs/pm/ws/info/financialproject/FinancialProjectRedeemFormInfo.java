/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.ws.info.financialproject;

// auto generated imports
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.born.fcs.pm.ws.info.common.FormVOInfo;
import com.yjf.common.lang.util.money.Money;

/**
 * 理财项目赎回列表Info
 *
 * @author wuzj
 */
public class FinancialProjectRedeemFormInfo extends FormVOInfo {
	
	private static final long serialVersionUID = -4299437608535277423L;
	
	private long applyId;
	
	private long holdNum;
	
	private String projectCode;
	
	private Money redeemPrice = new Money(0, 0);
	
	private long redeemNum;
	
	private Money redeemPrincipal = new Money(0, 0);
	
	private Money redeemInterest = new Money(0, 0);
	
	private String redeemReason;
	
	private String attach;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	//赎回信息
	ProjectFinancialTradeRedeemInfo trade;
	
	//项目信息
	private ProjectFinancialInfo project;
	
	public long getApplyId() {
		return this.applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}
	
	public long getHoldNum() {
		return this.holdNum;
	}
	
	public void setHoldNum(long holdNum) {
		this.holdNum = holdNum;
	}
	
	public String getProjectCode() {
		return this.projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	
	public Money getRedeemPrice() {
		return this.redeemPrice;
	}
	
	public void setRedeemPrice(Money redeemPrice) {
		this.redeemPrice = redeemPrice;
	}
	
	public long getRedeemNum() {
		return this.redeemNum;
	}
	
	public void setRedeemNum(long redeemNum) {
		this.redeemNum = redeemNum;
	}
	
	public Money getRedeemPrincipal() {
		return this.redeemPrincipal;
	}
	
	public void setRedeemPrincipal(Money redeemPrincipal) {
		this.redeemPrincipal = redeemPrincipal;
	}
	
	public Money getRedeemInterest() {
		return this.redeemInterest;
	}
	
	public void setRedeemInterest(Money redeemInterest) {
		this.redeemInterest = redeemInterest;
	}
	
	public String getRedeemReason() {
		return this.redeemReason;
	}
	
	public void setRedeemReason(String redeemReason) {
		this.redeemReason = redeemReason;
	}
	
	public String getAttach() {
		return this.attach;
	}
	
	public void setAttach(String attach) {
		this.attach = attach;
	}
	
	public Date getRawAddTime() {
		return this.rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return this.rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public ProjectFinancialTradeRedeemInfo getTrade() {
		return this.trade;
	}
	
	public void setTrade(ProjectFinancialTradeRedeemInfo trade) {
		this.trade = trade;
	}
	
	public ProjectFinancialInfo getProject() {
		return this.project;
	}
	
	public void setProject(ProjectFinancialInfo project) {
		this.project = project;
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
