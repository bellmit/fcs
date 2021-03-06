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
 * A data object class directly models database table <tt>account_balance_data</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/account_balance_data.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class AccountBalanceDataDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long accountBalanceDataId;

	private long accountBalanceId;

	private String code;

	private String name;

	private String currency;

	private Money initialDebitBalance = new Money(0, 0);

	private Money initialCreditBalance = new Money(0, 0);

	private Money currentDebitAmount = new Money(0, 0);

	private Money currentCreditAmount = new Money(0, 0);

	private Money yearDebitAmount = new Money(0, 0);

	private Money yearCreditAmount = new Money(0, 0);

	private Money endingDebitBalance = new Money(0, 0);

	private Money endingCreditBalance = new Money(0, 0);

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getAccountBalanceDataId() {
		return accountBalanceDataId;
	}
	
	public void setAccountBalanceDataId(long accountBalanceDataId) {
		this.accountBalanceDataId = accountBalanceDataId;
	}

	public long getAccountBalanceId() {
		return accountBalanceId;
	}
	
	public void setAccountBalanceId(long accountBalanceId) {
		this.accountBalanceId = accountBalanceId;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Money getInitialDebitBalance() {
		return initialDebitBalance;
	}
	
	public void setInitialDebitBalance(Money initialDebitBalance) {
		if (initialDebitBalance == null) {
			this.initialDebitBalance = new Money(0, 0);
		} else {
			this.initialDebitBalance = initialDebitBalance;
		}
	}

	public Money getInitialCreditBalance() {
		return initialCreditBalance;
	}
	
	public void setInitialCreditBalance(Money initialCreditBalance) {
		if (initialCreditBalance == null) {
			this.initialCreditBalance = new Money(0, 0);
		} else {
			this.initialCreditBalance = initialCreditBalance;
		}
	}

	public Money getCurrentDebitAmount() {
		return currentDebitAmount;
	}
	
	public void setCurrentDebitAmount(Money currentDebitAmount) {
		if (currentDebitAmount == null) {
			this.currentDebitAmount = new Money(0, 0);
		} else {
			this.currentDebitAmount = currentDebitAmount;
		}
	}

	public Money getCurrentCreditAmount() {
		return currentCreditAmount;
	}
	
	public void setCurrentCreditAmount(Money currentCreditAmount) {
		if (currentCreditAmount == null) {
			this.currentCreditAmount = new Money(0, 0);
		} else {
			this.currentCreditAmount = currentCreditAmount;
		}
	}

	public Money getYearDebitAmount() {
		return yearDebitAmount;
	}
	
	public void setYearDebitAmount(Money yearDebitAmount) {
		if (yearDebitAmount == null) {
			this.yearDebitAmount = new Money(0, 0);
		} else {
			this.yearDebitAmount = yearDebitAmount;
		}
	}

	public Money getYearCreditAmount() {
		return yearCreditAmount;
	}
	
	public void setYearCreditAmount(Money yearCreditAmount) {
		if (yearCreditAmount == null) {
			this.yearCreditAmount = new Money(0, 0);
		} else {
			this.yearCreditAmount = yearCreditAmount;
		}
	}

	public Money getEndingDebitBalance() {
		return endingDebitBalance;
	}
	
	public void setEndingDebitBalance(Money endingDebitBalance) {
		if (endingDebitBalance == null) {
			this.endingDebitBalance = new Money(0, 0);
		} else {
			this.endingDebitBalance = endingDebitBalance;
		}
	}

	public Money getEndingCreditBalance() {
		return endingCreditBalance;
	}
	
	public void setEndingCreditBalance(Money endingCreditBalance) {
		if (endingCreditBalance == null) {
			this.endingCreditBalance = new Money(0, 0);
		} else {
			this.endingCreditBalance = endingCreditBalance;
		}
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
