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
 * A data object class directly models database table <tt>f_afterwards_check_report_financial</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_afterwards_check_report_financial.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FAfterwardsCheckReportFinancialDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long financialId;

	private long formId;

	private String financialType;

	private String financialItem;

	private String financialName;

	private Money origialAmount = new Money(0, 0);

	private Money itemBalance = new Money(0, 0);

	private int origialCount;

	private String origialAge;

	private Money badDebtAmount = new Money(0, 0);

	private String constructionContract;

	private String refundCertificate;

	private String remark;

	private String delAble;

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getFinancialId() {
		return financialId;
	}
	
	public void setFinancialId(long financialId) {
		this.financialId = financialId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getFinancialType() {
		return financialType;
	}
	
	public void setFinancialType(String financialType) {
		this.financialType = financialType;
	}

	public String getFinancialItem() {
		return financialItem;
	}
	
	public void setFinancialItem(String financialItem) {
		this.financialItem = financialItem;
	}

	public String getFinancialName() {
		return financialName;
	}
	
	public void setFinancialName(String financialName) {
		this.financialName = financialName;
	}

	public Money getOrigialAmount() {
		return origialAmount;
	}
	
	public void setOrigialAmount(Money origialAmount) {
		if (origialAmount == null) {
			this.origialAmount = new Money(0, 0);
		} else {
			this.origialAmount = origialAmount;
		}
	}

	public Money getItemBalance() {
		return itemBalance;
	}
	
	public void setItemBalance(Money itemBalance) {
		if (itemBalance == null) {
			this.itemBalance = new Money(0, 0);
		} else {
			this.itemBalance = itemBalance;
		}
	}

	public int getOrigialCount() {
		return origialCount;
	}
	
	public void setOrigialCount(int origialCount) {
		this.origialCount = origialCount;
	}

	public String getOrigialAge() {
		return origialAge;
	}
	
	public void setOrigialAge(String origialAge) {
		this.origialAge = origialAge;
	}

	public Money getBadDebtAmount() {
		return badDebtAmount;
	}
	
	public void setBadDebtAmount(Money badDebtAmount) {
		if (badDebtAmount == null) {
			this.badDebtAmount = new Money(0, 0);
		} else {
			this.badDebtAmount = badDebtAmount;
		}
	}

	public String getConstructionContract() {
		return constructionContract;
	}
	
	public void setConstructionContract(String constructionContract) {
		this.constructionContract = constructionContract;
	}

	public String getRefundCertificate() {
		return refundCertificate;
	}
	
	public void setRefundCertificate(String refundCertificate) {
		this.refundCertificate = refundCertificate;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDelAble() {
		return delAble;
	}
	
	public void setDelAble(String delAble) {
		this.delAble = delAble;
	}

	public int getSortOrder() {
		return sortOrder;
	}
	
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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
