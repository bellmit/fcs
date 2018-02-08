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

/**
 * A data object class directly models database table <tt>f_council_summary_project_guarantee</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_council_summary_project_guarantee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FCouncilSummaryProjectGuaranteeDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long spId;

	private long capitalChannelId;

	private String capitalChannelName;

	private long capitalSubChannelId;

	private String capitalSubChannelName;

	private double interestRate;

	private String interestRateFloat;

	private double guaranteeFee;

	private String guaranteeFeeType;

	private double totalCost;

	private String totalCostType;

	private double otherFee;

	private String otherFeeType;

	private String processFlag;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getSpId() {
		return spId;
	}
	
	public void setSpId(long spId) {
		this.spId = spId;
	}

	public long getCapitalChannelId() {
		return capitalChannelId;
	}
	
	public void setCapitalChannelId(long capitalChannelId) {
		this.capitalChannelId = capitalChannelId;
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

	public String getCapitalSubChannelName() {
		return capitalSubChannelName;
	}
	
	public void setCapitalSubChannelName(String capitalSubChannelName) {
		this.capitalSubChannelName = capitalSubChannelName;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getInterestRateFloat() {
		return interestRateFloat;
	}
	
	public void setInterestRateFloat(String interestRateFloat) {
		this.interestRateFloat = interestRateFloat;
	}

	public double getGuaranteeFee() {
		return guaranteeFee;
	}
	
	public void setGuaranteeFee(double guaranteeFee) {
		this.guaranteeFee = guaranteeFee;
	}

	public String getGuaranteeFeeType() {
		return guaranteeFeeType;
	}
	
	public void setGuaranteeFeeType(String guaranteeFeeType) {
		this.guaranteeFeeType = guaranteeFeeType;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public String getTotalCostType() {
		return totalCostType;
	}
	
	public void setTotalCostType(String totalCostType) {
		this.totalCostType = totalCostType;
	}

	public double getOtherFee() {
		return otherFee;
	}
	
	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public String getOtherFeeType() {
		return otherFeeType;
	}
	
	public void setOtherFeeType(String otherFeeType) {
		this.otherFeeType = otherFeeType;
	}

	public String getProcessFlag() {
		return processFlag;
	}
	
	public void setProcessFlag(String processFlag) {
		this.processFlag = processFlag;
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
