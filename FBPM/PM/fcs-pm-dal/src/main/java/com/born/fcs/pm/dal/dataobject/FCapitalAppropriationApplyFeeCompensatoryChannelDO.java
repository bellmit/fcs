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
 * A data object class directly models database table <tt>f_capital_appropriation_apply_fee_compensatory_channel</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_capital_appropriation_apply_fee_compensatory_channel.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FCapitalAppropriationApplyFeeCompensatoryChannelDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long formId;

	private long feeId;

	private long capitalChannelId;

	private String capitalChannelCode;

	private String capitalChannelType;

	private String capitalChannelName;

	private long capitalSubChannelId;

	private String capitalSubChannelCode;

	private String capitalSubChannelType;

	private String capitalSubChannelName;

	private Money actualDepositAmount = new Money(0, 0);

	private Money liquidityLoanAmount = new Money(0, 0);

	private Money fixedAssetsFinancingAmount = new Money(0, 0);

	private Money acceptanceBillAmount = new Money(0, 0);

	private Money creditLetterAmount = new Money(0, 0);

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public long getFeeId() {
		return feeId;
	}
	
	public void setFeeId(long feeId) {
		this.feeId = feeId;
	}

	public long getCapitalChannelId() {
		return capitalChannelId;
	}
	
	public void setCapitalChannelId(long capitalChannelId) {
		this.capitalChannelId = capitalChannelId;
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

	public String getCapitalSubChannelCode() {
		return capitalSubChannelCode;
	}
	
	public void setCapitalSubChannelCode(String capitalSubChannelCode) {
		this.capitalSubChannelCode = capitalSubChannelCode;
	}

	public String getCapitalSubChannelType() {
		return capitalSubChannelType;
	}
	
	public void setCapitalSubChannelType(String capitalSubChannelType) {
		this.capitalSubChannelType = capitalSubChannelType;
	}

	public String getCapitalSubChannelName() {
		return capitalSubChannelName;
	}
	
	public void setCapitalSubChannelName(String capitalSubChannelName) {
		this.capitalSubChannelName = capitalSubChannelName;
	}

	public Money getActualDepositAmount() {
		return actualDepositAmount;
	}
	
	public void setActualDepositAmount(Money actualDepositAmount) {
		if (actualDepositAmount == null) {
			this.actualDepositAmount = new Money(0, 0);
		} else {
			this.actualDepositAmount = actualDepositAmount;
		}
	}

	public Money getLiquidityLoanAmount() {
		return liquidityLoanAmount;
	}
	
	public void setLiquidityLoanAmount(Money liquidityLoanAmount) {
		if (liquidityLoanAmount == null) {
			this.liquidityLoanAmount = new Money(0, 0);
		} else {
			this.liquidityLoanAmount = liquidityLoanAmount;
		}
	}

	public Money getFixedAssetsFinancingAmount() {
		return fixedAssetsFinancingAmount;
	}
	
	public void setFixedAssetsFinancingAmount(Money fixedAssetsFinancingAmount) {
		if (fixedAssetsFinancingAmount == null) {
			this.fixedAssetsFinancingAmount = new Money(0, 0);
		} else {
			this.fixedAssetsFinancingAmount = fixedAssetsFinancingAmount;
		}
	}

	public Money getAcceptanceBillAmount() {
		return acceptanceBillAmount;
	}
	
	public void setAcceptanceBillAmount(Money acceptanceBillAmount) {
		if (acceptanceBillAmount == null) {
			this.acceptanceBillAmount = new Money(0, 0);
		} else {
			this.acceptanceBillAmount = acceptanceBillAmount;
		}
	}

	public Money getCreditLetterAmount() {
		return creditLetterAmount;
	}
	
	public void setCreditLetterAmount(Money creditLetterAmount) {
		if (creditLetterAmount == null) {
			this.creditLetterAmount = new Money(0, 0);
		} else {
			this.creditLetterAmount = creditLetterAmount;
		}
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