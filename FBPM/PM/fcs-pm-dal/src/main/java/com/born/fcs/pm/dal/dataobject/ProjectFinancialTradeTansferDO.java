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
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>project_financial_trade_tansfer</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_financial_trade_tansfer.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectFinancialTradeTansferDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long tradeId;

	private String flowNo;

	private String projectCode;

	private long applyId;

	private Money transferPrice = new Money(0, 0);

	private double transferNum;

	private Money transferInterest = new Money(0, 0);

	private Date transferTime;

	private String transferTo;

	private double interestRate;

	private String isTransferOwnership;

	private String isBuyBack;

	private Money buyBackPrice = new Money(0, 0);

	private Date buyBackTime;

	private String isConfirm;

	private Date confirmTime;

	private String transferReason;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getTradeId() {
		return tradeId;
	}
	
	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

	public String getFlowNo() {
		return flowNo;
	}
	
	public void setFlowNo(String flowNo) {
		this.flowNo = flowNo;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public long getApplyId() {
		return applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	public Money getTransferPrice() {
		return transferPrice;
	}
	
	public void setTransferPrice(Money transferPrice) {
		if (transferPrice == null) {
			this.transferPrice = new Money(0, 0);
		} else {
			this.transferPrice = transferPrice;
		}
	}

	public double getTransferNum() {
		return transferNum;
	}
	
	public void setTransferNum(double transferNum) {
		this.transferNum = transferNum;
	}

	public Money getTransferInterest() {
		return transferInterest;
	}
	
	public void setTransferInterest(Money transferInterest) {
		if (transferInterest == null) {
			this.transferInterest = new Money(0, 0);
		} else {
			this.transferInterest = transferInterest;
		}
	}

	public Date getTransferTime() {
		return transferTime;
	}
	
	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}

	public String getTransferTo() {
		return transferTo;
	}
	
	public void setTransferTo(String transferTo) {
		this.transferTo = transferTo;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getIsTransferOwnership() {
		return isTransferOwnership;
	}
	
	public void setIsTransferOwnership(String isTransferOwnership) {
		this.isTransferOwnership = isTransferOwnership;
	}

	public String getIsBuyBack() {
		return isBuyBack;
	}
	
	public void setIsBuyBack(String isBuyBack) {
		this.isBuyBack = isBuyBack;
	}

	public Money getBuyBackPrice() {
		return buyBackPrice;
	}
	
	public void setBuyBackPrice(Money buyBackPrice) {
		if (buyBackPrice == null) {
			this.buyBackPrice = new Money(0, 0);
		} else {
			this.buyBackPrice = buyBackPrice;
		}
	}

	public Date getBuyBackTime() {
		return buyBackTime;
	}
	
	public void setBuyBackTime(Date buyBackTime) {
		this.buyBackTime = buyBackTime;
	}

	public String getIsConfirm() {
		return isConfirm;
	}
	
	public void setIsConfirm(String isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Date getConfirmTime() {
		return confirmTime;
	}
	
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}

	public String getTransferReason() {
		return transferReason;
	}
	
	public void setTransferReason(String transferReason) {
		this.transferReason = transferReason;
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
