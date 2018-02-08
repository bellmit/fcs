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
 * A data object class directly models database table <tt>f_risk_warning</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_risk_warning.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FRiskWarningDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long warningId;

	private long formId;

	private String warningBillType;

	private long customerId;

	private String customerName;

	private String signalLevel;

	private String specialSignal;

	private String specialSignalDesc;

	private String nomalSignal;

	private String nomalSignalDesc;

	private String riskSignalDetail;

	private String riskMeasure;

	private String liftingReason;

	private long srcWaningId;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getWarningId() {
		return warningId;
	}
	
	public void setWarningId(long warningId) {
		this.warningId = warningId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getWarningBillType() {
		return warningBillType;
	}
	
	public void setWarningBillType(String warningBillType) {
		this.warningBillType = warningBillType;
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

	public String getSignalLevel() {
		return signalLevel;
	}
	
	public void setSignalLevel(String signalLevel) {
		this.signalLevel = signalLevel;
	}

	public String getSpecialSignal() {
		return specialSignal;
	}
	
	public void setSpecialSignal(String specialSignal) {
		this.specialSignal = specialSignal;
	}

	public String getSpecialSignalDesc() {
		return specialSignalDesc;
	}
	
	public void setSpecialSignalDesc(String specialSignalDesc) {
		this.specialSignalDesc = specialSignalDesc;
	}

	public String getNomalSignal() {
		return nomalSignal;
	}
	
	public void setNomalSignal(String nomalSignal) {
		this.nomalSignal = nomalSignal;
	}

	public String getNomalSignalDesc() {
		return nomalSignalDesc;
	}
	
	public void setNomalSignalDesc(String nomalSignalDesc) {
		this.nomalSignalDesc = nomalSignalDesc;
	}

	public String getRiskSignalDetail() {
		return riskSignalDetail;
	}
	
	public void setRiskSignalDetail(String riskSignalDetail) {
		this.riskSignalDetail = riskSignalDetail;
	}

	public String getRiskMeasure() {
		return riskMeasure;
	}
	
	public void setRiskMeasure(String riskMeasure) {
		this.riskMeasure = riskMeasure;
	}

	public String getLiftingReason() {
		return liftingReason;
	}
	
	public void setLiftingReason(String liftingReason) {
		this.liftingReason = liftingReason;
	}

	public long getSrcWaningId() {
		return srcWaningId;
	}
	
	public void setSrcWaningId(long srcWaningId) {
		this.srcWaningId = srcWaningId;
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