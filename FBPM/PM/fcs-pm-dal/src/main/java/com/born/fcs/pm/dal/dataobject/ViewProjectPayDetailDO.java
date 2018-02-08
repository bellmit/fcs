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
 * A data object class directly models database table <tt>view_project_pay_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/view_project_pay_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ViewProjectPayDetailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String projectCode;

	private String projectName;

	private long customerId;

	private String customerName;

	private String customerType;

	private String busiType;

	private String busiTypeName;

	private long busiManagerId;

	private String busiManagerAccount;

	private String busiManagerName;

	private Date startTime;

	private Date endTime;

	private Money balance = new Money(0, 0);

	private Money compPrincipalAmount = new Money(0, 0);

	private String feeType;

	private Money payAmount = new Money(0, 0);

	private Date payTime;

	private Date payConfirmTime;

	private String payAccount;

    //========== getters and setters ==========

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

	public Money getBalance() {
		return balance;
	}
	
	public void setBalance(Money balance) {
		if (balance == null) {
			this.balance = new Money(0, 0);
		} else {
			this.balance = balance;
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

	public String getFeeType() {
		return feeType;
	}
	
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public Money getPayAmount() {
		return payAmount;
	}
	
	public void setPayAmount(Money payAmount) {
		if (payAmount == null) {
			this.payAmount = new Money(0, 0);
		} else {
			this.payAmount = payAmount;
		}
	}

	public Date getPayTime() {
		return payTime;
	}
	
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getPayConfirmTime() {
		return payConfirmTime;
	}
	
	public void setPayConfirmTime(Date payConfirmTime) {
		this.payConfirmTime = payConfirmTime;
	}

	public String getPayAccount() {
		return payAccount;
	}
	
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
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
