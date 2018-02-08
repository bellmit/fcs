/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.rm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>regular_project_income_info_month</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/regular_project_income_info_month.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class RegularProjectIncomeInfoMonthDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String reportDate;

	private int reportYear;

	private int reportMonth;

	private long customerId;

	private String customerName;

	private String busiLicenseNo;

	private String projectCode;

	private String projectName;

	private Money incomeThisYear = new Money(0, 0);

	private Money incomeThisMonth = new Money(0, 0);

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public String getReportDate() {
		return reportDate;
	}
	
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public int getReportYear() {
		return reportYear;
	}
	
	public void setReportYear(int reportYear) {
		this.reportYear = reportYear;
	}

	public int getReportMonth() {
		return reportMonth;
	}
	
	public void setReportMonth(int reportMonth) {
		this.reportMonth = reportMonth;
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

	public String getBusiLicenseNo() {
		return busiLicenseNo;
	}
	
	public void setBusiLicenseNo(String busiLicenseNo) {
		this.busiLicenseNo = busiLicenseNo;
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

	public Money getIncomeThisYear() {
		return incomeThisYear;
	}
	
	public void setIncomeThisYear(Money incomeThisYear) {
		if (incomeThisYear == null) {
			this.incomeThisYear = new Money(0, 0);
		} else {
			this.incomeThisYear = incomeThisYear;
		}
	}

	public Money getIncomeThisMonth() {
		return incomeThisMonth;
	}
	
	public void setIncomeThisMonth(Money incomeThisMonth) {
		if (incomeThisMonth == null) {
			this.incomeThisMonth = new Money(0, 0);
		} else {
			this.incomeThisMonth = incomeThisMonth;
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
